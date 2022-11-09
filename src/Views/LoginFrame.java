package Views;

import DAO.NguoiDungDAO;
import Helper.DialogHelper;
import Helper.ShareHelper;
import Model.NguoiDung;

public class LoginFrame extends javax.swing.JFrame {

    public LoginFrame() {
        initComponents();
        init();
    }

    NguoiDungDAO dao = new NguoiDungDAO();

    // lệnh cài đặt cơ bản
    private void init() {
        setIconImage(ShareHelper.APP_ICON);
        setLocationRelativeTo(null);
        pack();
    }

    private void login() {
        String manv = txtTaiKhoan.getText();
        String matKhau = new String(txtPass.getPassword());
        try {
            NguoiDung nguoiDung = dao.findById(manv);

            if (nguoiDung != null) {
                String matKhau2 = nguoiDung.getMatKhau();
                if (matKhau.equals(matKhau2)) {
                    ShareHelper.USER = nguoiDung;
                    new LoadingFrame().setVisible(true);
                    this.dispose();
                } else {
                    DialogHelper.alert(this, "Sai mật khẩu!");
                }
            } else {
                DialogHelper.alert(this, "Sai tên đăng nhập!");
            }
        } catch (Exception e) {
            DialogHelper.alert(this, "Lỗi truy vấn dữ liệu!");
            System.out.println(e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        chkNhoMK = new javax.swing.JCheckBox();
        lblQuenMK = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        txtTaiKhoan = new Swing_palette.TextField();
        txtPass = new Swing_palette.PasswordField();
        lblTheme = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Đăng nhập vào hệ thống");
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 156, 175));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, null, null, java.awt.Color.black));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_house_100px_2.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("QUẢN LÝ NHÀ TRỌ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, 490, -1));

        chkNhoMK.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chkNhoMK.setForeground(new java.awt.Color(255, 255, 255));
        chkNhoMK.setText("Remember me?");
        jPanel2.add(chkNhoMK, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        lblQuenMK.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblQuenMK.setForeground(new java.awt.Color(255, 255, 255));
        lblQuenMK.setText("Quên mật khẩu?");
        lblQuenMK.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(lblQuenMK, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 250, -1, 20));

        btnLogin.setBackground(new java.awt.Color(0, 153, 153));
        btnLogin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("ĐĂNG NHẬP");
        btnLogin.setBorder(null);
        btnLogin.setFocusable(false);
        btnLogin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLoginMouseClicked(evt);
            }
        });
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel2.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 400, 40));

        txtTaiKhoan.setBackground(new java.awt.Color(0, 156, 175));
        txtTaiKhoan.setToolTipText("Nhập tài khoản");
        txtTaiKhoan.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        txtTaiKhoan.setLabelText("Tài khoản");
        txtTaiKhoan.setLineColor(new java.awt.Color(255, 255, 255));
        jPanel2.add(txtTaiKhoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 400, -1));

        txtPass.setBackground(new java.awt.Color(0, 156, 175));
        txtPass.setToolTipText("Nhập mật khẩu");
        txtPass.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        txtPass.setLabelText("Mật khẩu");
        txtPass.setLineColor(new java.awt.Color(255, 255, 255));
        txtPass.setShowAndHide(true);
        jPanel2.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 400, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 495, 360));

        lblTheme.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/logintheme.jpg"))); // NOI18N
        jPanel1.add(lblTheme, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseClicked
        login();
    }//GEN-LAST:event_btnLoginMouseClicked

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLoginActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JCheckBox chkNhoMK;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblQuenMK;
    private javax.swing.JLabel lblTheme;
    private Swing_palette.PasswordField txtPass;
    private Swing_palette.TextField txtTaiKhoan;
    // End of variables declaration//GEN-END:variables
}
