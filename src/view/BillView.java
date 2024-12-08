/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.OrderController;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Order;
import model.User;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import util.Session;

/**
 *
 * @author annc1
 */
public class BillView extends javax.swing.JFrame {

    private Order order;
    private OrderController orderController;
    private User user;

    /**
     * Creates new form BillView
     */
    public BillView() {
        initComponents();
        setLocationRelativeTo(null);

    }

    public BillView(Order order) {
        initComponents();
        setLocationRelativeTo(null);
        orderController = new OrderController();
        lblOrderId.setText(String.valueOf(order.getOrderId()));
        lblUserId.setText(String.valueOf(order.getUserId()));
        lblFullname.setText(order.getFullName());
        lblEventId.setText(order.getEventId());
        lblEventName.setText(order.getEventName());
        lblDateOrder.setText(order.getOrderDate().toString());
        lblPrice.setText(String.valueOf(order.getTotalPrice()));
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblOrderId = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblUserId = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblFullname = new javax.swing.JLabel();
        lblDateOrder = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblEventId = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblEventName = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lblPrice = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnPayNow = new javax.swing.JButton();
        btnPayLater = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(java.awt.SystemColor.textHighlight);

        jPanel1.setBackground(java.awt.SystemColor.textHighlight);

        jPanel2.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Thanh toán hóa đơn");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setOpaque(false);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Mã hóa đơn: ");

        lblOrderId.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        lblOrderId.setForeground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ID người dùng: ");

        lblUserId.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        lblUserId.setForeground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Họ tên: ");

        lblFullname.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        lblFullname.setForeground(new java.awt.Color(255, 255, 255));

        lblDateOrder.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        lblDateOrder.setForeground(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Mã sự kiện: ");

        lblEventId.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        lblEventId.setForeground(new java.awt.Color(255, 255, 255));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Tên sự kiện: ");

        lblEventName.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        lblEventName.setForeground(new java.awt.Color(255, 255, 255));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Ngày đăng ký: ");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Giá vé: ");

        lblPrice.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        lblPrice.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblOrderId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblUserId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblFullname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblEventId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblEventName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblDateOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblOrderId, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUserId, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFullname, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEventId, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEventName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDateOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setOpaque(false);

