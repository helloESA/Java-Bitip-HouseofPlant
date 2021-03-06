
package gui;

import com.jtattoo.plaf.mint.MintLookAndFeel;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.LookAndFeel;
import javax.swing.UIManager;
import com.jtattoo.plaf.mint.MintLookAndFeel;
import control.koneksi;
import control.laporan;
import control.utama;
import java.awt.Dialog;
import java.awt.event.ActionListener;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.UnsupportedLookAndFeelException;
import keeptoo.Drag;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author meri
 */
public class FormUtama extends javax.swing.JFrame {
laporan lp;
koneksi db;
utama ut;
    /**
     * Creates new form frmUtama
     */
    public FormUtama() {
        initComponents();
        db = new koneksi();
        ut = new utama();
        lp = new laporan();
        this.setLocationRelativeTo(null);
        this.setTitle("House Of Plants");
        ut.tampilCountTrx();
        ut.tampilCountBrg();
        ut.tampilCountPlg();
        tanggal();
        
   
    }

   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        jPanel3 = new javax.swing.JPanel();
        kGradientPanel4 = new keeptoo.KGradientPanel();
        jLabel8 = new javax.swing.JLabel();
        totalPlg = new javax.swing.JLabel();
        kGradientPanel3 = new keeptoo.KGradientPanel();
        jLabel9 = new javax.swing.JLabel();
        totalBrg = new javax.swing.JLabel();
        kGradientPanel2 = new keeptoo.KGradientPanel();
        jLabel7 = new javax.swing.JLabel();
        totalTrx = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btnPenjualan = new javax.swing.JButton();
        btnLaporan = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnInputBarang = new javax.swing.JButton();
        BtnUser = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        btnriwayat = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        btn_lihatproduk = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        kButton1 = new keeptoo.KButton();
        tgl = new javax.swing.JLabel();
        user1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel1.setkBorderRadius(0);
        kGradientPanel1.setkEndColor(new java.awt.Color(176, 105, 25));
        kGradientPanel1.setkStartColor(new java.awt.Color(6, 125, 103));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(240, 230, 229));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel4.setkEndColor(new java.awt.Color(57, 174, 186));
        kGradientPanel4.setkStartColor(new java.awt.Color(104, 240, 166));
        kGradientPanel4.setPreferredSize(new java.awt.Dimension(170, 50));
        kGradientPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Pelanggan");
        kGradientPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        totalPlg.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        totalPlg.setForeground(new java.awt.Color(255, 255, 255));
        totalPlg.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        totalPlg.setText("0");
        kGradientPanel4.add(totalPlg, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 26, 80, 30));

        jPanel3.add(kGradientPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 170, 60));

        kGradientPanel3.setkEndColor(new java.awt.Color(255, 141, 66));
        kGradientPanel3.setkStartColor(new java.awt.Color(255, 194, 179));
        kGradientPanel3.setPreferredSize(new java.awt.Dimension(170, 50));
        kGradientPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Jenis Barang");
        kGradientPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        totalBrg.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        totalBrg.setForeground(new java.awt.Color(255, 255, 255));
        totalBrg.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        totalBrg.setText("0");
        kGradientPanel3.add(totalBrg, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 70, 40));

        jPanel3.add(kGradientPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 60, 170, 60));

        kGradientPanel2.setkEndColor(new java.awt.Color(176, 212, 34));
        kGradientPanel2.setkStartColor(new java.awt.Color(176, 105, 25));
        kGradientPanel2.setPreferredSize(new java.awt.Dimension(170, 50));
        kGradientPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Total Transaksi");
        kGradientPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 0, 120, -1));

        totalTrx.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        totalTrx.setForeground(new java.awt.Color(255, 255, 255));
        totalTrx.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        totalTrx.setText("0");
        kGradientPanel2.add(totalTrx, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 26, 80, 30));

        jPanel3.add(kGradientPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, 170, 60));

        jPanel2.setBackground(new java.awt.Color(240, 230, 229));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(6, 125, 103)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(176, 105, 25));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("INPUT BARANG");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 170, -1));

        btnPenjualan.setBackground(new java.awt.Color(255, 255, 255));
        btnPenjualan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_user_groups_55px.png"))); // NOI18N
        btnPenjualan.setPreferredSize(new java.awt.Dimension(170, 120));
        btnPenjualan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPenjualanActionPerformed(evt);
            }
        });
        jPanel2.add(btnPenjualan, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, -1, -1));

        btnLaporan.setBackground(new java.awt.Color(255, 255, 255));
        btnLaporan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/laporan keuangan_1.png"))); // NOI18N
        btnLaporan.setPreferredSize(new java.awt.Dimension(170, 120));
        btnLaporan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLaporanActionPerformed(evt);
            }
        });
        jPanel2.add(btnLaporan, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(176, 105, 25));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("RIWAYAT PEMBELIAN");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, 170, -1));

        btnInputBarang.setBackground(new java.awt.Color(255, 255, 255));
        btnInputBarang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/input barang.png"))); // NOI18N
        btnInputBarang.setPreferredSize(new java.awt.Dimension(170, 120));
        btnInputBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInputBarangActionPerformed(evt);
            }
        });
        jPanel2.add(btnInputBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        BtnUser.setBackground(new java.awt.Color(255, 255, 255));
        BtnUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/data admin.png"))); // NOI18N
        BtnUser.setPreferredSize(new java.awt.Dimension(170, 120));
        BtnUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnUserActionPerformed(evt);
            }
        });
        jPanel2.add(BtnUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(176, 105, 25));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("DATA PEMBELI");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 140, 170, -1));

        btnriwayat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/histori penjualan.png"))); // NOI18N
        btnriwayat.setPreferredSize(new java.awt.Dimension(170, 120));
        btnriwayat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnriwayatActionPerformed(evt);
            }
        });
        jPanel2.add(btnriwayat, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(176, 105, 25));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("LAPORAN KEUANGAN");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 190, -1));

        jLabel13.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(176, 105, 25));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("DATA ADMIN");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 170, -1));

        btn_lihatproduk.setBackground(new java.awt.Color(255, 255, 255));
        btn_lihatproduk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/cart.png"))); // NOI18N
        btn_lihatproduk.setPreferredSize(new java.awt.Dimension(120, 120));
        btn_lihatproduk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_lihatprodukActionPerformed(evt);
            }
        });
        jPanel2.add(btn_lihatproduk, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 190, 170, 120));

        jLabel5.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(176, 105, 25));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("TRANSAKSI");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 310, 170, -1));

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 650, 370));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/admin.png"))); // NOI18N
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, -1));

        kButton1.setText("LOGOUT");
        kButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        kButton1.setkEndColor(new java.awt.Color(204, 204, 0));
        kButton1.setkStartColor(new java.awt.Color(255, 51, 51));
        kButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(kButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 510, 150, 40));

        tgl.setBackground(new java.awt.Color(0, 204, 204));
        tgl.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        tgl.setForeground(new java.awt.Color(6, 125, 103));
        tgl.setText("Senin 5 Maret 2020");
        jPanel3.add(tgl, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, 260, -1));

        user1.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        user1.setForeground(new java.awt.Color(176, 105, 25));
        user1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        user1.setText("ADMIN");
        jPanel3.add(user1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 250, -1));

        kGradientPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 750, 560));

        getContentPane().add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -5, 770, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnUserActionPerformed
        // TODO add your handling code here:
        frmUser frm = new frmUser(this, rootPaneCheckingEnabled);
        frm.setTitle("MANAJEMEN USER");
        frm.setVisible(true);
    }//GEN-LAST:event_BtnUserActionPerformed

    private void btnInputBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInputBarangActionPerformed
        // TODO add your handling code here:
        frmInputBarang frm = new frmInputBarang(this, rootPaneCheckingEnabled);
        frm.setTitle("MANAJEMEN BARANG");

        frm.setVisible(true);

    }//GEN-LAST:event_btnInputBarangActionPerformed

    private void btnLaporanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLaporanActionPerformed
        // TODO add your handling code here:
        frmLaporan frm = new frmLaporan(this, rootPaneCheckingEnabled);
        frm.setTitle("LAPORAN");
        frm.setVisible(true);
    }//GEN-LAST:event_btnLaporanActionPerformed

    private void btnPenjualanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPenjualanActionPerformed
        // TODO add your handling code here:
        frmPelanggan frm = new frmPelanggan(this, rootPaneCheckingEnabled);
        frm.setTitle("PELANGGAN");

        frm.setVisible(true);
    }//GEN-LAST:event_btnPenjualanActionPerformed

    private void kButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton1ActionPerformed
        // TODO add your handling code here:
        frmLogin frm = new frmLogin();
        dispose();
      
        frm.setVisible(true);
        
    }//GEN-LAST:event_kButton1ActionPerformed

    private void btnriwayatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnriwayatActionPerformed
        history hh = new history(this, rootPaneCheckingEnabled);
        hh.setTitle("RIWAYAT PEMBELIAN");
        hh.setLocationRelativeTo(null);
        hh.setVisible(true);
    }//GEN-LAST:event_btnriwayatActionPerformed

    private void btn_lihatprodukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_lihatprodukActionPerformed
        Transaksi frm = new Transaksi();
        Transaksi.txKasir.setText(user1.getText());
        frm.setTitle("TRANSAKSI");
        frm.setVisible(true);
    }//GEN-LAST:event_btn_lihatprodukActionPerformed

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
            java.util.logging.Logger.getLogger(FormUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
              
                new FormUtama().setVisible(true);
            }  
        });
    }
    
    public void tanggal(){
        SimpleDateFormat format = new SimpleDateFormat("EEEE dd MMMM yyyy");
        Date date = new Date();
        tgl.setText(format.format(date));
       
     
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnUser;
    private javax.swing.JButton btnInputBarang;
    private javax.swing.JButton btnLaporan;
    private javax.swing.JButton btnPenjualan;
    private javax.swing.JButton btn_lihatproduk;
    private javax.swing.JButton btnriwayat;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private keeptoo.KButton kButton1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel2;
    private keeptoo.KGradientPanel kGradientPanel3;
    private keeptoo.KGradientPanel kGradientPanel4;
    private javax.swing.JLabel tgl;
    public static javax.swing.JLabel totalBrg;
    public static javax.swing.JLabel totalPlg;
    public static javax.swing.JLabel totalTrx;
    public static javax.swing.JLabel user1;
    // End of variables declaration//GEN-END:variables
}
