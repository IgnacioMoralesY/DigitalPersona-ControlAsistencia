package clases;

import GUI.Main;
import Utils.UtilsDate;
import com.digitalpersona.onetouch.DPFPDataPurpose;
import com.digitalpersona.onetouch.DPFPFeatureSet;
import com.digitalpersona.onetouch.DPFPGlobal;
import com.digitalpersona.onetouch.DPFPSample;
import com.digitalpersona.onetouch.DPFPTemplate;
import com.digitalpersona.onetouch.processing.DPFPEnrollment;
import com.digitalpersona.onetouch.verification.DPFPVerification;
import com.digitalpersona.onetouch.verification.DPFPVerificationResult;
import entity.Asistencia;
import entity.Huella;
import entity.Usuario;
import java.util.Date;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class LeerHuella extends GUI.CapturarHuella{
    public static Usuario usuario = new Usuario();
    
    private DPFPEnrollment enrollador;
    private DPFPVerification verificador = DPFPGlobal.getVerificationFactory().createVerification();
    private DPFPTemplate plantillaHuella;
    
    private DPFPVerificationResult resultado = null;
    private DPFPFeatureSet caracteristicas = null;
    
     private DPFPVerificationResult resultado2 = null;
    private DPFPFeatureSet caracteristicas2 = null;
    
    private boolean BUSCAR = false;
    private boolean verificar = false;
    private Main superMain = null;
    
    public LeerHuella(java.awt.Dialog parent, boolean modal, Main frame) {
        super(parent, modal);
        this.superMain = frame;
        
        try {
            enrollador = DPFPGlobal.getEnrollmentFactory().createEnrollment();            
        } catch (java.lang.UnsatisfiedLinkError | java.lang.NoClassDefFoundError e) {
            setVisible(false);
        }
    }

    @Override
    protected void procesarHuella(DPFPSample sample) {
        super.procesarHuella(sample);
        System.out.println("ESTOY PROCESANDO");
        if(isVerificar()){
            caracteristicas2 = extractFeatures(sample, DPFPDataPurpose.DATA_PURPOSE_VERIFICATION);
        }
        
        caracteristicas = extractFeatures(sample, isBUSCAR()?DPFPDataPurpose.DATA_PURPOSE_VERIFICATION:DPFPDataPurpose.DATA_PURPOSE_ENROLLMENT);
        
        if(isVerificar()){
            System.out.println("ESTOY ACA");
            boolean encontrado = false;
            
            List<Huella> listHuellas = GenericDao.getHuellas();
            usuario = new Usuario();
            
            for(Huella huella : listHuellas){
                if(huella.getHuella() != null){
                    resultado2 = verificador.verify(caracteristicas2, DPFPGlobal.getTemplateFactory().createTemplate(huella.getHuella()));
                    if(resultado2.isVerified()){
                        encontrado = true;
                        break;
                    }
                }
            }
            
            if(encontrado){
                System.out.println("LA ENCONTRE");
                JOptionPane.showMessageDialog(this, "Error, Esta huella ya le pertenece a un usuario, cierre y vuelva a abrir el lector e ingrese una huella que no se encuentre registrada! ");
                this.cerrar();
            }
        } 
        
        
        if(isBUSCAR()){                 
            boolean encontrado = false;
            Long idUsuario = 0l;
            
            List<Huella> listHuellas = GenericDao.getHuellas();
            usuario = new Usuario();
            
            for(Huella huella : listHuellas){
                if(huella.getHuella() != null){
                    resultado = verificador.verify(caracteristicas, DPFPGlobal.getTemplateFactory().createTemplate(huella.getHuella()));
                    if(resultado.isVerified()){
                        idUsuario = huella.getIdUsuario();
                        encontrado = true;
                        break;
                    }
                }
            }
            
            if(encontrado){
                usuario = GenericDao.getUsuario_ById(idUsuario);
                
                if(usuario.getBloqueado() == 0){
                    Asistencia asistencia = GenericDao.getLastAsistencias_byIdUsuario(usuario.getId(), this.superMain.idTienda);
                    Date fechaActual = new Date();
                    int horaActual = UtilsDate.getHourOfDay(fechaActual);
                    int minutoActual = UtilsDate.getMinuteOfDay(fechaActual);

                    int horaFecha = 0;
                    int minutoFecha = 0;

                    boolean nuevoRegistro = false;
                    boolean continuar = true;

                    if(asistencia != null){
                        try{
                            Date fechaFin = asistencia.getFechaSalida();
                            Date entrada = asistencia.getFechaEntrada();

                            if(fechaFin != null){
                                int year = UtilsDate.getYear(fechaFin);

                                if(year > 1500){
                                    horaFecha = UtilsDate.getHourOfDay(fechaFin);
                                    minutoFecha = UtilsDate.getMinuteOfDay(fechaFin);
                                    nuevoRegistro = true;
                                }else{
                                    horaFecha = UtilsDate.getHourOfDay(entrada);
                                    minutoFecha = UtilsDate.getMinuteOfDay(entrada);
                                }   

                            }else{
                                horaFecha = UtilsDate.getHourOfDay(entrada);
                                minutoFecha = UtilsDate.getMinuteOfDay(entrada);
                            }

                            if(horaActual == horaFecha && minutoActual < (minutoFecha + 9) ){
                                continuar = false;
                            }

                        }catch(Throwable e){
                            e.printStackTrace();
                        }
                    }else{
                        nuevoRegistro = true;
                    }

                    String message = "Error, No se ha podido guardar la asistencia para el usuario    " + usuario.getRut() + "   " + usuario.getNombre() ;
                    if(continuar){
                        boolean isValid = false;

                        if(nuevoRegistro){
                            isValid = GenericDao.guardarAsistenciaEntrada(usuario.getId(), this.superMain.idTienda);
                        }else{
                            isValid = GenericDao.guardarAsistenciaSalida(asistencia.getId(), asistencia.getFechaEntrada());
                        }

                        if(isValid){
                            message = "" ;
                        }
                    }else{
                        String sub = "INICIASTE";
                        if(nuevoRegistro){
                            sub = "TERMINASTE";
                        }
                        message = "Error, ha pasado muy poco tiempo desde que    '"+sub+"'    tu turno, vuelve en un rato más. " ;
                    }

                    this.superMain.setearDatosUsuarioEncontrado(usuario, continuar, nuevoRegistro, message, fechaActual); 
                    this.cerrar();
                    
                }else{
                    JOptionPane.showMessageDialog(this, " El usuario no tiene los permisos para ingresar en el sistema! ");
                }
            }else{
                JOptionPane.showMessageDialog(this, " No existe un registro para esta huella, solicite en el menu superior 'Registrar Trabajador' ! ");
            }
        }
        
        if(caracteristicas != null){
            try {
                enrollador.addFeatures(caracteristicas);
            } catch (Exception e) {
            }finally{
                switch(enrollador.getFeaturesNeeded()){
                    case 4:
                        lblPasos.setIcon(new ImageIcon(getClass().getResource("/img/paso0.png")));
                        break;
                    case 3:
                        lblPasos.setIcon(new ImageIcon(getClass().getResource("/img/paso1.png")));                               
                        break;
                    case 2:
                        lblPasos.setIcon(new ImageIcon(getClass().getResource("/img/paso2.png")));
                        break;
                    case 1:
                        lblPasos.setIcon(new ImageIcon(getClass().getResource("/img/paso3.png")));
                        break;
                    case 0:
                        lblPasos.setIcon(new ImageIcon(getClass().getResource("/img/paso4.png")));
                        break;
                }
                
                switch(enrollador.getTemplateStatus()){
                    case TEMPLATE_STATUS_READY:
                        stop();
                        plantillaHuella = enrollador.getTemplate();
                        setVisible(false);
                        break;

                    case TEMPLATE_STATUS_FAILED:
                        enrollador.clear();
                        stop();
                        plantillaHuella = null;
                        lblPasos.setIcon(new ImageIcon(getClass().getResource("/img/paso0.png")));                        
                        start();
                        break;                                
                    default: break;
                }
                
                
            }
        }
    }

    public boolean isBUSCAR() {
        return BUSCAR;
    }

    public void setBUSCAR(boolean buscar) {
        this.BUSCAR = buscar;
    }

    public DPFPTemplate getPlantillaHuella() {
        return plantillaHuella;
    }

    public void setPlantillaHuella(DPFPTemplate plantillaHuella) {
        this.plantillaHuella = plantillaHuella;
    }

    public boolean isVerificar() {
        return verificar;
    }

    public void setVerificar(boolean verificar) {
        this.verificar = verificar;
    }
    
    
    
    
}
