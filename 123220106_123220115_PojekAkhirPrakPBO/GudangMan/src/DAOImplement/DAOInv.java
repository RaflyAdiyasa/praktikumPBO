package DAOImplement;

import Config.Connector;
import DAOInterface.DAOInvInterface;
import Model.DataInv;
import Notify.Notify;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DAOInv implements DAOInvInterface{
    
    Connection conn;
    final String select = "SELECT * FROM Inventory";
    final String search = "SELECT * FROM Inventory WHERE nama LIKE ?";
    final String insert = "INSERT INTO Inventory (nama, jumlah, harga, tanggal, subtotal) VALUES (?,?,?,?,?)";
    final String update = "UPDATE Inventory SET nama=?, jumlah=?, harga=?, tanggal=?, subtotal=? WHERE id=?";
    final String delete = "DELETE FROM Inventory WHERE id=?";
    
    public DAOInv() {
        conn = Connector.getConnection();
    }

    @Override
    public void insert(DataInv di) {
        PreparedStatement statement = null;
        try {
            statement = conn.prepareStatement(insert);
            statement.setString(1, di.getNama());
            statement.setInt(2, di.getJumlah());
            statement.setInt(3, di.getHarga());
            statement.setString(4, di.getTanggal());
            statement.setInt(5, di.getSubTotal());
            int rowInserted = statement.executeUpdate();
            if (rowInserted > 0) {
                Notify notify = new Notify("Data berhasil ditambahkan");
                notify.setVisible(true);
            }
        } 
        catch (SQLException ex) {
            Notify notify = new Notify("Error saat menambahkan data");
            notify.setVisible(true);
            Logger.getLogger(DAOInv.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        } 
        finally {
            try {
                statement.close();
            } catch (SQLException ex) {
                Logger.getLogger(DAOInv.class.getName()).log(Level.SEVERE, null, ex);
                ex.printStackTrace();
            }
        }
    }

    @Override
    public void update(DataInv di) {
        PreparedStatement statement = null;
        try {
            statement = conn.prepareStatement(update);
            statement.setString(1, di.getNama());
            statement.setInt(2, di.getJumlah());
            statement.setInt(3, di.getHarga());
            statement.setString(4, di.getTanggal());
            statement.setInt(5, di.getSubTotal());
            statement.setInt(6, di.getId());
            int rowInserted = statement.executeUpdate();
            if (rowInserted > 0) {
                Notify notify = new Notify("Data berhasil diperbarui");
                notify.setVisible(true);
            }
        }
        catch (SQLException ex) {
            Notify notify = new Notify("Error saat memperbarui data");
            notify.setVisible(true);
            Logger.getLogger(DAOInv.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        } 
        finally {
            try {
                statement.close();
            } catch (SQLException ex) {
                Logger.getLogger(DAOInv.class.getName()).log(Level.SEVERE, null, ex);
                ex.printStackTrace();
            }
        }
    }

    @Override
    public void delete(int id) {
        PreparedStatement statement = null;
        try {
            statement = conn.prepareStatement(delete);
            statement.setInt(1, id);
            int rowInserted = statement.executeUpdate();
            if (rowInserted > 0) {
                Notify notify = new Notify("Data berhasil dihapus");
                notify.setVisible(true);
            }
        }
        catch (SQLException ex) {
            Notify notify = new Notify("Gagal menghapus data");
                notify.setVisible(true);
            Logger.getLogger(DAOInv.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        } 
        finally {
            try {
                statement.close();
            } catch (SQLException ex) {

                Logger.getLogger(DAOInv.class.getName()).log(Level.SEVERE, null, ex);
                ex.printStackTrace();
            }
        }
    }

    @Override
    public List<DataInv> getAll() {
        List<DataInv> dataInv = null;
        try {
            dataInv = new ArrayList<DataInv>();
            PreparedStatement statement = conn.prepareStatement(select);
            ResultSet result = statement.executeQuery();
            while (result.next()) {
                DataInv inv = new DataInv();
                inv.setId(result.getInt("id"));
                inv.setNama(result.getString("nama"));
                inv.setJumlah(result.getInt("jumlah"));
                inv.setHarga(result.getInt("harga"));
                inv.setTanggal(result.getString("tanggal"));
                inv.setSubTotal(result.getInt("subtotal"));
                dataInv.add(inv);
            }
            statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(DAOInv.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }
        return dataInv;
    }

    @Override
    public List<DataInv> search(String nama) {
        List<DataInv> dataInv = null;
        try {
            dataInv = new ArrayList<DataInv>();
            PreparedStatement statement = conn.prepareStatement(search);
            statement.setString(1, "%"+nama+"%");
            ResultSet result = statement.executeQuery();
            while (result.next()) {
                DataInv inv = new DataInv();
                inv.setId(result.getInt("id"));
                inv.setNama(result.getString("nama"));
                inv.setJumlah(result.getInt("jumlah"));
                inv.setHarga(result.getInt("harga"));
                inv.setTanggal(result.getString("tanggal"));
                inv.setSubTotal(result.getInt("subtotal"));
                dataInv.add(inv);
            }
            statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(DAOInv.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }
        return dataInv;
    }
}
