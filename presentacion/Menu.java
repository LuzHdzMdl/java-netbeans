/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import presentacion.Servicio;

/**
 *
 * @author luzme
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form principal
     */
    public Menu() {
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

        jPanel1 = new javax.swing.JPanel();
        servicios = new javax.swing.JButton();
        pacientes = new javax.swing.JButton();
        usuarios = new javax.swing.JButton();
        materiales = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        servicios.setBackground(new java.awt.Color(204, 204, 255));
        servicios.setFont(new java.awt.Font("Yu Gothic Medium", 2, 14)); // NOI18N
        servicios.setText("Servicios");
        servicios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                serviciosMouseClicked(evt);
            }
        });
        jPanel1.add(servicios, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 150, 30));

        pacientes.setBackground(new java.awt.Color(204, 204, 255));
        pacientes.setFont(new java.awt.Font("Yu Gothic Medium", 2, 14)); // NOI18N
        pacientes.setText("Pacientes");
        pacientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pacientesMouseClicked(evt);
            }
        });
        jPanel1.add(pacientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, 150, 30));

        usuarios.setBackground(new java.awt.Color(204, 204, 255));
        usuarios.setFont(new java.awt.Font("Yu Gothic Medium", 2, 14)); // NOI18N
        usuarios.setText("Usuarios");
        usuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usuariosMouseClicked(evt);
            }
        });
        usuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuariosActionPerformed(evt);
            }
        });
        jPanel1.add(usuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, 150, 30));

        materiales.setBackground(new java.awt.Color(204, 204, 255));
        materiales.setFont(new java.awt.Font("Yu Gothic Medium", 2, 14)); // NOI18N
        materiales.setText("Materiales");
        materiales.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                materialesMouseClicked(evt);
            }
        });
        jPanel1.add(materiales, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 150, 30));

        salir.setBackground(new java.awt.Color(204, 204, 255));
        salir.setFont(new java.awt.Font("Yu Gothic Medium", 2, 14)); // NOI18N
        salir.setForeground(new java.awt.Color(0, 0, 153));
        salir.setText("Salir");
        salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salirMouseClicked(evt);
            }
        });
        jPanel1.add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 340, 70, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/img.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 510, 380));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuariosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usuariosActionPerformed

    private void serviciosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_serviciosMouseClicked
    Servicio servicio = new Servicio();
    servicio.setVisible(true);
    this.dispose();
// TODO add your handling code here:
    }//GEN-LAST:event_serviciosMouseClicked

    private void pacientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pacientesMouseClicked
    Cliente clientes = new Cliente();
    clientes.setVisible(true);
    this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_pacientesMouseClicked

    private void materialesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_materialesMouseClicked
    Material material = new Material();
    material.setVisible(true);
    this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_materialesMouseClicked

    private void usuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usuariosMouseClicked
    Usuario usuario = new Usuario();
    usuario.setVisible(true);
    this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_usuariosMouseClicked

    private void salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseClicked
    System.exit(0);       // TODO add your handling code here:
    }//GEN-LAST:event_salirMouseClicked

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton materiales;
    private javax.swing.JButton pacientes;
    private javax.swing.JButton salir;
    private javax.swing.JButton servicios;
    private javax.swing.JButton usuarios;
    // End of variables declaration//GEN-END:variables
}
