/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOdataMv;

import java.sql.*;
import java.util.*;
import koneksi.connector;
import model.*;
import java.sql.SQLException;
import DOAimplement.dataImplement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Acer
 */
public class datamvDAO implements dataImplement {

    Connection connection;

    final String select = "SELECT * FROM movie";
    final String insert = "INSERT INTO movie (`judul`, `alur`, `penokohan`, `akting`, `nilai`) VALUES (?,?,?,?,?);";
    final String update = "UPDATE movie SET alur =?, penokohan = ?, akting = ?, nilai = ? WHERE judul = ?";
    final String delete = "DELETE from movie WHERE movie.judul = ?";
    public datamvDAO() {
        connection = connector.connection();
    }

    @Override
    public void insert(datamovie p) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(insert, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, p.getJudul());
            statement.setDouble(2, p.getAlur());
            statement.setDouble(3, p.getPenokohan());
            statement.setDouble(4, p.getAkting());
            statement.setDouble(5, p.getNilai());

            statement.executeUpdate();
            ResultSet rs = statement.getGeneratedKeys();
     
        } 
        catch (SQLIntegrityConstraintViolationException exc) {
            JOptionPane.showMessageDialog(null, "Film dengan judul tersebut sudah ada, Data gagal ditambahkan",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error saat menambahkan data, coba lagi",
                    "Error", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        } finally {
            try {
                statement.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    @Override
    public void update(datamovie p) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(update);

            statement.setDouble(1, p.getAlur());
            statement.setDouble(2, p.getPenokohan());
            statement.setDouble(3, p.getAkting());
            statement.setDouble(4, p.getNilai());
            statement.setString(5, p.getJudul());
            
            statement.executeUpdate();
           int rowInserted = statement.executeUpdate();
            if (rowInserted > 0) {
                JOptionPane.showMessageDialog(null, "Data berhasil diperbarui", "Success", JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Error saat menambahkan data, coba lagi",
                    "Error", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        } finally {
            try {
                statement.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    @Override
    public void delete(String judul) {
        PreparedStatement statement = null;
         try {
            statement = connection.prepareStatement(delete);
            statement.setString(1,judul);
           
            statement.executeUpdate();
          

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                statement.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    @Override
    public List<datamovie> getAll() {
        List<datamovie> mv = null;
        try {
            mv = new ArrayList<datamovie>();
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(select);
            while (rs.next()) {
                datamovie dm = new datamovie();
                dm.setJudul(rs.getString("judul"));
                dm.setAlur(rs.getDouble("alur"));
                dm.setPenokohan(rs.getDouble("penokohan"));
                dm.setAkting(rs.getDouble("akting"));
                dm.setNilai(rs.getDouble("nilai"));

                mv.add(dm);

            }

        } catch (SQLException ex) {
            Logger.getLogger(datamvDAO.class.getName()).log(Level.SEVERE, null, ex);

        }
        return mv;
    }
}
