/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.exam.view;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import lk.ijse.exam.controller.LoginFormController;
import lk.ijse.exam.dto.TeacherDTO;

/**
 *
 * @author Imalka Gunawardana
 */
public class LoginForm extends javax.swing.JFrame {

    /**
     * Creates new form LoginForm
     */
    public LoginForm() {
        initComponents();
        setSize(1920, 1080);
        setExtendedState(this.MAXIMIZED_BOTH);
        setVisible(true);
        setUiComponents();
        changeColor();
    }

    private void setUiComponents() {
        pnlText.setBackground(new Color(0, 0, 0, 0));
        PanelLoginText loginText = new PanelLoginText();
        loginText.setPos(1290, 150);
        loginText.setMainPnlSize(600, 400);
        loginText.setPnlSize(540, 340);
        lblImage.add(loginText);
    }

    private void changeColor() {
        new Thread(() -> {
            while (true) {
                for (int i = 80; i <= 225; i++) {
                    lblHead1.setForeground(new Color(204, 204, 204, i));
                    try {
                        Thread.sleep(15);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
                }
                for (int i = 225; i >= 80; i--) {
                    lblHead1.setForeground(new Color(204, 204, 204, i));
                    try {
                        Thread.sleep(15);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }).start();
    }
    
    private void performLogin() {
        try {
            TeacherDTO teacherDTO = new TeacherDTO();
            teacherDTO.setName(txtUsername.getText());
            teacherDTO.setPassword(txtPassword.getText());
            if (!txtUsername.getText().isEmpty() && !txtPassword.getText().isEmpty()) {
                TeacherDTO chkLogin = LoginFormController.chkLogin(teacherDTO);
                if (chkLogin != null) {
                    if (chkLogin.getTid() != 0 && chkLogin.getType() == 1) {
                        new AdminView();
                        this.dispose();
                    } else {
                        JOptionPane.showMessageDialog(this, "Incorrect");
                    }
                }
            }
        } catch (Exception ex) {
            Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlText = new javax.swing.JPanel();
        txtUsername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        lblPass = new javax.swing.JLabel();
        lblHead1 = new javax.swing.JLabel();
        btnClose = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        pnlText.setLayout(null);

        txtUsername.setBackground(new java.awt.Color(63, 63, 63));
        txtUsername.setFont(new java.awt.Font("Bookman Old Style", 0, 24)); // NOI18N
        txtUsername.setForeground(new java.awt.Color(153, 153, 153));
        txtUsername.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(63, 63, 63), 10));
        pnlText.add(txtUsername);
        txtUsername.setBounds(50, 70, 440, 50);

        txtPassword.setBackground(new java.awt.Color(63, 63, 63));
        txtPassword.setFont(new java.awt.Font("Bookman Old Style", 0, 24)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(153, 153, 153));
        txtPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(63, 63, 63), 10));
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        pnlText.add(txtPassword);
        txtPassword.setBounds(50, 160, 440, 50);

        btnLogin.setBackground(new Color(255, 153, 51, 170));
        btnLogin.setFont(new java.awt.Font("Neuropol X Rg", 1, 24)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 209, 163));
        btnLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnLogin.setText("Login");
        btnLogin.setOpaque(true);
        btnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLoginMouseClicked(evt);
            }
        });
        pnlText.add(btnLogin);
        btnLogin.setBounds(50, 240, 440, 50);

        lblUser.setFont(new java.awt.Font("Neuropol", 1, 20)); // NOI18N
        lblUser.setForeground(new Color(0,0,0, 150));
        lblUser.setText("Username");
        lblUser.setName("labelUser"); // NOI18N
        pnlText.add(lblUser);
        lblUser.setBounds(50, 40, 170, 25);

        lblPass.setFont(new java.awt.Font("Neuropol", 1, 20)); // NOI18N
        lblPass.setForeground(new Color(0,0,0, 150));
        lblPass.setText("Password");
        lblPass.setName("labelUser"); // NOI18N
        pnlText.add(lblPass);
        lblPass.setBounds(50, 130, 170, 25);

        getContentPane().add(pnlText);
        pnlText.setBounds(1290, 150, 540, 310);

        lblHead1.setBackground(new Color(204, 204, 204, 80));
        lblHead1.setFont(new java.awt.Font("Neuropol X Rg", 0, 90)); // NOI18N
        lblHead1.setForeground(new Color(255,255,255, 120));
        lblHead1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHead1.setText("Exams Online (24 X 7)");
        getContentPane().add(lblHead1);
        lblHead1.setBounds(0, 780, 1920, 120);

        btnClose.setFont(new java.awt.Font("Neuropol X Rg", 1, 48)); // NOI18N
        btnClose.setForeground(new Color(0,0,0, 150));
        btnClose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnClose.setText("X");
        btnClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCloseMouseClicked(evt);
            }
        });
        getContentPane().add(btnClose);
        btnClose.setBounds(1820, 0, 100, 70);

        jLabel1.setFont(new java.awt.Font("Neuropol", 1, 20)); // NOI18N
        jLabel1.setForeground(new Color(0,0,0,150));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Admin's Session");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 10, 260, 25);

        jLabel3.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Developed By Imalka Gunawardana");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 1060, 290, 20);

        jLabel2.setFont(new java.awt.Font("Neuropol X Rg", 1, 48)); // NOI18N
        jLabel2.setForeground(new Color(0,0,0, 150));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("-");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2);
        jLabel2.setBounds(1740, 0, 80, 70);

        lblImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/exam/asset/macos_sierra_2-wallpaper-1920x1080.jpg"))); // NOI18N
        getContentPane().add(lblImage);
        lblImage.setBounds(0, 0, 1920, 1080);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnCloseMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        this.setState(this.ICONIFIED);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void btnLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseClicked
        performLogin();
    }//GEN-LAST:event_btnLoginMouseClicked

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        performLogin();
    }//GEN-LAST:event_txtPasswordActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new LoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnClose;
    private javax.swing.JLabel btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblHead1;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblPass;
    private javax.swing.JLabel lblUser;
    private javax.swing.JPanel pnlText;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables

}
