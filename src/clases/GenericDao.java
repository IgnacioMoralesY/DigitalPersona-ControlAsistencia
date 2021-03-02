package clases;

import GUI.Main;
import Utils.UtilsDate;
import clases.ConexionBD;
import com.digitalpersona.onetouch.DPFPGlobal;
import entity.Asistencia;
import entity.Huella;
import entity.Usuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ignacio
 */
public class GenericDao {
    
    public static List<Usuario> getUsuarios(){
        List<Usuario> listUsuarios = new ArrayList<>();
        Usuario user;
        
        String sql = "SELECT * FROM usuarios;";
        ConexionBD con = new ConexionBD();
        con.conectar();
        try {
            ResultSet rs = con.CONSULTAR(sql);
            while(rs.next()){
                user = new Usuario();
                user.setId(rs.getLong("ID"));
                user.setNombre(rs.getString("NOMBRE"));
                user.setApellido(rs.getString("APELLIDO"));
                user.setRut(rs.getString("RUT"));
                user.setEmail(rs.getString("EMAIL"));
                user.setRol(rs.getLong("ROL"));
                user.setPassword(rs.getString("PASSWORD"));
                user.setFechaRegistro(rs.getDate("FECHA_REGISTRO"));
                user.setBloqueado(rs.getLong("BLOQUEADO"));
                
                listUsuarios.add(user);
            } 
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            con.CERRAR();
        }        
        
        return listUsuarios;
    }
    
    public static Usuario getUsuario_ById(long idUsuario){
        Usuario user = new Usuario();
        
        String sql = "SELECT * FROM usuarios WHERE ID = "+idUsuario+";";
        ConexionBD con = new ConexionBD();
        con.conectar();
        try {
            ResultSet rs = con.CONSULTAR(sql);
            while(rs.next()){
                user = new Usuario();
                user.setId(rs.getLong("ID"));
                user.setNombre(rs.getString("NOMBRE"));
                user.setApellido(rs.getString("APELLIDO"));
                user.setRut(rs.getString("RUT"));
                user.setEmail(rs.getString("EMAIL"));
                user.setRol(rs.getLong("ROL"));
                user.setPassword(rs.getString("PASSWORD"));
                user.setFechaRegistro(rs.getDate("FECHA_REGISTRO"));
                user.setBloqueado(rs.getLong("BLOQUEADO"));
                break;
            } 
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            con.CERRAR();
        }        
        
        return user;
    }
    
    public static Usuario getUsuario_ByRut(String rut){
        Usuario user = null;
        
        String sql = "SELECT * FROM usuarios WHERE RUT = '"+rut+"';";
        ConexionBD con = new ConexionBD();
        con.conectar();
        try {
            ResultSet rs = con.CONSULTAR(sql);
            while(rs.next()){
                user = new Usuario();
                user.setId(rs.getLong("ID"));
                user.setNombre(rs.getString("NOMBRE"));
                user.setApellido(rs.getString("APELLIDO"));
                user.setRut(rs.getString("RUT"));
                user.setEmail(rs.getString("EMAIL"));
                user.setRol(rs.getLong("ROL"));
                user.setPassword(rs.getString("PASSWORD"));
                user.setFechaRegistro(rs.getDate("FECHA_REGISTRO"));
                user.setBloqueado(rs.getLong("BLOQUEADO"));
                break;
            } 
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            user = null;
        }finally{
            con.CERRAR();
        }        
        
        return user;
    }
    
    public static Usuario getUsuario_ByRut(String rut, ConexionBD con){
        Usuario user = new Usuario();
        
        String sql = "SELECT * FROM usuarios WHERE RUT = '"+rut+"';";

        try {
            ResultSet rs = con.CONSULTAR(sql);
            while(rs.next()){
                user = new Usuario();
                user.setId(rs.getLong("ID"));
                user.setNombre(rs.getString("NOMBRE"));
                user.setApellido(rs.getString("APELLIDO"));
                user.setRut(rs.getString("RUT"));
                user.setEmail(rs.getString("EMAIL"));
                user.setRol(rs.getLong("ROL"));
                user.setPassword(rs.getString("PASSWORD"));
                user.setFechaRegistro(rs.getDate("FECHA_REGISTRO"));
                user.setBloqueado(rs.getLong("BLOQUEADO"));
                
                break;
            } 
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }      
        
        return user;
    }
    
