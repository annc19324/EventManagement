/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.EventController;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import static java.lang.System.exit;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import model.Event;
import model.User;
import util.Session;
import view.LogInView;

/**
 *
 * @author annc1
 */
public class RegisteredEventView extends javax.swing.JFrame {

    private User user;
    private int mousePressX, mousePressY;
    private EventController eventController;
    private EventManager eventManager;

    /**
     * Creates new form RegisteredEventView
     *
     * @throws java.sql.SQLException
     */
    public RegisteredEventView() throws SQLException {
        if (Session.getLoggedInUser() == null) {
            if ((JOptionPane.showConfirmDialog(null, "bạn cần đăng nhập trước, nhấn OK để đăng nhập", "thông báo", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE)) == (JOptionPane.OK_OPTION)) {
                new LogInView().setVisible(true);
                return;
            } else {
                exit(0);
            }
        }
        initComponents();
        setLocationRelativeTo(null);
        txtSearch.setBorder(new EmptyBorder(0, 30, 0, 30));

        eventController = new EventController();
        eventManager = new EventManager();

        this.user = Session.getLoggedInUser();
        lblUsername.setText("Tài khoản: " + user.getFullname());

        String[] columns = {"Event ID", "Event Name", "Start Date", "End Date", "Location", "Description", "Status", "Price"};
        DefaultTableModel model = new DefaultTableModel(columns, 0);
        tblRegisteredEventDetail.setModel(model);

        showAllEvents();
        tblRegisteredEventDetail.setRowHeight(40);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRegisteredEventDetail = new javax.swing.JTable();
        txtSearch = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btnSearch = new javax.swing.JButton();
        lblRefresh = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

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

        lblMinimize5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/bar.png"))); // NOI18N
        lblMinimize5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMinimize5MouseClicked(evt);
            }
        });

        lblClose6.setForeground(new java.awt.Color(204, 0, 255));
        lblClose6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/x.png"))); // NOI18N
        lblClose6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblClose6MouseClicked(evt);
            }
        });

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
                .addContainerGap()
                .addComponent(lblMenu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUsername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMinimize5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblClose6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
                            .addGap(3, 3, 3)
                            .addComponent(lblMinimize5))))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pnlSlideMenu.setBackground(new java.awt.Color(51, 204, 255));
        pnlSlideMenu.setMinimumSize(new java.awt.Dimension(200, 0));

        pnlClose.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        pnlClose.setOpaque(false);
        pnlClose.setLayout(new java.awt.GridBagLayout());

        lblClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/close.png"))); // NOI18N
        lblClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCloseMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipady = -2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 200, 0, 0);
        pnlClose.add(lblClose, gridBagConstraints);

        pnlPage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        pnlPage.setOpaque(false);

        lblHome.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblHome.setText("Trang chủ");
        lblHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHomeMouseClicked(evt);
            }
        });

        lblAccount.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblAccount.setText("Tài khoản");

        lblJoinEvents.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblJoinEvents.setText("Tham gia sự kiện");

        lblJoinnedEvents.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblJoinnedEvents.setText("Sự kiện đã tham gia");

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
                .addContainerGap()
                .addComponent(lblHome)
                .addGap(18, 18, 18)
                .addComponent(lblAccount)
                .addGap(18, 18, 18)
                .addComponent(lblJoinEvents)
                .addGap(18, 18, 18)
                .addComponent(lblJoinnedEvents)
                .addContainerGap(104, Short.MAX_VALUE))
        );

        pnlfooter.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        pnlfooter.setOpaque(false);

        lblHelp.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblHelp.setText("Trợ giúp");

        lblSetting.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblSetting.setText("Cài đặt");

        lblLogOut.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblLogOut.setText("Đăng xuất");
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
                .addContainerGap()
                .addGroup(pnlSlideMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlClose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlfooter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlPage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        pnlSlideMenuLayout.setVerticalGroup(
            pnlSlideMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSlideMenuLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(pnlClose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlPage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlfooter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pnlContainer.setOpaque(false);
        pnlContainer.setLayout(new java.awt.GridBagLayout());

        tblRegisteredEventDetail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tblRegisteredEventDetail.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblRegisteredEventDetail.setShowGrid(true);
        jScrollPane1.setViewportView(tblRegisteredEventDetail);

        txtSearch.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtSearch.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtSearchFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSearchFocusLost(evt);
            }
        });
        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });

        btnSearch.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSearch.setText("Tìm kiếm");
        btnSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSearchMouseClicked(evt);
            }
        });

        lblRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-refresh-35.png"))); // NOI18N
        lblRefresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRefreshMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSearch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(lblRefresh)
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Danh sách chi tiết sự kiện đã đăng ký");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 812, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(txtSearch)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtSearch))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 394;
        gridBagConstraints.ipady = 15;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 12, 13, 0);
        pnlContainer.add(jPanel1, gridBagConstraints);

        jButton1.setBackground(new java.awt.Color(102, 204, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setText("Thanh toán");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnCancel.setBackground(new java.awt.Color(102, 204, 255));
        btnCancel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCancel.setText("Hủy đăng ký");
        btnCancel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancel)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap())
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.ipady = 391;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 18, 13, 12);
        pnlContainer.add(jPanel2, gridBagConstraints);

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
                .addGap(0, 0, 0)
                .addComponent(pnlContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        // TODO add your handling code here:
        setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_lblMinimize5MouseClicked

    private void lblClose6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblClose6MouseClicked
        // TODO add your handling code here:
        if ((JOptionPane.showConfirmDialog(this, "bạn có chắc chắn muốn thoát không?", "xác nhận thoát", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE)) == (JOptionPane.OK_OPTION)) {
            System.exit(0);
        }
    }//GEN-LAST:event_lblClose6MouseClicked

    private void lblMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenuMouseClicked
        // TODO add your handling code here:
        openMenu();
    }//GEN-LAST:event_lblMenuMouseClicked

    private void pnlHeaderMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlHeaderMouseDragged
        // TODO add your handling code here:
        int ox = evt.getXOnScreen();
        int oy = evt.getYOnScreen();
        setLocation(ox - mousePressX, oy - mousePressY);
    }//GEN-LAST:event_pnlHeaderMouseDragged

    private void pnlHeaderMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlHeaderMousePressed
        // TODO add your handling code here:
        mousePressX = evt.getX();
        mousePressY = evt.getY();
    }//GEN-LAST:event_pnlHeaderMousePressed

    private void lblCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseClicked
        // TODO add your handling code here:
        closeMenu();
    }//GEN-LAST:event_lblCloseMouseClicked

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

    private void lblRefreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRefreshMouseClicked
        showAllEvents();

    }//GEN-LAST:event_lblRefreshMouseClicked

    private void lblHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHomeMouseClicked
        try {
            // TODO add your handling code here:
            new UserView(Session.getLoggedInUser()).setVisible(true);

            this.dispose();
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(RegisteredEventView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_lblHomeMouseClicked

    private void btnCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseClicked
        // TODO add your handling code here:
        int selectedRow = tblRegisteredEventDetail.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn một sự kiện để hủy đăng ký!");
            return;
        }

        String eventId = tblRegisteredEventDetail.getValueAt(selectedRow, 0).toString();
        int userId = user.getUserId();

        // Hủy đăng ký sự kiện trong cơ sở dữ liệu
        boolean isCancelled = eventController.cancelRegistration(userId, eventId);
        if (isCancelled) {
            JOptionPane.showMessageDialog(this, "Hủy đăng ký sự kiện thành công!");
            DefaultTableModel model = (DefaultTableModel) tblRegisteredEventDetail.getModel();
            model.removeRow(selectedRow);
            Session.removeRegisteredEventById(eventId);
        } else {
            JOptionPane.showMessageDialog(this, "Có lỗi xảy ra khi hủy đăng ký sự kiện.");
        }
    }//GEN-LAST:event_btnCancelMouseClicked

    private void btnSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchMouseClicked
        // TODO add your handling code here:
        if (!Session.isLoggedIn()) {
            JOptionPane.showMessageDialog(this, "Vui lòng đăng nhập trước khi đăng ký sự kiện.");
            try {
                new LogInView().setVisible(true);
            } catch (SQLException ex) {
                java.util.logging.Logger.getLogger(RegisteredEventView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
            this.dispose();
            return;
        }

        String key = txtSearch.getText();

        if (key.equals("") || key.equals("nhập mã sự kiện hoặc tên sự kiện cần tìm ở đây")) {
            JOptionPane.showMessageDialog(this, "hãy nhập mã sự kiện hoặc tên sự kiện cần tìm!", "thông báo", JOptionPane.INFORMATION_MESSAGE);
            showAllEvents();
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblRegisteredEventDetail.getModel();

        model.setRowCount(0);

        List<Event> registeredEvents;
        registeredEvents = eventController.getRegisteredEventsByUserId(Session.getLoggedInUser().getUserId());
        boolean found = false;
        for (Event event : registeredEvents) {
            if (event.getEventId().toLowerCase().contains(key) || event.getEventName().toLowerCase().contains(key)) {
                model.addRow(new Object[]{
                    event.getEventId(),
                    event.getEventName(),
                    event.getStartDate(),
                    event.getEndDate(),
                    event.getLocation(),
                    event.getDescription(),
                    event.getStatus(),
                    event.getPrice()
                });
                found = true;
                txtSearch.setText("");
            }
        }
        if (!found) {
            JOptionPane.showMessageDialog(this, "không có thông tin về '" + key + "'");
            txtSearch.requestFocus();
        }
    }//GEN-LAST:event_btnSearchMouseClicked

    private void txtSearchFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSearchFocusGained
        // TODO add your handling code here:
        if (txtSearch.getText().equals("nhập mã sự kiện hoặc tên sự kiện cần tìm ở đây")) {
            txtSearch.setText("");
            txtSearch.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtSearchFocusGained

    private void txtSearchFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSearchFocusLost
        // TODO add your handling code here:
        if (txtSearch.getText().isEmpty()) {
            txtSearch.setForeground(Color.GRAY);
            txtSearch.setText("nhập mã sự kiện hoặc tên sự kiện cần tìm ở đây");
        }
    }//GEN-LAST:event_txtSearchFocusLost

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
        btnSearchMouseClicked(null);
    }//GEN-LAST:event_txtSearchActionPerformed

    int width = 270;

    private void openMenu() {

        new Thread(new Runnable() {
            @Override
            public void run() {
                int height = pnlSlideMenu.getHeight();
                for (int i = 0; i < width; i += 10) {
                    pnlSlideMenu.setSize(i, height);
                    pnlContainer.setBounds(i, pnlContainer.getY(), pnlMain.getWidth() - i, pnlContainer.getHeight());
                    try {
                        Thread.sleep(2);
                    } catch (InterruptedException ex) {
                        java.util.logging.Logger.getLogger(RegisteredEventView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                    }
                }

            }
        }).start();
    }

    private void closeMenu() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                int height = pnlSlideMenu.getHeight();
                for (int i = width; i >= 0; i -= 10) {
                    pnlSlideMenu.setSize(i, height);
                    pnlContainer.setBounds(i, pnlContainer.getY(), pnlMain.getWidth() - i, pnlContainer.getHeight());
                    try {
                        Thread.sleep(2);
                    } catch (InterruptedException ex) {
                        java.util.logging.Logger.getLogger(RegisteredEventView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                    }
                }
            }
        }).start();
    }

    private void showAllEvents() {
        DefaultTableModel detailModel = (DefaultTableModel) tblRegisteredEventDetail.getModel();
        List<Event> registeredEvents = eventController.getRegisteredEventsByUserId(user.getUserId());
        detailModel.setRowCount(0);
        Timer time = new Timer(100, new ActionListener() {
            int index = 0;

            @Override
            public void actionPerformed(ActionEvent e) {
                if (index < registeredEvents.size()) {
                    Event event = registeredEvents.get(index);
                    Object[] row = {
                        event.getEventId(),
                        event.getEventName(),
                        event.getStartDate(),
                        event.getEndDate(),
                        event.getLocation(),
                        event.getDescription(),
                        event.getStatus(),
                        event.getPrice()
                    };
                    detailModel.addRow(row);
                    index++;
                } else {
                    ((Timer) e.getSource()).stop();
                }
            }

        });
        time.start();
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
            java.util.logging.Logger.getLogger(RegisteredEventView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisteredEventView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisteredEventView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisteredEventView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new RegisteredEventView().setVisible(true);
            } catch (SQLException ex) {
                java.util.logging.Logger.getLogger(RegisteredEventView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
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
    private javax.swing.JLabel lblRefresh;
    private javax.swing.JLabel lblSetting;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPanel pnlClose;
    private javax.swing.JPanel pnlContainer;
    private javax.swing.JPanel pnlHeader;
    private javax.swing.JPanel pnlMain;
    private javax.swing.JPanel pnlPage;
    private javax.swing.JPanel pnlSlideMenu;
    private javax.swing.JPanel pnlfooter;
    private javax.swing.JTable tblRegisteredEventDetail;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
