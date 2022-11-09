package Views;

import Helper.DialogHelper;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import Helper.ShareHelper;
import javax.swing.border.TitledBorder;

public class mainFrame extends javax.swing.JFrame {

    public mainFrame() {
        initComponents();
        init();
    }

    private void init() {
        setIconImage(ShareHelper.APP_ICON);
        setLocationRelativeTo(null);
        lblLogo.setIcon(ResizeImage("/Icons/logo-ND.png"));
        this.pack();
//        startDongHo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pnlMenu = new javax.swing.JPanel();
        pnlLogo = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblThuGon = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        pnlPhong = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        lblPhong = new javax.swing.JLabel();
        pnlKhachThue = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        lblKhachThue = new javax.swing.JLabel();
        pnlHoaDon = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lblHoaDon = new javax.swing.JLabel();
        pnlHopDong = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        lblHopDong = new javax.swing.JLabel();
        pnlDichVu = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        lblDichVu = new javax.swing.JLabel();
        pnlThongKe = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        lblThongKe = new javax.swing.JLabel();
        pnlThoat = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        lblThoat = new javax.swing.JLabel();
        pnlCaiDat = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        lblCaiDat = new javax.swing.JLabel();
        pnlHuongDan = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        lblHuongDan = new javax.swing.JLabel();
        pnlWindow = new javax.swing.JPanel();
        pnlTrangThai = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        lblDongHo = new javax.swing.JLabel();
        pnlMenuBar = new javax.swing.JPanel();
        btnDangXuat = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        lblMoRong = new javax.swing.JLabel();
        lblExit = new javax.swing.JLabel();
        lblTool = new javax.swing.JLabel();
        lblGuide = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Quản lí nhà trọ");
        setPreferredSize(new java.awt.Dimension(1500, 1000));

        jPanel1.setMinimumSize(new java.awt.Dimension(1500, 950));
        jPanel1.setPreferredSize(new java.awt.Dimension(1500, 950));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlMenu.setBackground(new java.awt.Color(0, 153, 153));
        pnlMenu.setPreferredSize(new java.awt.Dimension(330, 900));
        pnlMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlLogo.setBackground(new java.awt.Color(0, 156, 175));

        lblLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/logo-ND.png"))); // NOI18N

        javax.swing.GroupLayout pnlLogoLayout = new javax.swing.GroupLayout(pnlLogo);
        pnlLogo.setLayout(pnlLogoLayout);
        pnlLogoLayout.setHorizontalGroup(
            pnlLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLogoLayout.createSequentialGroup()
                .addContainerGap(98, Short.MAX_VALUE)
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98))
        );
        pnlLogoLayout.setVerticalGroup(
            pnlLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLogoLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pnlMenu.add(pnlLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 150));

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MENU");

        lblThuGon.setBackground(new java.awt.Color(0, 153, 153));
        lblThuGon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblThuGon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/left-arrow (2).png"))); // NOI18N
        lblThuGon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblThuGon.setOpaque(true);
        lblThuGon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblThuGonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblThuGonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblThuGonMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE)
                .addComponent(lblThuGon, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(lblThuGon, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        pnlMenu.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 330, 60));
        pnlMenu.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 330, 10));

        pnlPhong.setBackground(new java.awt.Color(0, 153, 153));
        pnlPhong.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlPhong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlPhongMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlPhongMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlPhongMouseExited(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(153, 0, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/house.png"))); // NOI18N

        lblPhong.setBackground(new java.awt.Color(0, 153, 153));
        lblPhong.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        lblPhong.setForeground(new java.awt.Color(255, 255, 255));
        lblPhong.setText("PHÒNG");

        javax.swing.GroupLayout pnlPhongLayout = new javax.swing.GroupLayout(pnlPhong);
        pnlPhong.setLayout(pnlPhongLayout);
        pnlPhongLayout.setHorizontalGroup(
            pnlPhongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPhongLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(lblPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlPhongLayout.setVerticalGroup(
            pnlPhongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPhongLayout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(pnlPhongLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPhong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlMenu.add(pnlPhong, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 330, 60));

        pnlKhachThue.setBackground(new java.awt.Color(0, 153, 153));
        pnlKhachThue.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlKhachThue.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlKhachThueMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlKhachThueMouseExited(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(153, 0, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/rating.png"))); // NOI18N

        lblKhachThue.setBackground(new java.awt.Color(0, 153, 153));
        lblKhachThue.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        lblKhachThue.setForeground(new java.awt.Color(255, 255, 255));
        lblKhachThue.setText("KHÁCH THUÊ");

        javax.swing.GroupLayout pnlKhachThueLayout = new javax.swing.GroupLayout(pnlKhachThue);
        pnlKhachThue.setLayout(pnlKhachThueLayout);
        pnlKhachThueLayout.setHorizontalGroup(
            pnlKhachThueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlKhachThueLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(lblKhachThue, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlKhachThueLayout.setVerticalGroup(
            pnlKhachThueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlKhachThueLayout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(pnlKhachThueLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblKhachThue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlMenu.add(pnlKhachThue, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 330, 60));

        pnlHoaDon.setBackground(new java.awt.Color(0, 153, 153));
        pnlHoaDon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlHoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlHoaDonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlHoaDonMouseExited(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(153, 0, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/bill.png"))); // NOI18N

        lblHoaDon.setBackground(new java.awt.Color(0, 153, 153));
        lblHoaDon.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        lblHoaDon.setForeground(new java.awt.Color(255, 255, 255));
        lblHoaDon.setText("HÓA ĐƠN");

        javax.swing.GroupLayout pnlHoaDonLayout = new javax.swing.GroupLayout(pnlHoaDon);
        pnlHoaDon.setLayout(pnlHoaDonLayout);
        pnlHoaDonLayout.setHorizontalGroup(
            pnlHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHoaDonLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(lblHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlHoaDonLayout.setVerticalGroup(
            pnlHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHoaDonLayout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(pnlHoaDonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlMenu.add(pnlHoaDon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 330, 60));

        pnlHopDong.setBackground(new java.awt.Color(0, 153, 153));
        pnlHopDong.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlHopDong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlHopDongMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlHopDongMouseExited(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(153, 0, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/contract.png"))); // NOI18N

        lblHopDong.setBackground(new java.awt.Color(0, 153, 153));
        lblHopDong.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        lblHopDong.setForeground(new java.awt.Color(255, 255, 255));
        lblHopDong.setText("HỢP ĐỒNG");

        javax.swing.GroupLayout pnlHopDongLayout = new javax.swing.GroupLayout(pnlHopDong);
        pnlHopDong.setLayout(pnlHopDongLayout);
        pnlHopDongLayout.setHorizontalGroup(
            pnlHopDongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHopDongLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(lblHopDong, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlHopDongLayout.setVerticalGroup(
            pnlHopDongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHopDongLayout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(pnlHopDongLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHopDong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlMenu.add(pnlHopDong, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 330, 60));

        pnlDichVu.setBackground(new java.awt.Color(0, 153, 153));
        pnlDichVu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlDichVu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlDichVuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlDichVuMouseExited(evt);
            }
        });

        jLabel11.setBackground(new java.awt.Color(153, 0, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/electric.png"))); // NOI18N

        lblDichVu.setBackground(new java.awt.Color(0, 153, 153));
        lblDichVu.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        lblDichVu.setForeground(new java.awt.Color(255, 255, 255));
        lblDichVu.setText("DỊCH VỤ");

        javax.swing.GroupLayout pnlDichVuLayout = new javax.swing.GroupLayout(pnlDichVu);
        pnlDichVu.setLayout(pnlDichVuLayout);
        pnlDichVuLayout.setHorizontalGroup(
            pnlDichVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDichVuLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(lblDichVu, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlDichVuLayout.setVerticalGroup(
            pnlDichVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDichVuLayout.createSequentialGroup()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(pnlDichVuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDichVu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlMenu.add(pnlDichVu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 330, 60));

        pnlThongKe.setBackground(new java.awt.Color(0, 153, 153));
        pnlThongKe.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlThongKe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlThongKeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlThongKeMouseExited(evt);
            }
        });

        jLabel17.setBackground(new java.awt.Color(153, 0, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/growth.png"))); // NOI18N

        lblThongKe.setBackground(new java.awt.Color(0, 153, 153));
        lblThongKe.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        lblThongKe.setForeground(new java.awt.Color(255, 255, 255));
        lblThongKe.setText("THỐNG KÊ");

        javax.swing.GroupLayout pnlThongKeLayout = new javax.swing.GroupLayout(pnlThongKe);
        pnlThongKe.setLayout(pnlThongKeLayout);
        pnlThongKeLayout.setHorizontalGroup(
            pnlThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlThongKeLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(lblThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlThongKeLayout.setVerticalGroup(
            pnlThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlThongKeLayout.createSequentialGroup()
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(pnlThongKeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblThongKe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlMenu.add(pnlThongKe, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 570, 330, 60));

        pnlThoat.setBackground(new java.awt.Color(0, 153, 153));
        pnlThoat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlThoat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlThoatMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlThoatMouseExited(evt);
            }
        });

        jLabel13.setBackground(new java.awt.Color(153, 0, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/exit-full-screen.png"))); // NOI18N

        lblThoat.setBackground(new java.awt.Color(0, 153, 153));
        lblThoat.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lblThoat.setForeground(new java.awt.Color(255, 255, 255));
        lblThoat.setText("THOÁT");
        lblThoat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblThoatMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlThoatLayout = new javax.swing.GroupLayout(pnlThoat);
        pnlThoat.setLayout(pnlThoatLayout);
        pnlThoatLayout.setHorizontalGroup(
            pnlThoatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlThoatLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(lblThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlThoatLayout.setVerticalGroup(
            pnlThoatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlThoatLayout.createSequentialGroup()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(pnlThoatLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblThoat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlMenu.add(pnlThoat, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 700, 330, 60));

        pnlCaiDat.setBackground(new java.awt.Color(0, 153, 153));
        pnlCaiDat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlCaiDat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlCaiDatMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlCaiDatMouseExited(evt);
            }
        });

        jLabel21.setBackground(new java.awt.Color(153, 0, 255));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/setting (1).png"))); // NOI18N

        lblCaiDat.setBackground(new java.awt.Color(0, 153, 153));
        lblCaiDat.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lblCaiDat.setForeground(new java.awt.Color(255, 255, 255));
        lblCaiDat.setText("CÀI ĐẶT");

        javax.swing.GroupLayout pnlCaiDatLayout = new javax.swing.GroupLayout(pnlCaiDat);
        pnlCaiDat.setLayout(pnlCaiDatLayout);
        pnlCaiDatLayout.setHorizontalGroup(
            pnlCaiDatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCaiDatLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(lblCaiDat, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlCaiDatLayout.setVerticalGroup(
            pnlCaiDatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCaiDatLayout.createSequentialGroup()
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(pnlCaiDatLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCaiDat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlMenu.add(pnlCaiDat, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 760, 330, 60));

        pnlHuongDan.setBackground(new java.awt.Color(0, 153, 153));
        pnlHuongDan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlHuongDan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlHuongDanMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlHuongDanMouseExited(evt);
            }
        });

        jLabel19.setBackground(new java.awt.Color(153, 0, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/info.png"))); // NOI18N

        lblHuongDan.setBackground(new java.awt.Color(0, 153, 153));
        lblHuongDan.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lblHuongDan.setForeground(new java.awt.Color(255, 255, 255));
        lblHuongDan.setText("HƯỚNG DẪN");

        javax.swing.GroupLayout pnlHuongDanLayout = new javax.swing.GroupLayout(pnlHuongDan);
        pnlHuongDan.setLayout(pnlHuongDanLayout);
        pnlHuongDanLayout.setHorizontalGroup(
            pnlHuongDanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHuongDanLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblHuongDan, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );
        pnlHuongDanLayout.setVerticalGroup(
            pnlHuongDanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHuongDanLayout.createSequentialGroup()
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHuongDanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHuongDan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlMenu.add(pnlHuongDan, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 820, 330, 60));

        jPanel1.add(pnlMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 880));

        pnlWindow.setBackground(new java.awt.Color(255, 255, 255));
        pnlWindow.setAlignmentX(0.0F);
        pnlWindow.setAlignmentY(0.0F);
        pnlWindow.setLayout(null);
        jPanel1.add(pnlWindow, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, 1130, 820));

        pnlTrangThai.setAlignmentX(0.0F);
        pnlTrangThai.setAlignmentY(0.0F);

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel15.setText("Phần mềm quản lý nhà trọ");

        lblDongHo.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        lblDongHo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDongHo.setText("Đồng hồ");

        javax.swing.GroupLayout pnlTrangThaiLayout = new javax.swing.GroupLayout(pnlTrangThai);
        pnlTrangThai.setLayout(pnlTrangThaiLayout);
        pnlTrangThaiLayout.setHorizontalGroup(
            pnlTrangThaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTrangThaiLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 588, Short.MAX_VALUE)
                .addComponent(lblDongHo, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        pnlTrangThaiLayout.setVerticalGroup(
            pnlTrangThaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTrangThaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addComponent(lblDongHo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(pnlTrangThai, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 880, 1480, 40));

        pnlMenuBar.setBackground(new java.awt.Color(0, 167, 193));
        pnlMenuBar.setAlignmentX(0.0F);
        pnlMenuBar.setAlignmentY(0.0F);
        pnlMenuBar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnDangXuat.setBackground(new java.awt.Color(204, 255, 255));
        btnDangXuat.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        btnDangXuat.setText("Đăng xuất");
        pnlMenuBar.add(btnDangXuat, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 10, -1, 40));

        jButton2.setBackground(new java.awt.Color(204, 255, 255));
        jButton2.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButton2.setText("Đổi mật khẩu");
        pnlMenuBar.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 10, -1, 40));

        jPanel1.add(pnlMenuBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 1130, 60));

        lblMoRong.setBackground(new java.awt.Color(0, 153, 153));
        lblMoRong.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        lblMoRong.setForeground(new java.awt.Color(255, 255, 255));
        lblMoRong.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMoRong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/menu (1).png"))); // NOI18N
        lblMoRong.setToolTipText("MENU");
        lblMoRong.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblMoRong.setOpaque(true);
        lblMoRong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMoRongMouseClicked(evt);
            }
        });
        jPanel1.add(lblMoRong, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 15, 50, 50));

        lblExit.setBackground(new java.awt.Color(153, 0, 255));
        lblExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/exit-full-screen.png"))); // NOI18N
        lblExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(lblExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 705, 50, 50));

        lblTool.setBackground(new java.awt.Color(153, 0, 255));
        lblTool.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTool.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/setting (1).png"))); // NOI18N
        lblTool.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(lblTool, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 765, 50, 50));

        lblGuide.setBackground(new java.awt.Color(153, 0, 255));
        lblGuide.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGuide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/info.png"))); // NOI18N
        lblGuide.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(lblGuide, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 825, 50, 50));

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1460, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 880, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1460, 880));
        jPanel2.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1461, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 930, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    int x = 330;
    private void lblThuGonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblThuGonMouseClicked
        if (x == 330) {
            pnlMenu.setSize(330, 900);
            pnlWindow.setLocation(80, 60);
            pnlWindow.setSize(1420, 840);
            pnlMenuBar.setLocation(80, 0);
            pnlMenuBar.setSize(1420, 60);
            Thread t = new Thread() {
                @Override
                public void run() {
                    try {
                        for (int i = 330; i >= 0; i--) {
                            Thread.sleep(0);
                            pnlMenu.setSize(i, 900);
                        }
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e);
                    }
                }
            };
            t.start();
            x = 0;
        }
    }//GEN-LAST:event_lblThuGonMouseClicked

    private void lblMoRongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMoRongMouseClicked
        if (x == 0) {
            pnlMenu.show();
            pnlMenu.setSize(x, 900);
            pnlWindow.show();
            pnlWindow.setLocation(330, 60);
            pnlWindow.setSize(1150, 840);
            pnlMenuBar.setLocation(330, 0);
            pnlMenuBar.setSize(1150, 60);
            Thread t = new Thread() {
                @Override
                public void run() {
                    try {
                        for (int i = 0; i <= x; i++) {
                            Thread.sleep(0);
                            pnlMenu.setSize(i, 900);
                        }
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e);
                    }
                }
            };
            t.start();
            x = 330;
        }

    }//GEN-LAST:event_lblMoRongMouseClicked

    private void pnlPhongMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlPhongMouseEntered
        pnlPhong.setBackground(new java.awt.Color(204, 255, 255));
        lblPhong.setForeground(Color.black);
    }//GEN-LAST:event_pnlPhongMouseEntered

    private void pnlPhongMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlPhongMouseExited
        pnlPhong.setBackground(new java.awt.Color(0, 153, 153));
        lblPhong.setForeground(Color.white);
    }//GEN-LAST:event_pnlPhongMouseExited

    private void pnlKhachThueMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlKhachThueMouseEntered
        pnlKhachThue.setBackground(new java.awt.Color(204, 255, 255));
        lblKhachThue.setForeground(Color.black);
    }//GEN-LAST:event_pnlKhachThueMouseEntered

    private void pnlKhachThueMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlKhachThueMouseExited
        pnlKhachThue.setBackground(new java.awt.Color(0, 153, 153));
        lblKhachThue.setForeground(Color.white);
    }//GEN-LAST:event_pnlKhachThueMouseExited

    private void pnlHoaDonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlHoaDonMouseEntered
        pnlHoaDon.setBackground(new java.awt.Color(204, 255, 255));
        lblHoaDon.setForeground(Color.black);
    }//GEN-LAST:event_pnlHoaDonMouseEntered

    private void pnlHoaDonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlHoaDonMouseExited
        pnlHoaDon.setBackground(new java.awt.Color(0, 153, 153));
        lblHoaDon.setForeground(Color.white);
    }//GEN-LAST:event_pnlHoaDonMouseExited

    private void pnlHopDongMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlHopDongMouseEntered
        pnlHopDong.setBackground(new java.awt.Color(204, 255, 255));
        lblHopDong.setForeground(Color.black);
    }//GEN-LAST:event_pnlHopDongMouseEntered

    private void pnlHopDongMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlHopDongMouseExited
        pnlHopDong.setBackground(new java.awt.Color(0, 153, 153));
        lblHopDong.setForeground(Color.white);
    }//GEN-LAST:event_pnlHopDongMouseExited

    private void pnlDichVuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlDichVuMouseEntered
        pnlDichVu.setBackground(new java.awt.Color(204, 255, 255));
        lblDichVu.setForeground(Color.black);
    }//GEN-LAST:event_pnlDichVuMouseEntered

    private void pnlDichVuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlDichVuMouseExited
        pnlDichVu.setBackground(new java.awt.Color(0, 153, 153));
        lblDichVu.setForeground(Color.white);
    }//GEN-LAST:event_pnlDichVuMouseExited

    private void pnlThongKeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlThongKeMouseEntered
        pnlThongKe.setBackground(new java.awt.Color(204, 255, 255));
        lblThongKe.setForeground(Color.black);
    }//GEN-LAST:event_pnlThongKeMouseEntered

    private void pnlThongKeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlThongKeMouseExited
        pnlThongKe.setBackground(new java.awt.Color(0, 153, 153));
        lblThongKe.setForeground(Color.white);
    }//GEN-LAST:event_pnlThongKeMouseExited

    private void pnlThoatMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlThoatMouseEntered
        pnlThoat.setBackground(new java.awt.Color(204, 255, 255));
        lblThoat.setForeground(Color.black);
    }//GEN-LAST:event_pnlThoatMouseEntered

    private void pnlThoatMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlThoatMouseExited
        pnlThoat.setBackground(new java.awt.Color(0, 153, 153));
        lblThoat.setForeground(Color.white);
    }//GEN-LAST:event_pnlThoatMouseExited

    private void pnlCaiDatMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlCaiDatMouseEntered
        pnlCaiDat.setBackground(new java.awt.Color(204, 255, 255));
        lblCaiDat.setForeground(Color.black);
    }//GEN-LAST:event_pnlCaiDatMouseEntered

    private void pnlCaiDatMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlCaiDatMouseExited
        pnlCaiDat.setBackground(new java.awt.Color(0, 153, 153));
        lblCaiDat.setForeground(Color.white);
    }//GEN-LAST:event_pnlCaiDatMouseExited

    private void pnlHuongDanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlHuongDanMouseEntered
        pnlHuongDan.setBackground(new java.awt.Color(204, 255, 255));
        lblHuongDan.setForeground(Color.black);
    }//GEN-LAST:event_pnlHuongDanMouseEntered

    private void pnlHuongDanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlHuongDanMouseExited
        pnlHuongDan.setBackground(new java.awt.Color(0, 153, 153));
        lblHuongDan.setForeground(Color.white);
    }//GEN-LAST:event_pnlHuongDanMouseExited

    private void lblThuGonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblThuGonMouseEntered
        lblThuGon.setBackground(new java.awt.Color(204, 255, 255));
    }//GEN-LAST:event_lblThuGonMouseEntered

    private void lblThuGonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblThuGonMouseExited
        lblThuGon.setBackground(new java.awt.Color(0, 153, 153));
    }//GEN-LAST:event_lblThuGonMouseExited

    private void lblThoatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblThoatMouseClicked
        if (DialogHelper.confirm(this, "Bạn có thực sự muốn thoát chưa?")) {
            DialogHelper.alert(this, "Chúc bạn một ngày tốt lành !");
            System.exit(0);
        }
    }//GEN-LAST:event_lblThoatMouseClicked

    private void pnlPhongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlPhongMouseClicked
        ThongKeFrame thongKe = new ThongKeFrame();
        thongKe.setBorder(new TitledBorder("Panel"));
        thongKe.setSize(1130, 820);
        thongKe.setVisible(false);
        pnlWindow.add(thongKe);
    }//GEN-LAST:event_pnlPhongMouseClicked

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainFrame().setVisible(true);
            }
        });
    }

    public ImageIcon ResizeImage(String linkAnh) {
        String file = linkAnh;
        Image img = new ImageIcon(ShareHelper.class.getResource(file)).getImage();
        Image newImg = img.getScaledInstance(lblLogo.getWidth(), lblLogo.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        pack();
        return image;
    }

    void startDongHo() {
        SimpleDateFormat formater = new SimpleDateFormat("dd/MM/yyyy      hh:mm:ss a");
        new Timer(1000, (ActionEvent e) -> {
            lblDongHo.setText(formater.format(new Date()));
        }).start();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangXuat;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblCaiDat;
    private javax.swing.JLabel lblDichVu;
    private javax.swing.JLabel lblDongHo;
    private javax.swing.JLabel lblExit;
    private javax.swing.JLabel lblGuide;
    private javax.swing.JLabel lblHoaDon;
    private javax.swing.JLabel lblHopDong;
    private javax.swing.JLabel lblHuongDan;
    private javax.swing.JLabel lblKhachThue;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblMoRong;
    private javax.swing.JLabel lblPhong;
    private javax.swing.JLabel lblThoat;
    private javax.swing.JLabel lblThongKe;
    private javax.swing.JLabel lblThuGon;
    private javax.swing.JLabel lblTool;
    private javax.swing.JPanel pnlCaiDat;
    private javax.swing.JPanel pnlDichVu;
    private javax.swing.JPanel pnlHoaDon;
    private javax.swing.JPanel pnlHopDong;
    private javax.swing.JPanel pnlHuongDan;
    private javax.swing.JPanel pnlKhachThue;
    private javax.swing.JPanel pnlLogo;
    private javax.swing.JPanel pnlMenu;
    private javax.swing.JPanel pnlMenuBar;
    private javax.swing.JPanel pnlPhong;
    private javax.swing.JPanel pnlThoat;
    private javax.swing.JPanel pnlThongKe;
    private javax.swing.JPanel pnlTrangThai;
    private javax.swing.JPanel pnlWindow;
    // End of variables declaration//GEN-END:variables
}
