/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import clases.GenericDao;
import clases.LeerHuella;

import entity.Huella;
import entity.Usuario;
import javax.swing.JOptionPane;
import java.util.List;
import java.util.Arrays;

/**
 *
 * @author Ignacio
 */
public class RegistrarTrabajador extends javax.swing.JFrame {
    private byte[] huella = null;
 
    /**
     * Creates new form RegistrarTrabajador
     */
    public RegistrarTrabajador() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblNombre = new javax.swing.JLabel();
        txtRut = new javax.swing.JTextField();
        lblApellido = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        lblRut = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblReqRut = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnGuardarTrabajador = new javax.swing.JButton();
        btnLeerHuella = new javax.swing.JButton();
        txtIdUsuario = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuAcciones = new javax.swing.JMenu();
        SubMenuAsistencia = new javax.swing.JMenuItem();
        SubMenuSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Calibri", 2, 48)); // NOI18N
        jLabel2.setText("Registrar Trabajador");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblNombre.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblNombre.setText("Nombre");

        txtRut.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtRut.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtRut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRutActionPerformed(evt);
            }
        });

        lblApellido.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblApellido.setText("Apellido");

        txtApellido.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtApellido.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtApellido.setEnabled(false);

        lblRut.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblRut.setText("Rut");

        txtNombre.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtNombre.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtNombre.setEnabled(false);

        lblReqRut.setFont(new java.awt.Font("Calibri", 2, 12)); // NOI18N
        lblReqRut.setText("ejemplo: 19123456-7");

        btnBuscar.setText("Buscar");
        btnBuscar.setBorder(null);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(null);
        btnCancelar.setEnabled(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblNombre)
                        .addGap(18, 18, 18)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblRut)
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblReqRut)
                            .addComponent(txtRut, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblApellido)
                        .addGap(18, 18, 18)
                        .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRut)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(lblReqRut)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblApellido)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        btnGuardarTrabajador.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        btnGuardarTrabajador.setText("Guardar Trabajador");
        btnGuardarTrabajador.setEnabled(false);
        btnGuardarTrabajador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarTrabajadorActionPerformed(evt);
            }
        });

        btnLeerHuella.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        btnLeerHuella.setText("Tomar Huella");
        btnLeerHuella.setEnabled(false);
        btnLeerHuella.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLeerHuellaActionPerformed(evt);
            }
        });

        txtIdUsuario.setEnabled(false);

        menuAcciones.setText("Acciones");

        SubMenuAsistencia.setText("Tomar Asistencia");
        SubMenuAsistencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubMenuAsistenciaActionPerformed(evt);
            }
        });
        menuAcciones.add(SubMenuAsistencia);

        SubMenuSalir.setText("Salir");
        SubMenuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubMenuSalirActionPerformed(evt);
            }
        });
        menuAcciones.add(SubMenuSalir);

        jMenuBar1.add(menuAcciones);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(124, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(txtIdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLeerHuella)
                .addGap(18, 18, 18)
                .addComponent(btnGuardarTrabajador)
                .addGap(144, 144, 144))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel2)
                .addGap(32, 32, 32)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLeerHuella)
                    .addComponent(btnGuardarTrabajador)
                    .addComponent(txtIdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SubMenuAsistenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubMenuAsistenciaActionPerformed
        Main main = new Main();
        main.setVisible(true);
        
        this.setVisible(false);
    }//GEN-LAST:event_SubMenuAsistenciaActionPerformed

    private void btnGuardarTrabajadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarTrabajadorActionPerformed
        if(txtIdUsuario.getText() == null || txtIdUsuario.getText().length() == 0){
            JOptionPane.showMessageDialog(this, "Ha ocurrido un Error, intente volver a abrir este panel, cambie a 'Tomar Asistencia' y luego vuelva a entrar aqui ");
        }else{
            if(huella != null){
                boolean isValido = GenericDao.guardarHuella(huella, txtIdUsuario.getText());
                if(isValido){
                    JOptionPane.showMessageDialog(this, "Usuario Registrado con exito!");
                    cleanView();
                }else{
                    JOptionPane.showMessageDialog(this, "Error al registrar usuario!, lo lamentamos.");
                }
            }else{
                JOptionPane.showMessageDialog(this, "No se ha podido encontrar la Huella, intente volver a cargarla.");
            }
            
        }
            
    }//GEN-LAST:event_btnGuardarTrabajadorActionPerformed

    private void btnLeerHuellaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLeerHuellaActionPerformed
        JOptionPane.showMessageDialog(this, "Debe poner el dedo indice del trabajador en el lector 4 veces para que quede registrado.\nLuego debe presionar el boton 'Guardar Trabajador' !!");
        
        LeerHuella lh = new LeerHuella(null, true, null);
        lh.setVerificar(true);
        lh.setVisible(true);
        
        
        try{
            if(lh.getPlantillaHuella() != null){
                huella = lh.getPlantillaHuella().serialize();
                
                if(huella != null){ 
                    btnGuardarTrabajador.setEnabled(true);
                }
            }
        }catch(Throwable e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnLeerHuellaActionPerformed

    private void SubMenuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubMenuSalirActionPerformed
        dispose();
        System.exit(1);
    }//GEN-LAST:event_SubMenuSalirActionPerformed

    private void txtRutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRutActionPerformed
        
    }//GEN-LAST:event_txtRutActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        if(txtRut.getText() == null || txtRut.getText().length() == 0){
            JOptionPane.showMessageDialog(this, "Debe ingresar un Rut para poder buscar!");
        }else{
            Usuario usuario = GenericDao.getUsuario_ByRut(txtRut.getText());
            
            if(usuario == null){
                JOptionPane.showMessageDialog(this, "Rut ingresado no existe en el sistema. Si desea crear un nuevo trabajador, debe informarlo al administrador del sitio!");
            }else if(usuario.getBloqueado() == 1){
                JOptionPane.showMessageDialog(this, " El usuario no tiene los permisos para registrar su huella en el sistema! ");
            }else{

                Huella huella = GenericDao.getHuella_byIdUsuario(usuario.getId());
                
                if(huella == null){
                    txtIdUsuario.setText(usuario.getId()+"");
                    txtNombre.setText(usuario.getNombre());
                    txtApellido.setText(usuario.getApellido());
                    txtRut.setEnabled(false);

                    btnBuscar.setEnabled(false);
                    btnCancelar.setEnabled(true);
                    btnLeerHuella.setEnabled(true);
                }else{
                    JOptionPane.showMessageDialog(this, "El trabajador     " + usuario.getRut() + "       ya posee una huella registrada.\nSi desea actualizarla/Cambiarla debe pedir al administrador que desvicule su huella activa. ");
                }
            }
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    public void cleanView(){
        txtIdUsuario.setText("");
        txtRut.setText("");
        txtRut.setEnabled(true);

        txtNombre.setText("");
        txtApellido.setText("");
        btnGuardarTrabajador.setEnabled(false);
        btnLeerHuella.setEnabled(false);
        btnBuscar.setEnabled(true);
        btnCancelar.setEnabled(false);
        huella = null;
    }
    
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        cleanView();
    }//GEN-LAST:event_btnCancelarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegistrarTrabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarTrabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarTrabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarTrabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarTrabajador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem SubMenuAsistencia;
    private javax.swing.JMenuItem SubMenuSalir;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardarTrabajador;
    private javax.swing.JButton btnLeerHuella;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblReqRut;
    private javax.swing.JLabel lblRut;
    private javax.swing.JMenu menuAcciones;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtIdUsuario;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRut;
    // End of variables declaration//GEN-END:variables
}
