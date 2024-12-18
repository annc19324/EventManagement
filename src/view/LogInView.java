/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.EventController;
import controller.UserController;
import java.awt.Color;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.EmptyBorder;
import model.Event;
import model.User;
import util.Session;

/**
 *
 * @author annc1
 */
public class LogInView extends javax.swing.JFrame {

    private UserController userController;
    private int mousePressX, mousePressY;
    private EventController eventController;

    /**
     * Creates new form LogInView
     *
     * @throws java.sql.SQLException
     */
    public LogInView() throws SQLException {
        initComponents();
        setLocationRelativeTo(null);
        
        txtUsername.setBorder(new EmptyBorder(0, 30, 0, 30));
        txtPassword.setBorder(new EmptyBorder(0, 30, 0, 30));
        txtUsername.setForeground(Color.LIGHT_GRAY);
        txtPassword.setForeground(Color.LIGHT_GRAY);

        userController = new UserController();
        eventController = new EventController();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        pnlHeader = new javax.swing.JPanel();
        lblHeaderTitle = new javax.swing.JLabel();
        lblMinimize = new javax.swing.JLabel();
        lblClose = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnLogIn = new javax.swing.JButton();
        btnSignUp = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();
        lblUsername = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        btnBackTitleView = new javax.swing.JButton();
        btnFotgetPassword = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(950, 450));

