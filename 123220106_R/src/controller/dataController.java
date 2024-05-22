/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.List;
import DAOdata.dataDAO;
import DAOimplement.dataImplement;
import javax.swing.JOptionPane;
import model.*;
import FrameUtama.MainFrame;

/**
 *
 * @author Acer
 */
public class dataController {

    MainFrame frame;
    dataImplement impldatamv;
    List<Datamodel> dp;

    public dataController(MainFrame frame) {
        this.frame = frame;
        impldatamv = new dataDAO();
        dp = impldatamv.getAll();
    }

    public void isitabel() {
        dp = impldatamv.getAll();
        modeltabel mp = new modeltabel(dp);
        frame.getTabelData().setModel(mp);

    }

    public void insert() {
        try {
            Datamodel dp = new Datamodel();

            int harga = Integer.parseInt(frame.getHargaTxt().getText());
            int rating = Integer.parseInt(frame.getHargaTxt().getText());
//            int hasil = (int)( harga + 500 + (rating * 100));
                int hasil = ( harga + 500 + (rating * 100));
            dp.setJudul(frame.getJudulTxt().getText());
            dp.setPenulis(frame.getPenulisTxt().getText());
            dp.setHarga(hasil);
            dp.setRating(rating);

            impldatamv.insert(dp);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Mohon masukan dengan benar",
                    "Error", JOptionPane.ERROR_MESSAGE);

        }
    }

    public void update() {

        Datamodel dp = new Datamodel();

        int harga = Integer.parseInt(frame.getHargaTxt().getText());
        int rating = Integer.parseInt(frame.getHargaTxt().getText());
        int id = Integer.parseInt(frame.getIdTxt().getText());
        dp.setJudul(frame.getJudulTxt().getText());
        dp.setPenulis(frame.getPenulisTxt().getText());
        dp.setHarga(harga);
        dp.setRating(rating);
        dp.setId(id);
        impldatamv.update(dp);
    }

    public void delete() {
        String judulHapus = frame.getJudulTxt().getText();
        impldatamv.delete(judulHapus);
    }
}
