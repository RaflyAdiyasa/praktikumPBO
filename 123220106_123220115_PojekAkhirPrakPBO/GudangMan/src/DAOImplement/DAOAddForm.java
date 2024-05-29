package DAOImplement;

import Config.Connector;
import DAOInterface.DAOAddFormInterface;
import Notify.Notify;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DAOAddForm implements DAOAddFormInterface{
    Connection conn;
    final String insert = "INSERT INTO minggu (awal, akhir, deskripsi) VALUES (?,?,?)";
    
    public DAOAddForm() {
        conn = Connector.getConnection();
        
    }

    @Override
    public void insert(String awal, String akhir, String deskripsi) {
        PreparedStatement statement = null;
        try {
            statement = conn.prepareStatement(insert);
            statement.setString(1, awal);
            statement.setString(2, akhir);
            statement.setString(3, deskripsi);
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
}
