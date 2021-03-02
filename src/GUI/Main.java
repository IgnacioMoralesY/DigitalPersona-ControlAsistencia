package GUI;

import Utils.UtilsDate;
import clases.LeerHuella;
import entity.Usuario;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import javax.swing.JOptionPane;


public class Main extends javax.swing.JFrame {
    private byte[] huella = null;
    public static Long idTienda = 1l;

    public Main() {
        initComponents();
        
        DateTimeFormatter formateador = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(500);
                        lblFecha.setText(formateador.format(LocalDateTime.now()));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        Thread hilo = new Thread(runnable);
        hilo.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        lblMensaje = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblNombre = new javax.swing.JLabel();
        txtRut = new javax.swing.JTextField();
        lblApellido = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        lblRut = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        panelConfirmacion = new javax.swing.JPanel();
        btnConfirmar = new javax.swing.JButton();
        lblConfirmacion2 = new javax.swing.JLabel();
        lblConfirmacion3 = new javax.swing.JLabel();
        lblConfirmacion1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblConfirmacionHora = new javax.swing.JLabel();
        lblConfirmacionHora1 = new javax.swing.JLabel();
        btnAbrirLector = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuAcciones = new javax.swing.JMenu();
        SubMenuRegistrarNuevoTrabajador = new javax.swing.JMenuItem();
        SubMenuSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Calibri", 2, 48)); // NOI18N
        jLabel2.setText("Control de Asistencia");

        lblFecha.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        lblFecha.setText("23/02/2021 15:45:30");

        lblMensaje.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lblMensaje.setText("Ponga su huella en el lector para Iniciar o Terminar su turno!");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblNombre.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lblNombre.setText("Nombre");

        txtRut.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        txtRut.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtRut.setEnabled(false);

        lblApellido.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lblApellido.setText("Apellido");

        txtApellido.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        txtApellido.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtApellido.setEnabled(false);

        lblRut.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lblRut.setText("Rut");

        txtNombre.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        txtNombre.setToolTipText("");
        txtNombre.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtNombre.setEnabled(false);

        panelConfirmacion.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnConfirmar.setText("Limpiar");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        lblConfirmacion2.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        lblConfirmacion2.setForeground(new java.awt.Color(0, 51, 204));
        lblConfirmacion2.setText("FINALIZADO");

        lblConfirmacion3.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lblConfirmacion3.setText("Tu turno exitosamente !");

        lblConfirmacion1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lblConfirmacion1.setText("Has");

        jLabel1.setText("Preciona el botón Confirmar para limpiar tus datos!");

        lblConfirmacionHora.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        lblConfirmacionHora.setForeground(new java.awt.Color(0, 51, 204));
        lblConfirmacionHora.setText("21:45");

        lblConfirmacionHora1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lblConfirmacionHora1.setText("A las");

        javax.swing.GroupLayout panelConfirmacionLayout = new javax.swing.GroupLayout(panelConfirmacion);
        panelConfirmacion.setLayout(panelConfirmacionLayout);
        panelConfirmacionLayout.setHorizontalGroup(
            panelConfirmacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConfirmacionLayout.createSequentialGroup()
                .addGroup(panelConfirmacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelConfirmacionLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(lblConfirmacion1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblConfirmacion2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblConfirmacion3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelConfirmacionLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelConfirmacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelConfirmacionLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(42, 42, 42))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelConfirmacionLayout.createSequentialGroup()
                                .addComponent(lblConfirmacionHora1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblConfirmacionHora)
                                .addGap(122, 122, 122)))))
                .addComponent(btnConfirmar)
                .addGap(19, 19, 19))
        );
        panelConfirmacionLayout.setVerticalGroup(
            panelConfirmacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConfirmacionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelConfirmacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblConfirmacion2)
                    .addComponent(lblConfirmacion3)
                    .addComponent(lblConfirmacion1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelConfirmacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblConfirmacionHora)
                    .addComponent(lblConfirmacionHora1))
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(panelConfirmacionLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(btnConfirmar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblRut)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtRut, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblNombre)
                                .addGap(18, 18, 18)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(32, 32, 32)
                        .addComponent(lblApellido)
                        .addGap(18, 18, 18)
                        .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(panelConfirmacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRut))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblApellido)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(panelConfirmacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(32, 32, 32))
        );

        btnAbrirLector.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnAbrirLector.setText("Abrir Lector de huella");
        btnAbrirLector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirLectorActionPerformed(evt);
            }
        });

        menuAcciones.setText("Acciones");

        SubMenuRegistrarNuevoTrabajador.setText("Registrar Trabajador");
        SubMenuRegistrarNuevoTrabajador.setToolTipText("");
        SubMenuRegistrarNuevoTrabajador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubMenuRegistrarNuevoTrabajadorActionPerformed(evt);
            }
        });
        menuAcciones.add(SubMenuRegistrarNuevoTrabajador);

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblFecha)
                .addGap(281, 281, 281))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(171, 171, 171)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnAbrirLector))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(231, 231, 231)
                            .addComponent(jLabel2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addComponent(lblMensaje)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(btnAbrirLector, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblFecha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblMensaje)
                .addGap(37, 37, 37))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void setearDatosUsuarioEncontrado(Usuario usuario, boolean status, boolean isEntrada, String message, Date fecha){
      
        if(status){
            txtRut.setText(usuario.getRut());
            txtNombre.setText(usuario.getNombre());
            txtApellido.setText(usuario.getApellido());
            lblConfirmacionHora.setText(UtilsDate.getDate2String(fecha, "HH:mm"));
            
            panelConfirmacion.setVisible(true);
            
            if(isEntrada){
                lblConfirmacion2.setText("INICIADO");
            }else{
                lblConfirmacion2.setText("TERMINADO");
            }
        }else{
            JOptionPane.showMessageDialog(this, message);
        }

    }
    

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        panelConfirmacion.setVisible(false);
        
        LeerHuella lh = new LeerHuella(null, true, this);
        lh.setBUSCAR(true);
        lh.setVisible(true);   
        
        RegistrarTrabajador rt = new RegistrarTrabajador();
        rt.setVisible(false);
    }//GEN-LAST:event_formWindowOpened

    private void btnAbrirLectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirLectorActionPerformed
        LeerHuella lh = new LeerHuella(null, true, this);
        lh.setBUSCAR(true);
        lh.setVisible(true);
    }//GEN-LAST:event_btnAbrirLectorActionPerformed

    private void SubMenuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubMenuSalirActionPerformed
        dispose();
        System.exit(1);
    }//GEN-LAST:event_SubMenuSalirActionPerformed

    private void SubMenuRegistrarNuevoTrabajadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubMenuRegistrarNuevoTrabajadorActionPerformed
        RegistrarTrabajador rt = new RegistrarTrabajador();
        rt.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_SubMenuRegistrarNuevoTrabajadorActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        txtRut.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        panelConfirmacion.setVisible(false);
        lblConfirmacion2.setText("");
        lblConfirmacionHora.setText("");
        
        LeerHuella lh = new LeerHuella(null, true, this);
        lh.setBUSCAR(true);
        lh.setVisible(true);
    }//GEN-LAST:event_btnConfirmarActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem SubMenuRegistrarNuevoTrabajador;
    private javax.swing.JMenuItem SubMenuSalir;
    private javax.swing.JButton btnAbrirLector;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblConfirmacion1;
    private javax.swing.JLabel lblConfirmacion2;
    private javax.swing.JLabel lblConfirmacion3;
    private javax.swing.JLabel lblConfirmacionHora;
    private javax.swing.JLabel lblConfirmacionHora1;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblMensaje;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblRut;
    private javax.swing.JMenu menuAcciones;
    private javax.swing.JPanel panelConfirmacion;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRut;
    // End of variables declaration//GEN-END:variables
}