    public static Huella getHuella_byIdUsuario(long idUsuario){
        Huella huella = null;
        
        String sql = "SELECT * FROM usuario_huellas WHERE ID_USUARIO = "+idUsuario+";";
        ConexionBD con = new ConexionBD();
        con.conectar();
        try {
            ResultSet rs = con.CONSULTAR(sql);
            while(rs.next()){
                huella = new Huella();
                huella.setId(rs.getLong("ID"));
                huella.setIdUsuario(rs.getLong("ID_USUARIO"));
                huella.setHuella(rs.getBytes("HUELLA"));
                break;
            } 
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            huella = null;
        }finally{
            con.CERRAR();
        }        
        
        return huella;
    }
    public static List<Huella> getHuellas(){
        List<Huella> listHuella = new ArrayList<>();
        Huella huella;
        
        String sql = "SELECT * FROM usuario_huellas;";
        ConexionBD con = new ConexionBD();
        con.conectar();
        try {
            ResultSet rs = con.CONSULTAR(sql);
            while(rs.next()){
                huella = new Huella();
                huella.setId(rs.getLong("ID"));
                huella.setIdUsuario(rs.getLong("ID_USUARIO"));
                huella.setHuella(rs.getBytes("HUELLA"));
                
                listHuella.add(huella);
            } 
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            con.CERRAR();
        }        
        
        return listHuella;
    }
    /*
    public static List<Asistencia> getAsistencias(){
        List<Asistencia> listAsistencia = new ArrayList<>();
        Asistencia asistencia;
        
        String sql = "SELECT * FROM asistencias;";
        ConexionBD con = new ConexionBD();
        con.conectar();
        try {
            ResultSet rs = con.CONSULTAR(sql);
            while(rs.next()){
                asistencia = new Asistencia();
                asistencia.setId(rs.getLong("ID"));
                asistencia.setIdUsuario(rs.getLong("ID_USUARIO"));
                asistencia.setTipo(rs.getLong("TIPO"));
                asistencia.setFechaAsistencia(rs.getTimestamp("FECHA_ASISTENCIA"));
                
                listAsistencia.add(asistencia);
            } 
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            con.CERRAR();
        }        
        
        return listAsistencia;
    }
    */
    /*
    public static List<Asistencia> getAsistencias_byIdUsuario(long idUsuario){
        List<Asistencia> listAsistencia = new ArrayList<>();
        Asistencia asistencia;
        
        String sql = "SELECT * FROM asistencias WHERE ID_USUARIO = "+idUsuario+";";
        ConexionBD con = new ConexionBD();
        con.conectar();
        try {
            ResultSet rs = con.CONSULTAR(sql);
            while(rs.next()){
                asistencia = new Asistencia();
                asistencia.setId(rs.getLong("ID"));
                asistencia.setIdUsuario(rs.getLong("ID_USUARIO"));
                asistencia.setTipo(rs.getLong("TIPO"));
                asistencia.setFechaAsistencia(rs.getTimestamp("FECHA_ASISTENCIA"));
                
                listAsistencia.add(asistencia);
            } 
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            con.CERRAR();
        }        
        
        return listAsistencia;
    }*/
    /*
    public static List<Asistencia> getAsistencias_byIdUsuarioAndFechaAsistencia(long idUsuario){
        List<Asistencia> listAsistencia = new ArrayList<>();
        Asistencia asistencia;
        Date fechaActualInicial = UtilsDate.getDateSinTiempo(new Date());
        String inicio = UtilsDate.getDate2String(fechaActualInicial, "dd/MM/yyyy HH:mm:ss");
        
        Date fechaActualFinal = UtilsDate.getString2Date(UtilsDate.getDate2String(fechaActualInicial, "dd/MM/yyyy")+ " 23:59:59", "dd/MM/yyyy HH:mm:ss");
        String termino = UtilsDate.getDate2String(fechaActualFinal, "dd/MM/yyyy HH:mm:ss");
        
        System.out.println("Fecha inicio: " + inicio);
        System.out.println("Fecha termino: " + termino);
        
        String sql = "SELECT * FROM asistencias WHERE ID_USUARIO = "+idUsuario+" AND FECHA_ASISTENCIA >= '"+inicio+"' AND FECHA_ASISTENCIA <= '"+termino+"' ;";
        System.out.println("SQL: " + sql);
        
        ConexionBD con = new ConexionBD();
        con.conectar();
        try {
            ResultSet rs = con.CONSULTAR(sql);
            while(rs.next()){
                asistencia = new Asistencia();
                asistencia.setId(rs.getLong("ID"));
                asistencia.setIdUsuario(rs.getLong("ID_USUARIO"));
                asistencia.setTipo(rs.getLong("TIPO"));
                asistencia.setFechaAsistencia(rs.getTimestamp("FECHA_ASISTENCIA"));
                
                listAsistencia.add(asistencia);
            } 
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            con.CERRAR();
        }        
        
        
        return listAsistencia;
    }
    */
    
