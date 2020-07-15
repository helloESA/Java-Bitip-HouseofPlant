
package gui;

import control.masterBarang;
import control.pelanggan;

/**
 *
 * @author meri
 */
public class frmCariBarang extends javax.swing.JDialog {
    masterBarang mb;
    
    pelanggan pl;
    String caller ="";
    /**
     * Creates new form frmCariBarang
     */
    public frmCariBarang(java.awt.Frame parent, boolean modal,String caller) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        mb = new masterBarang();
        pl = new pelanggan();
        
        this.caller = caller;
        tampil();
  
    }

      public void tampil(){
          if(caller.equalsIgnoreCase("Transaksi")){
              tabel.setModel(mb.modelBarang);
        mb.modelBarang.setRowCount(0);
        mb.tampil();
          }else if(caller.equalsIgnoreCase("Pelanggan")){
              tabel.setModel(pl.model);
              pl.model.setRowCount(0);
              pl.tampil();
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 194, 179));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "Kode Barang", "Nama Barang", "Stok", "Harga Barang", "Keterangan"
            }
        ));
        tabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabel);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 20, 615, 227));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_checkmark_35px.png"))); // NOI18N
        jButton1.setText("OK");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(561, 265, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 330));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    
        if(caller.equalsIgnoreCase("Transaksi")){
           int row = tabel.getSelectedRow();
       String kode = tabel.getValueAt(row, 0).toString();
       String nama = tabel.getValueAt(row, 1).toString();
       int stok = Integer.parseInt(tabel.getValueAt(row, 2).toString());
       int harga = Integer.parseInt(tabel.getValueAt(row, 3).toString());

       Transaksi.txkode.setText(kode);
       Transaksi.txnama.setText(nama);
       Transaksi.harga = harga;
       Transaksi.stok = stok;
//       Transaksi.txtketerangan.setText(keterangan);
       Transaksi.txqty.setEditable(true);
       Transaksi.btnSimpan.setEnabled(true);
       Transaksi.txqty.requestFocus();
       dispose();
        }else if(caller.equalsIgnoreCase("Pelanggan")){
            int row = tabel.getSelectedRow();
            String id = tabel.getValueAt(row, 0).toString();
            String nama = tabel.getValueAt(row, 1).toString();
            Transaksi.txidPelanggan.setText(id);
            Transaksi.txpelanggan.setText(nama);
            dispose();
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelMouseClicked
        // TODO add your handling code here:
       
    }//GEN-LAST:event_tabelMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
     
    }//GEN-LAST:event_jButton1MouseClicked

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
            java.util.logging.Logger.getLogger(frmCariBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCariBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCariBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCariBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frmCariBarang dialog = new frmCariBarang(new javax.swing.JFrame(), true,"");
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabel;
    // End of variables declaration//GEN-END:variables
}
