/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOdata;

import java.sql.*;
import java.util.*;
import koneksi.connector;
import model.*;
import java.sql.SQLException;
import DAOimplement.dataImplement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Acer
 */
public class dataDAO implements dataImplement {

    Connection connection;

    final String select = "SELECT * FROM buku";
    final String insert = "INSERT INTO buku (judul, penulis, rating,harga) VALUES (?,?,?,?)";
    final String update = "UPDATE buku SET judul = ?, penulis = ?, rating = ?, harga = ? WHERE id = ?";
    final String delete = "DELETE buku WHERE id = ?";
    public dataDAO() {
        connection = connector.connection();
    }

    @Override
    public void insert(Datamodel p) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(insert, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, p.getJudul());
            statement.setString(2, p.getPenulis());
            statement.setDouble(3, p.getRating());
            statement.setInt(4, p.getHarga());
           

            statement.executeUpdate();
            ResultSet rs = statement.getGeneratedKeys();
     
        } 
        catch (SQLIntegrityConstraintViolationException exc) {
            JOptionPane.showMessageDialog(null, "nama tersebut sudah ada, Data gagal ditambahkan",
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
    public void update(Datamodel p) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(update);

           statement.setString(1, p.getJudul());
            statement.setString(2, p.getPenulis());
            statement.setDouble(3, p.getRating());
            statement.setInt(4, p.getHarga());
            statement.setInt(5, p.getId());
            
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
    public List<Datamodel> getAll() {
        List<Datamodel> mv = null;
        try {
            mv = new ArrayList<Datamodel>();
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(select);
            while (rs.next()) {
                Datamodel dm = new Datamodel();
                dm.setJudul(rs.getString("judul"));
                dm.setPenulis(rs.getString("penulis"));
                dm.setRating(rs.getDouble("rating"));
                dm.setHarga(rs.getInt("harga"));
                dm.setId(rs.getInt("id"));

                mv.add(dm);

            }

        } catch (SQLException ex) {
            Logger.getLogger(dataDAO.class.getName()).log(Level.SEVERE, null, ex);

        }
        return mv;
    }
}
