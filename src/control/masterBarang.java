
package control;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author meri
 */
public class masterBarang extends koneksi{
    public masterBarang(){
        super.setKoneksi();
    }
    public DefaultTableModel modelBarang = new  DefaultTableModel();
    
    public void simpan(String kode,String nama,int stok,int harga, String keterangan) throws SQLException{
        String sql = "INSERT INTO masterbarang VALUES('"+kode+"','"+nama+"','"+stok+"','"+harga+"','"+keterangan+"')";
        st.executeUpdate(sql);
    }
    public void edit(String kode,String nama,int stok,int harga, String keterangan) throws SQLException{
        String sql = "UPDATE masterbarang set nama_barang = '"+nama+"', stok = '"+stok+"', harga = '"+harga+"', keterangan = '"+keterangan+"' WHERE kode_barang = '"+kode+"' ";
        st.executeUpdate(sql);
    }
    public void hapus(String kode) throws SQLException{
        String sql = "DELETE FROM masterbarang WHERE kode_barang = '"+kode+"'";
        st.executeUpdate(sql);
    }
    public void tampil(){
        try {
//            String sql = "SELECT * FROM edit_barang WHERE nama_barang LIKE '%" + nama + "%'";
           String sqli= "SELECT * FROM masterbarang" ;
            String[] kolom = {"Kode Barang","Nama Barang","Stok","Harga","Keterangan"};
            modelBarang.setColumnIdentifiers(kolom);
            rs = st.executeQuery(sqli);
            while(rs.next()){
            Object[] data = new Object[5];
            data[0] = rs.getString("kode_barang");
            data[1] = rs.getString("nama_barang");
            data[2] = rs.getString("stok");
            data[3] = rs.getString("harga");
            data[4] = rs.getString("keterangan");
         
            modelBarang.addRow(data);
            
            }    
        } 
        catch (SQLException ex) {
            Logger.getLogger(masterBarang.class.getName()).log(Level.SEVERE, null, ex);
        }
        } 
        //catch (SQLException ex) {
//            Logger.getLogger(masterBarang.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }

