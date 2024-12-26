/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.hostelapp.view;

import javax.swing.JOptionPane;

/**
 *
 * @author 1miss
 */
public class Log_in extends javax.swing.JFrame {

    /**
     * Creates new form Log_in
     */
    public Log_in() {
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

        PnlMainLoginfram = new javax.swing.JPanel();
        LblBg = new javax.swing.JLabel();
        PnlLogin = new javax.swing.JPanel();
        BtnLogin = new javax.swing.JButton();
        BtnSignUp = new javax.swing.JButton();
        PnlUsrnm = new javax.swing.JPanel();
        LblUsername = new javax.swing.JLabel();
        txtFieldUsername = new javax.swing.JTextField();
        pnlPassword = new javax.swing.JPanel();
        lblPassword = new javax.swing.JLabel();
        txtFldPwd = new javax.swing.JPasswordField();
        ChckBxShwPwd = new javax.swing.JCheckBox();
        pnlHeading = new javax.swing.JPanel();
        lblHeading = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PnlMainLoginfram.setBackground(new java.awt.Color(255, 153, 153));
        PnlMainLoginfram.setForeground(new java.awt.Color(204, 0, 51));

        LblBg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/hostelapp/resource/walled.png"))); // NOI18N

        PnlLogin.setBackground(new java.awt.Color(255, 153, 153));

        BtnLogin.setBackground(new java.awt.Color(204, 204, 204));
        BtnLogin.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        BtnLogin.setText("Log In");
        BtnLogin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BtnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLoginActionPerformed(evt);
            }
        });

        BtnSignUp.setBackground(new java.awt.Color(204, 204, 204));
        BtnSignUp.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        BtnSignUp.setText("Sign up.");
        BtnSignUp.setBorder(new javax.swing.border.MatteBorder(null));
        BtnSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSignUpActionPerformed(evt);
            }
        });

        PnlUsrnm.setBackground(new java.awt.Color(255, 102, 102));

        LblUsername.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        LblUsername.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LblUsername.setText("Username or Email");

        txtFieldUsername.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtFieldUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldUsernameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PnlUsrnmLayout = new javax.swing.GroupLayout(PnlUsrnm);
        PnlUsrnm.setLayout(PnlUsrnmLayout);
        PnlUsrnmLayout.setHorizontalGroup(
            PnlUsrnmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlUsrnmLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(PnlUsrnmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFieldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PnlUsrnmLayout.setVerticalGroup(
            PnlUsrnmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlUsrnmLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(txtFieldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pnlPassword.setBackground(new java.awt.Color(255, 102, 102));

        lblPassword.setBackground(new java.awt.Color(204, 255, 255));
        lblPassword.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblPassword.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblPassword.setText("Password");

        txtFldPwd.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtFldPwd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFldPwdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlPasswordLayout = new javax.swing.GroupLayout(pnlPassword);
        pnlPassword.setLayout(pnlPasswordLayout);
        pnlPasswordLayout.setHorizontalGroup(
            pnlPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPasswordLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(pnlPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 523, Short.MAX_VALUE)
                    .addComponent(txtFldPwd))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlPasswordLayout.setVerticalGroup(
            pnlPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPasswordLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtFldPwd, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        ChckBxShwPwd.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ChckBxShwPwd.setText("Show Password");
        ChckBxShwPwd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChckBxShwPwdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PnlLoginLayout = new javax.swing.GroupLayout(PnlLogin);
        PnlLogin.setLayout(PnlLoginLayout);
        PnlLoginLayout.setHorizontalGroup(
            PnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlLoginLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(ChckBxShwPwd, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlLoginLayout.createSequentialGroup()
                        .addComponent(BtnSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(PnlUsrnm, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        PnlLoginLayout.setVerticalGroup(
            PnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlLoginLayout.createSequentialGroup()
                .addComponent(PnlUsrnm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(pnlPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ChckBxShwPwd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(186, 186, 186))
        );

        pnlHeading.setBackground(new java.awt.Color(255, 153, 153));

        lblHeading.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblHeading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeading.setText("Welcome to Hostel  Management System");

        javax.swing.GroupLayout pnlHeadingLayout = new javax.swing.GroupLayout(pnlHeading);
        pnlHeading.setLayout(pnlHeadingLayout);
        pnlHeadingLayout.setHorizontalGroup(
            pnlHeadingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHeadingLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(lblHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 1124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );
        pnlHeadingLayout.setVerticalGroup(
            pnlHeadingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHeadingLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(lblHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout PnlMainLoginframLayout = new javax.swing.GroupLayout(PnlMainLoginfram);
        PnlMainLoginfram.setLayout(PnlMainLoginframLayout);
        PnlMainLoginframLayout.setHorizontalGroup(
            PnlMainLoginframLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlMainLoginframLayout.createSequentialGroup()
                .addGroup(PnlMainLoginframLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnlMainLoginframLayout.createSequentialGroup()
                        .addComponent(LblBg, javax.swing.GroupLayout.PREFERRED_SIZE, 632, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(PnlLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PnlMainLoginframLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pnlHeading, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PnlMainLoginframLayout.setVerticalGroup(
            PnlMainLoginframLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlMainLoginframLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlHeading, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PnlMainLoginframLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PnlLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblBg, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(PnlMainLoginfram, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents
        
    private void BtnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLoginActionPerformed
        if(txtFldPwd.getText().isEmpty() || txtFieldUsername.getText().isEmpty())
                {
                   JOptionPane.showMessageDialog(rootPane,"Please Fill all required information!","Alert",JOptionPane.WARNING_MESSAGE);    
                }
        else{
              hostelapp adminapp = new hostelapp();   
                if( "admin".equals(txtFldPwd.getText())){
                    adminapp.setVisible(true);
                    dispose();
        }   else{
                    JOptionPane.showMessageDialog(rootPane,"Password is incorrect","Alert",JOptionPane.WARNING_MESSAGE);
                }
        }
        
    }//GEN-LAST:event_BtnLoginActionPerformed

    private void txtFieldUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldUsernameActionPerformed

    private void BtnSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSignUpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnSignUpActionPerformed

    private void ChckBxShwPwdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChckBxShwPwdActionPerformed
    if(ChckBxShwPwd.isSelected()){
        txtFldPwd.setEchoChar((char)0);
    }
    else{
        txtFldPwd.setEchoChar('*');
    }
    }//GEN-LAST:event_ChckBxShwPwdActionPerformed

    private void txtFldPwdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFldPwdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFldPwdActionPerformed

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
            java.util.logging.Logger.getLogger(Log_in.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Log_in.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Log_in.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Log_in.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Log_in().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnLogin;
    private javax.swing.JButton BtnSignUp;
    private javax.swing.JCheckBox ChckBxShwPwd;
    private javax.swing.JLabel LblBg;
    private javax.swing.JLabel LblUsername;
    private javax.swing.JPanel PnlLogin;
    private javax.swing.JPanel PnlMainLoginfram;
    private javax.swing.JPanel PnlUsrnm;
    private javax.swing.JLabel lblHeading;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JPanel pnlHeading;
    private javax.swing.JPanel pnlPassword;
    private javax.swing.JTextField txtFieldUsername;
    private javax.swing.JPasswordField txtFldPwd;
    // End of variables declaration//GEN-END:variables
}
