/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

/**
 *
 * @author luzme
 */
public class Material extends javax.swing.JFrame {

    /**
     * Creates new form añmaterial
     */
    public Material() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        idusuarioma = new javax.swing.JTextField();
        idmaterial = new javax.swing.JTextField();
        cantmate = new javax.swing.JTextField();
        nombrema = new javax.swing.JTextField();
        caractema = new javax.swing.JTextField();
        cancelma = new javax.swing.JButton();
        agrema = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnconsultarmat = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Yu Gothic Medium", 2, 18)); // NOI18N
        jLabel2.setText("Id Usuario:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 100, 100, -1));

        jLabel3.setFont(new java.awt.Font("Yu Gothic Medium", 2, 18)); // NOI18N
        jLabel3.setText("Id Material:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 100, -1));

        jLabel4.setFont(new java.awt.Font("Yu Gothic Medium", 2, 18)); // NOI18N
        jLabel4.setText("Nombre del Material:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 180, -1));

        jLabel5.setFont(new java.awt.Font("Yu Gothic Medium", 2, 18)); // NOI18N
        jLabel5.setText("Cantidad:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, 90, -1));

        jLabel6.setFont(new java.awt.Font("Yu Gothic Medium", 2, 18)); // NOI18N
        jLabel6.setText("Caracteristicas:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 140, -1));
        jPanel1.add(idusuarioma, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 130, 30));
        jPanel1.add(idmaterial, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 130, 30));
        jPanel1.add(cantmate, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, 90, 30));
        jPanel1.add(nombrema, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, 130, 30));
        jPanel1.add(caractema, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 310, 30));

        cancelma.setFont(new java.awt.Font("Yu Gothic Medium", 2, 12)); // NOI18N
        cancelma.setText("Cancelar");
        cancelma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelmaMouseClicked(evt);
            }
        });
        cancelma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelmaActionPerformed(evt);
            }
        });
        jPanel1.add(cancelma, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 340, -1, -1));

        agrema.setFont(new java.awt.Font("Yu Gothic Medium", 2, 12)); // NOI18N
        agrema.setText("Agregar");
        jPanel1.add(agrema, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 340, -1, -1));

        jButton2.setFont(new java.awt.Font("Yu Gothic Medium", 2, 12)); // NOI18N
        jButton2.setText("Modificar");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, 90, 30));

        btnconsultarmat.setFont(new java.awt.Font("Yu Gothic Medium", 2, 12)); // NOI18N
        btnconsultarmat.setText("Consultar");
        btnconsultarmat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnconsultarmatMouseClicked(evt);
            }
        });
        btnconsultarmat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconsultarmatActionPerformed(evt);
            }
        });
        jPanel1.add(btnconsultarmat, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 90, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/6.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, -6, 510, 390));

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

    private void cancelmaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelmaMouseClicked
    presentacion.Menu menu= new presentacion.Menu();
    menu.setVisible(true);
    this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_cancelmaMouseClicked

    private void cancelmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelmaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelmaActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
    presentacion.Momateriales momateriales= new presentacion.Momateriales();
    momateriales.setVisible(true);
    this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2MouseClicked

    private void btnconsultarmatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnconsultarmatMouseClicked
    presentacion.Conmaterial conmaterial= new presentacion.Conmaterial();
    conmaterial.setVisible(true);
    this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_btnconsultarmatMouseClicked

    private void btnconsultarmatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconsultarmatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnconsultarmatActionPerformed

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
            java.util.logging.Logger.getLogger(Material.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Material.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Material.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Material.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Material().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agrema;
    private javax.swing.JButton btnconsultarmat;
    private javax.swing.JButton cancelma;
    private javax.swing.JTextField cantmate;
    private javax.swing.JTextField caractema;
    private javax.swing.JTextField idmaterial;
    private javax.swing.JTextField idusuarioma;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nombrema;
    // End of variables declaration//GEN-END:variables
}