    public static Asistencia getLastAsistencias_byIdUsuario(long idUsuario, long idTienda){
        Asistencia asistencia = null;
        
        String sql = "SELECT * FROM asistencias WHERE ID_USUARIO = "+idUsuario+" AND ID_TIENDA = "+idTienda+" order by id Desc limit 1 ;";
        System.out.println("SQL: " + sql);
        
        ConexionBD con = new ConexionBD();
        con.conectar();
        try {
            ResultSet rs = con.CONSULTAR(sql);
            while(rs.next()){
                asistencia = new Asistencia();
                asistencia.setId(rs.getLong("ID"));
                asistencia.setIdUsuario(rs.getLong("ID_USUARIO"));
                asistencia.setIdTienda(rs.getLong("ID_TIENDA"));
                asistencia.setFechaEntrada(rs.getTimestamp("FECHA_ENTRADA"));
                try{
                    asistencia.setFechaSalida(rs.getTimestamp("FECHA_SALIDA"));
                }catch(Throwable e){
                    asistencia.setFechaSalida(null);
                }

                break;
            } 
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            con.CERRAR();
        }        
        
        return asistencia;
    }
    
    
    public static boolean guardarHuella(byte[] huella, String idUsuario){
        boolean isValid = false;
        
        String sql = "INSERT INTO usuario_huellas (ID_USUARIO,HUELLA) VALUES( "+Long.parseLong(idUsuario)+",?);";
        
        try{
            ConexionBD con = new ConexionBD();
            con.conectar();

            try {
                PreparedStatement pst = con.getConexion().prepareStatement(sql);
                pst.setBytes(1, huella);
                pst.executeUpdate();
                
                isValid = true;
            } catch (SQLException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }finally{
                con.CERRAR();
            }  
        }catch(Throwable e){
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, e);
        }
                
        return isValid;
    }
    
    
    public static boolean guardarAsistenciaEntrada(Long idUsuario, Long idTienda){
        boolean isValid = false;
        StringBuilder sql = new StringBuilder();
        sql.append("INSERT INTO asistencias (ID_USUARIO,ID_TIENDA, FECHA_ENTRADA) VALUES(");        
        Date fechaActual = new Date();
        
        try{
            sql.append(idUsuario+" ,");
            sql.append(idTienda+" ,");
            sql.append("STR_TO_DATE(\""+UtilsDate.getDate2String(fechaActual, "dd/MM/yyyy HH:mm:ss")+"\", \"%d/%m/%Y %H:%i:%s\") ); ");
            
            String sqlFinal = sql.toString();
            System.out.println("SQL: " + sqlFinal);
            
            ConexionBD con = new ConexionBD();
            con.conectar();
            try {
                PreparedStatement pst = con.getConexion().prepareStatement(sqlFinal);
                pst.executeUpdate();
                isValid = true;

            } catch (SQLException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }finally{
                con.CERRAR();
            }        
        }catch(Throwable e){
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, e);
        }

        return isValid;
    }
    
    public static boolean guardarAsistenciaSalida(Long idAsistencia, Date fechaEntrada){
        boolean isValid = false;
        String sql = "";
        Date fechaActual = new Date();
        
        sql = "UPDATE asistencias SET fecha_salida = STR_TO_DATE(\""+UtilsDate.getDate2String(fechaActual, "dd/MM/yyyy HH:mm:ss")+"\", \"%d/%m/%Y %H:%i:%s\"), fecha_entrada = STR_TO_DATE(\""+UtilsDate.getDate2String(fechaEntrada, "dd/MM/yyyy HH:mm:ss")+"\", \"%d/%m/%Y %H:%i:%s\") WHERE id= "+idAsistencia+"; ";        

        try{

            System.out.println("SQL: " + sql);
            
            ConexionBD con = new ConexionBD();
            con.conectar();
            try {
                PreparedStatement pst = con.getConexion().prepareStatement(sql);
                pst.executeUpdate();
                isValid = true;

            } catch (SQLException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }finally{
                con.CERRAR();
            }        
        }catch(Throwable e){
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, e);
        }

        return isValid;
    }
    
    public static boolean eliminarUsuario(Long idUsuario){
        boolean isValid = false;
        String sql = "DELETE FROM usuarios WHERE ID = "+idUsuario+"; ";
  
        try{
            System.out.println("SQL: " + sql);
            
            ConexionBD con = new ConexionBD();
            con.conectar();
            try {
                PreparedStatement pst = con.getConexion().prepareStatement(sql);
                pst.executeUpdate();
                isValid = true;
            } catch (SQLException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }finally{
                con.CERRAR();
            }        
        }catch(Throwable e){
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, e);
        }

        return isValid;
    }
}
