package Telas;

import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luciana
 */
public class TelaAbrir extends javax.swing.JFrame {

    /**
     * Creates new form TelaAbrir
     */
    public TelaAbrir() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPFsenhaAdmin = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jTFadmin = new javax.swing.JTextField();
        jBiniciar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("INÍCIO");
        setMinimumSize(new java.awt.Dimension(700, 450));
        addWindowStateListener(new java.awt.event.WindowStateListener() {
            public void windowStateChanged(java.awt.event.WindowEvent evt) {
                formWindowStateChanged(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("INICIAR SEÇÃO");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Usuário:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, -1, -1));

        jPFsenhaAdmin.setText("jPasswordField1");
        jPFsenhaAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPFsenhaAdminActionPerformed(evt);
            }
        });
        getContentPane().add(jPFsenhaAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 210, 40));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Insira a senha:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, -1, -1));
        getContentPane().add(jTFadmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 210, 40));

        jBiniciar.setBackground(new java.awt.Color(0, 153, 153));
        jBiniciar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBiniciar.setText("ENTRAR");
        jBiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBiniciarActionPerformed(evt);
            }
        });
        getContentPane().add(jBiniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 320, 170, 50));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jPFsenhaAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPFsenhaAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPFsenhaAdminActionPerformed

    private void jBiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBiniciarActionPerformed
        if(jTFadmin.getText().equals("admin") && jPFsenhaAdmin.getText().equals("admin")){
            dispose();
            TelaAutEleitor telaEleitor;
            telaEleitor = new TelaAutEleitor();
            telaEleitor.setVisible(true);
            
            dispose();
            
            
            
        }else{
            if (!jTFadmin.getText().equals("admin") && jPFsenhaAdmin.getText().equals("admin")){
                JOptionPane.showMessageDialog(null, "Login e senha não conferem, por favor tente novamente!");
            }
        }
    }//GEN-LAST:event_jBiniciarActionPerformed

    private void formWindowStateChanged(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowStateChanged

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
            java.util.logging.Logger.getLogger(TelaAbrir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAbrir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAbrir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAbrir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAbrir().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBiniciar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField jPFsenhaAdmin;
    private javax.swing.JTextField jTFadmin;
    // End of variables declaration//GEN-END:variables
}
