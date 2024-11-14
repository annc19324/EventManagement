/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.User;
import util.Session;

/**
 *
 * @author annc1
 */
public class HelpView extends javax.swing.JFrame {

    private int mousePressX, mousePressY;
    private User user;
    private boolean isOpenMenu = false;

    /**
     * Creates new form HelpView
     */
    public HelpView() {
        initComponents();
        setLocationRelativeTo(null);
        this.user = new User();
        lblUsername.setText("Tài khoản: " + user.getFullname());
    }

    public HelpView(User user) {
        initComponents();
        setLocationRelativeTo(null);
        this.user = Session.getLoggedInUser();
        this.user = new User();
        lblUsername.setText("Tài khoản: " + user.getFullname());
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

        pnlMain = new javax.swing.JPanel();
        pnlHeader = new javax.swing.JPanel();
        lblUsername = new javax.swing.JLabel();
        lblMinimize5 = new javax.swing.JLabel();
        lblClose6 = new javax.swing.JLabel();
        lblMenu = new javax.swing.JLabel();
        pnlSlideMenu = new javax.swing.JPanel();
        pnlClose = new javax.swing.JPanel();
        lblClose = new javax.swing.JLabel();
        pnlPage = new javax.swing.JPanel();
        lblHome = new javax.swing.JLabel();
        lblAccount = new javax.swing.JLabel();
        lblJoinEvents = new javax.swing.JLabel();
        lblJoinnedEvents = new javax.swing.JLabel();
        pnlfooter = new javax.swing.JPanel();
        lblHelp = new javax.swing.JLabel();
        lblSetting = new javax.swing.JLabel();
        lblLogOut = new javax.swing.JLabel();
        pnlContainer = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnFacebook = new javax.swing.JButton();
        btnInstagram = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        pnlMain.setBackground(new java.awt.Color(102, 204, 255));

        pnlHeader.setBackground(new java.awt.Color(255, 255, 0));
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

        lblUsername.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(153, 0, 255));
        lblUsername.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblMinimize5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMinimize5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/bar.png"))); // NOI18N
        lblMinimize5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMinimize5MouseClicked(evt);
            }
        });

        lblClose6.setForeground(new java.awt.Color(204, 0, 255));
        lblClose6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblClose6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/x.png"))); // NOI18N
        lblClose6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblClose6MouseClicked(evt);
            }
        });

        lblMenu.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/menu.png"))); // NOI18N
        lblMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMenuMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlHeaderLayout = new javax.swing.GroupLayout(pnlHeader);
        pnlHeader.setLayout(pnlHeaderLayout);
        pnlHeaderLayout.setHorizontalGroup(
            pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHeaderLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(lblMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMinimize5, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblClose6, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        pnlHeaderLayout.setVerticalGroup(
            pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHeaderLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblClose6)
                        .addGroup(pnlHeaderLayout.createSequentialGroup()
                            .addGap(0, 0, 0)
                            .addComponent(lblMinimize5))))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pnlSlideMenu.setBackground(new java.awt.Color(51, 204, 255));
        pnlSlideMenu.setMinimumSize(new java.awt.Dimension(200, 0));

        pnlClose.setOpaque(false);

        lblClose.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/x.png"))); // NOI18N
        lblClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCloseMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlCloseLayout = new javax.swing.GroupLayout(pnlClose);
        pnlClose.setLayout(pnlCloseLayout);
        pnlCloseLayout.setHorizontalGroup(
            pnlCloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblClose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlCloseLayout.setVerticalGroup(
            pnlCloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblClose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pnlPage.setOpaque(false);

        lblHome.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblHome.setText("Trang chủ");
        lblHome.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 30, 1, 30));
        lblHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHomeMouseClicked(evt);
            }
        });

        lblAccount.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblAccount.setText("Tài khoản");
        lblAccount.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 30, 1, 30));
        lblAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAccountMouseClicked(evt);
            }
        });

        lblJoinEvents.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblJoinEvents.setText("Tham gia sự kiện");
        lblJoinEvents.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 30, 1, 30));

        lblJoinnedEvents.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblJoinnedEvents.setText("Sự kiện đã tham gia");
        lblJoinnedEvents.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 30, 1, 30));

        javax.swing.GroupLayout pnlPageLayout = new javax.swing.GroupLayout(pnlPage);
        pnlPage.setLayout(pnlPageLayout);
        pnlPageLayout.setHorizontalGroup(
            pnlPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPageLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblAccount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblJoinEvents, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblJoinnedEvents, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlPageLayout.setVerticalGroup(
            pnlPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPageLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(lblHome)
                .addGap(18, 18, 18)
                .addComponent(lblAccount)
                .addGap(18, 18, 18)
                .addComponent(lblJoinEvents)
                .addGap(18, 18, 18)
                .addComponent(lblJoinnedEvents)
                .addContainerGap(104, Short.MAX_VALUE))
        );

        pnlfooter.setOpaque(false);

        lblHelp.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblHelp.setText("Trợ giúp");
        lblHelp.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 30, 1, 30));
        lblHelp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHelpMouseClicked(evt);
            }
        });

        lblSetting.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblSetting.setText("Cài đặt");
        lblSetting.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 30, 1, 30));

        lblLogOut.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblLogOut.setText("Đăng xuất");
        lblLogOut.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 30, 1, 30));
        lblLogOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogOutMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlfooterLayout = new javax.swing.GroupLayout(pnlfooter);
        pnlfooter.setLayout(pnlfooterLayout);
        pnlfooterLayout.setHorizontalGroup(
            pnlfooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlfooterLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlfooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHelp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblSetting, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblLogOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlfooterLayout.setVerticalGroup(
            pnlfooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlfooterLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHelp)
                .addGap(18, 18, 18)
                .addComponent(lblSetting)
                .addGap(18, 18, 18)
                .addComponent(lblLogOut)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlSlideMenuLayout = new javax.swing.GroupLayout(pnlSlideMenu);
        pnlSlideMenu.setLayout(pnlSlideMenuLayout);
        pnlSlideMenuLayout.setHorizontalGroup(
            pnlSlideMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSlideMenuLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(pnlSlideMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlfooter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlPage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlClose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        pnlSlideMenuLayout.setVerticalGroup(
            pnlSlideMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSlideMenuLayout.createSequentialGroup()
                .addComponent(pnlClose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlPage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                .addComponent(pnlfooter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pnlContainer.setOpaque(false);
        pnlContainer.setLayout(new java.awt.GridBagLayout());

        jPanel1.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Hỗ trợ");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("nếu có bất kì vấn đề gì về demo vui lòng liên hệ:");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("User Management");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("mail: lethienan@gmail.com");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("phone: 0337 333 777");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("mail: hanaviet@gmail.com");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("phone: 0368 666 888");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Event Management");

        btnFacebook.setBackground(new java.awt.Color(51, 153, 255));
        btnFacebook.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        btnFacebook.setForeground(new java.awt.Color(255, 255, 255));
        btnFacebook.setText("Facebook");
        btnFacebook.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnFacebook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFacebookMouseClicked(evt);
            }
        });

        btnInstagram.setBackground(new java.awt.Color(0, 0, 0));
        btnInstagram.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        btnInstagram.setForeground(new java.awt.Color(255, 255, 255));
        btnInstagram.setText("Instagram");
        btnInstagram.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnInstagram.setPreferredSize(new java.awt.Dimension(111, 37));
        btnInstagram.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInstagramMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(227, 227, 227)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnFacebook, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnInstagram, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(btnFacebook, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnInstagram, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 218;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 12, 13, 12);
        pnlContainer.add(jPanel1, gridBagConstraints);

        javax.swing.GroupLayout pnlMainLayout = new javax.swing.GroupLayout(pnlMain);
        pnlMain.setLayout(pnlMainLayout);
        pnlMainLayout.setHorizontalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainLayout.createSequentialGroup()
                .addComponent(pnlSlideMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        pnlMainLayout.setVerticalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainLayout.createSequentialGroup()
                .addComponent(pnlHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlContainer, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(pnlSlideMenu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblMinimize5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimize5MouseClicked
        setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_lblMinimize5MouseClicked

    private void lblClose6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblClose6MouseClicked
        if ((JOptionPane.showConfirmDialog(this, "bạn có chắc chắn muốn thoát không?", "xác nhận thoát", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE)) == (JOptionPane.OK_OPTION)) {
            System.exit(0);
        }
    }//GEN-LAST:event_lblClose6MouseClicked

    private void lblMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenuMouseClicked
        openMenu();
    }//GEN-LAST:event_lblMenuMouseClicked

    private void pnlHeaderMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlHeaderMouseDragged
        int ox = evt.getXOnScreen();
        int oy = evt.getYOnScreen();
        setLocation(ox - mousePressX, oy - mousePressY);
    }//GEN-LAST:event_pnlHeaderMouseDragged

    private void pnlHeaderMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlHeaderMousePressed
        mousePressX = evt.getX();
        mousePressY = evt.getY();
    }//GEN-LAST:event_pnlHeaderMousePressed

    private void lblCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseClicked
        closeMenu();
    }//GEN-LAST:event_lblCloseMouseClicked

    private void lblHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHomeMouseClicked
        if (!Session.isLoggedIn()) {
            if ((JOptionPane.showConfirmDialog(this, "bạn cần đăng nhập trước, nhấn OK để đăng nhập!", "thông báo", JOptionPane.OK_CANCEL_OPTION)) == (JOptionPane.OK_OPTION)) {
                try {
                    new LogInView().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(HelpView.class.getName()).log(Level.SEVERE, null, ex);
                }
                this.dispose();
            } else {
                return;
            }
        }
        try {
            new UserView(Session.getLoggedInUser()).setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(HelpView.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();

    }//GEN-LAST:event_lblHomeMouseClicked

    private void lblLogOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogOutMouseClicked
        if ((JOptionPane.showConfirmDialog(this, "bạn có chắc chắn muốn đăng xuất khỏi tài khoản này không?", "xác nhận đăng xuất", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE)) == JOptionPane.YES_OPTION) {
            Session.clear();
            this.dispose();
            try {
                new LogInView().setVisible(true);
            } catch (SQLException ex) {
                java.util.logging.Logger.getLogger(RegisteredEventView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_lblLogOutMouseClicked

    private void lblHelpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHelpMouseClicked
        new HelpView(Session.getLoggedInUser()).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblHelpMouseClicked

    private void btnFacebookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFacebookMouseClicked
        try {
            Desktop.getDesktop().browse(new URI("https://www.facebook.com/hanaviet"));
        } catch (URISyntaxException | IOException ex) {
            Logger.getLogger(HelpView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnFacebookMouseClicked

    private void btnInstagramMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInstagramMouseClicked
        try {
            Desktop.getDesktop().browse(new URI("http://www.íntagram.com/annc19324"));
        } catch (URISyntaxException | IOException ex) {
            Logger.getLogger(HelpView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnInstagramMouseClicked

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        if (isOpenMenu) {
            closeMenu();
            isOpenMenu = false;
        }
    }//GEN-LAST:event_formMouseClicked

    private void lblAccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAccountMouseClicked
        try {
            new AccountView(Session.getLoggedInUser()).setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(HelpView.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
    }//GEN-LAST:event_lblAccountMouseClicked
    int width = 270;

    private void openMenu() {
        isOpenMenu = true;
        new Thread(() -> {
            int height1 = pnlSlideMenu.getHeight();
            for (int i = 0; i < width; i += 10) {
                pnlSlideMenu.setSize(i, height1);
//                pnlContainer.setBounds(i, pnlContainer.getY(), pnlMain.getWidth() - i, pnlContainer.getHeight());
                try {
                    Thread.sleep(2);
                } catch (InterruptedException ex) {
                    java.util.logging.Logger.getLogger(RegisteredEventView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }
            }
        }).start();
    }

    private void closeMenu() {
        new Thread(() -> {
            int height1 = pnlSlideMenu.getHeight();
            for (int i = width; i >= 0; i -= 10) {
                pnlSlideMenu.setSize(i, height1);
//                pnlContainer.setBounds(i, pnlContainer.getY(), pnlMain.getWidth() - i, pnlContainer.getHeight());
                try {
                    Thread.sleep(2);
                } catch (InterruptedException ex) {
                    java.util.logging.Logger.getLogger(RegisteredEventView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }
            }
        }).start();
    }

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
            java.util.logging.Logger.getLogger(HelpView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HelpView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HelpView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HelpView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HelpView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFacebook;
    private javax.swing.JButton btnInstagram;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAccount;
    private javax.swing.JLabel lblClose;
    private javax.swing.JLabel lblClose6;
    private javax.swing.JLabel lblHelp;
    private javax.swing.JLabel lblHome;
    private javax.swing.JLabel lblJoinEvents;
    private javax.swing.JLabel lblJoinnedEvents;
    private javax.swing.JLabel lblLogOut;
    private javax.swing.JLabel lblMenu;
    private javax.swing.JLabel lblMinimize5;
    private javax.swing.JLabel lblSetting;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPanel pnlClose;
    private javax.swing.JPanel pnlContainer;
    private javax.swing.JPanel pnlHeader;
    private javax.swing.JPanel pnlMain;
    private javax.swing.JPanel pnlPage;
    private javax.swing.JPanel pnlSlideMenu;
    private javax.swing.JPanel pnlfooter;
    // End of variables declaration//GEN-END:variables
}