        btnPayNow.setBackground(java.awt.SystemColor.activeCaptionBorder);
        btnPayNow.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnPayNow.setText("thanh toán ngay");
        btnPayNow.setBorder(null);
        btnPayNow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPayNowMouseClicked(evt);
            }
        });

        btnPayLater.setBackground(java.awt.SystemColor.activeCaptionBorder);
        btnPayLater.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnPayLater.setText("thanh toán tại quầy sau");
        btnPayLater.setBorder(null);
        btnPayLater.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPayLaterMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnPayLater, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPayNow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPayNow, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPayLater, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPayNowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPayNowMouseClicked
        try {
            int orderId = Integer.parseInt(lblOrderId.getText());
            boolean paid = orderController.PaidOrder(orderId); // Kiểm tra nếu đã thanh toán
            if (!paid) {
                boolean isUpdateBill = orderController.updatePaymentStatus(orderId, "Đã thanh toán");
                if (isUpdateBill) {
                    JOptionPane.showMessageDialog(this, "Thanh toán hóa đơn thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                    exportToTxt(Session.getOrder());
                    exportToExcel(Session.getOrder());
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(this, "Không thể cập nhật trạng thái thanh toán!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Hóa đơn này đã được thanh toán!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                this.dispose();
            }
        } catch (SQLException ex) {
            Logger.getLogger(BillView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnPayNowMouseClicked
    
    public void exportToExcel(Order order) {
        if (order == null) {
            System.out.println("Thông tin đơn hàng rỗng!");
            return;
        }
        // Lấy đường dẫn thư mục gốc của dự án
        String projectRoot = System.getProperty("user.dir");
        String directoryPath = projectRoot + File.separator + "AllBills";

        // Kiểm tra và tạo thư mục nếu chưa tồn tại
        File directory = new File(directoryPath);
        if (!directory.exists()) {
            directory.mkdirs();
        }

        // Đặt đường dẫn và tên file Excel theo mẫu: orderId_fullname_eventId.xlsx
        String fileName = order.getOrderId() + "_" + order.getFullName() + "_" + order.getEventId() + ".xlsx";
        String filePath = directoryPath + File.separator + fileName;

        // Tạo file Excel
        try (FileOutputStream fileOut = new FileOutputStream(filePath); Workbook workbook = new XSSFWorkbook()) {

            Sheet sheet = workbook.createSheet("Hóa đơn");

            // Tạo header (mỗi lần xuất thì tạo lại)
            Row headerRow = sheet.createRow(0);
            headerRow.createCell(0).setCellValue("Mã hóa đơn");
            headerRow.createCell(1).setCellValue("Tên khách hàng");
            headerRow.createCell(2).setCellValue("Mã sự kiện");
            headerRow.createCell(3).setCellValue("Tên sự kiện");
            headerRow.createCell(4).setCellValue("Ngày đặt");
            headerRow.createCell(5).setCellValue("Tổng tiền");

            // Tạo dòng dữ liệu mới
            int lastRow = sheet.getPhysicalNumberOfRows();
            Row dataRow = sheet.createRow(lastRow);

            dataRow.createCell(0).setCellValue(order.getOrderId());
            dataRow.createCell(1).setCellValue(order.getFullName());
            dataRow.createCell(2).setCellValue(order.getEventId());
            dataRow.createCell(3).setCellValue(order.getEventName());
            dataRow.createCell(4).setCellValue(order.getOrderDate().toString());
            dataRow.createCell(5).setCellValue(order.getTotalPrice());

            // Lưu file Excel
            workbook.write(fileOut);
            System.out.println("Hóa đơn đã được thêm vào Excel thành công!");

        } catch (IOException e) {
            System.out.println("Lỗi khi tạo hoặc lưu file Excel: " + e.getMessage());
        }
    }

    private void exportToTxt(Order order) {
        if (order == null) {
            JOptionPane.showMessageDialog(this, "Thông tin đơn hàng không hợp lệ!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int orderId = order.getOrderId();
        String fullName = order.getFullName();
        String eventId = order.getEventId();
        String eventName = order.getEventName();
        String orderDate = order.getOrderDate().toString();
        String totalPrice = String.valueOf(order.getTotalPrice());

        String fileName = orderId + "_" + fullName + "_" + eventId + ".txt";
        String parentDirectory = System.getProperty("user.dir");
        String directoryPath = parentDirectory + File.separator + "AllBills";

        File directory = new File(directoryPath);
        if (!directory.exists()) {
            directory.mkdirs();
        }

        File file = new File(directoryPath, fileName);

        try {
            // Ghi vào file
            try (FileWriter writer = new FileWriter(file)) {
                writer.write("Hóa đơn thanh toán\n");
                writer.write("Mã hóa đơn: " + orderId + "\n");
                writer.write("Họ tên: " + fullName + "\n");
                writer.write("ID sự kiện: " + eventId + "\n");
                writer.write("Tên sự kiện: " + eventName + "\n");
                writer.write("Ngày đặt: " + orderDate + "\n");
                writer.write("Giá vé: " + totalPrice + " VNĐ\n");
                writer.write("Thanh toán: Đã thanh toán\n");
            }
            JOptionPane.showMessageDialog(this, "File hóa đơn đã được lưu tại: " + file.getAbsolutePath());

        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Lỗi khi lưu file: " + e.getMessage());
        }
    }


    private void btnPayLaterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPayLaterMouseClicked
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPayLaterMouseClicked

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
            java.util.logging.Logger.getLogger(BillView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BillView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BillView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BillView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new BillView().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPayLater;
    private javax.swing.JButton btnPayNow;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblDateOrder;
    private javax.swing.JLabel lblEventId;
    private javax.swing.JLabel lblEventName;
    private javax.swing.JLabel lblFullname;
    private javax.swing.JLabel lblOrderId;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblUserId;
    // End of variables declaration//GEN-END:variables
}