        pnlHeader.setBackground(new java.awt.Color(0, 153, 153));
        pnlHeader.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                pnlHeaderMouseDragged(evt);
            }
        });
        pnlHeader.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlHeaderMousePressed(evt);
            }
        });

        lblHeaderTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblHeaderTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblHeaderTitle.setText("Let's join us for exciting events");

        lblMinimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMinimize.setIcon(new javax.swing.ImageIcon("D:\\A_GroupProject\\EventManagement\\src\\image\\bar.png")); // NOI18N
        lblMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMinimizeMouseClicked(evt);
            }
        });

        lblClose.setForeground(new java.awt.Color(204, 0, 255));
        lblClose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblClose.setIcon(new javax.swing.ImageIcon("D:\\A_GroupProject\\EventManagement\\src\\image\\x.png")); // NOI18N
        lblClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCloseMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlHeaderLayout = new javax.swing.GroupLayout(pnlHeader);
        pnlHeader.setLayout(pnlHeaderLayout);
        pnlHeaderLayout.setHorizontalGroup(
            pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHeaderTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblMinimize, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lblClose, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlHeaderLayout.setVerticalGroup(
            pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblMinimize, javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(lblHeaderTitle))
            .addGroup(pnlHeaderLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblClose))
        );

        jPanel2.setOpaque(false);
        jPanel2.setLayout(new java.awt.GridBagLayout());

        jPanel4.setBackground(new java.awt.Color(0, 153, 153));
        jPanel4.setOpaque(false);
        jPanel4.setLayout(new java.awt.GridBagLayout());

        jLabel1.setBackground(new java.awt.Color(0, 153, 153));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Đăng nhập");
        jPanel4.add(jLabel1, new java.awt.GridBagConstraints());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 551;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(30, 22, 0, 12);
        jPanel2.add(jPanel4, gridBagConstraints);

        jPanel5.setOpaque(false);
        jPanel5.setLayout(new java.awt.GridBagLayout());

        jPanel3.setOpaque(false);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Tài khoản:");

        txtUsername.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtUsername.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtUsername.setText("USERNAME");
        txtUsername.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUsernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUsernameFocusLost(evt);
            }
        });
        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Mật khẩu: ");

        btnLogIn.setBackground(new java.awt.Color(102, 204, 255));
        btnLogIn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnLogIn.setText("Đăng nhập");
        btnLogIn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnLogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogInActionPerformed(evt);
            }
        });

        btnSignUp.setBackground(new java.awt.Color(102, 204, 255));
        btnSignUp.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnSignUp.setText("Đăng ký");
        btnSignUp.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignUpActionPerformed(evt);
            }
        });

        txtPassword.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(51, 51, 51));
        txtPassword.setText("·············");
        txtPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPasswordFocusLost(evt);
            }
        });
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });

        lblUsername.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(255, 0, 0));

        lblPassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblUsername, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblPassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtUsername, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnLogIn, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                        .addComponent(btnSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUsername)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPassword)
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogIn)
                    .addComponent(btnSignUp))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 12, 0, 12);
        jPanel5.add(jPanel3, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 108, 23, 0);
        jPanel2.add(jPanel5, gridBagConstraints);

        jPanel6.setOpaque(false);

        btnBackTitleView.setBackground(new java.awt.Color(102, 204, 255));
        btnBackTitleView.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnBackTitleView.setText("Trở lại");
        btnBackTitleView.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBackTitleViewMouseClicked(evt);
            }
        });

        btnFotgetPassword.setBackground(new java.awt.Color(102, 204, 255));
        btnFotgetPassword.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnFotgetPassword.setText("Quên mật khẩu?");
        btnFotgetPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFotgetPasswordMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBackTitleView, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnFotgetPassword)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btnBackTitleView)
                .addComponent(btnFotgetPassword))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 765, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 458, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblMinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizeMouseClicked
        setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_lblMinimizeMouseClicked

    private void lblCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseClicked
        if ((JOptionPane.showConfirmDialog(this, "bạn có chắc chắn muốn thoát không?", "xác nhận thoát", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE)) == (JOptionPane.OK_OPTION)) {
            System.exit(0);
        }
    }//GEN-LAST:event_lblCloseMouseClicked

    private void pnlHeaderMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlHeaderMouseDragged
        int ox = evt.getXOnScreen();
        int oy = evt.getYOnScreen();
        setLocation(ox - mousePressX, oy - mousePressY);
    }//GEN-LAST:event_pnlHeaderMouseDragged

    private void pnlHeaderMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlHeaderMousePressed
        mousePressX = evt.getX();
        mousePressY = evt.getY();
    }//GEN-LAST:event_pnlHeaderMousePressed

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        txtPassword.requestFocus();
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        btnLogIn.doClick();
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void txtUsernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsernameFocusGained
        if (txtUsername.getText().equals("USERNAME")) {
            txtUsername.setText("");
            txtUsername.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtUsernameFocusGained

    private void txtUsernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsernameFocusLost
        if (txtUsername.getText().equals("")) {
            txtUsername.setText("USERNAME");
            txtUsername.setForeground(Color.LIGHT_GRAY);
        }
    }//GEN-LAST:event_txtUsernameFocusLost

    private void btnSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignUpActionPerformed
        this.dispose();
        try {
            new SignUpView().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(LogInView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSignUpActionPerformed

    private void txtPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusGained
        if (String.valueOf(txtPassword.getPassword()).equals("·············")) {
            txtPassword.setText("");
            txtPassword.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtPasswordFocusGained

    private void txtPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusLost
        if (String.valueOf(txtPassword.getPassword()).equals("")) {
            txtPassword.setText("·············");
            txtPassword.setForeground(Color.LIGHT_GRAY);
        }
    }//GEN-LAST:event_txtPasswordFocusLost

    private void btnLogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogInActionPerformed
        String username = txtUsername.getText();
        String password = new String(txtPassword.getPassword());
        boolean isUsernameEmpty = username.isEmpty() || username.equals("USERNAME");
        boolean isPasswordEmpty = password.isEmpty() || password.equals("·············");

        if (isUsernameEmpty || isPasswordEmpty) {
            if (isUsernameEmpty) {
                lblUsername.setText("username can't be empty!");
            } else {
                lblUsername.setText("");
            }
            if (isPasswordEmpty) {
                lblPassword.setText("password can't be empty!");
            } else {
                lblPassword.setText("");
            }
            return;
        } else {
            lblUsername.setText("");
            lblPassword.setText("");
        }

        User loggedInUser = userController.login(username, password);
        if (loggedInUser != null) {
            Session.setLoggedInUser(loggedInUser);
            List<Event> registeredEvents = eventController.getRegisteredEvents(loggedInUser.getUserId());
            for (Event event : registeredEvents) {
                Session.addRegisteredEvent(event);
            }
            this.dispose();
            if (loggedInUser.getRole().equals("admin")) {
                new AdminView().setVisible(true);
            } else if (loggedInUser.getRole().equals("user")) {
                new UserHome(loggedInUser).setVisible(true);
            }
        }
    }//GEN-LAST:event_btnLogInActionPerformed

    private void btnBackTitleViewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackTitleViewMouseClicked
        this.dispose();
        new TitleView().setVisible(true);
    }//GEN-LAST:event_btnBackTitleViewMouseClicked

    private void btnFotgetPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFotgetPasswordMouseClicked
        try {
            // TODO add your handling code here:
            new ForgetPassword().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(LogInView.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
    }//GEN-LAST:event_btnFotgetPasswordMouseClicked

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
            java.util.logging.Logger.getLogger(LogInView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogInView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogInView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogInView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new LogInView().setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(LogInView.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBackTitleView;
    private javax.swing.JButton btnFotgetPassword;
    private javax.swing.JButton btnLogIn;
    private javax.swing.JButton btnSignUp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel lblClose;
    private javax.swing.JLabel lblHeaderTitle;
    private javax.swing.JLabel lblMinimize;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPanel pnlHeader;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
