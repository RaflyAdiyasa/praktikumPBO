package DAOImplement;

import Config.Connector;
import DAOInterface.DAOLoginInterface;

import Notify.Notify;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DAOLogin implements DAOLoginInterface{
    Connection conn;
    final String login = "SELECT * FROM admin WHERE username=? AND password=?";
    
    public DAOLogin() {
        conn = Connector.getConnection();
    }

    @Override
    public int login(String username, String password) {
        PreparedStatement statement = null;
        int result = 0;
        try {
            statement = conn.prepareStatement(login);
            statement.setString(1, username);
            statement.setString(2, password);
            statement.executeQuery();
            if (statement.executeQuery().next()) {
                result++;
            }
        } 
        catch (SQLException ex) {
            Notify notify = new Notify("Error saat login");
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
        return result;
    }
    
}
