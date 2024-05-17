/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.List;
import DAOdataMv.datamvDAO;
import DOAimplement.dataImplement;
import javax.swing.JOptionPane;
import model.*;
import movielist.MainFrame;

/**
 *
 * @author Acer
 */
public class dataMoviecontroller {

    MainFrame frame;
    dataImplement impldatamv;
    List<datamovie> dp;

    public dataMoviecontroller(MainFrame frame) {
        this.frame = frame;
        impldatamv = new datamvDAO();
        dp = impldatamv.getAll();
    }

    public void isitabel() {
        dp = impldatamv.getAll();
        modeltabel mp = new modeltabel(dp);
        frame.getTabelData().setModel(mp);

    }

    public void insert() {
        try{
        datamovie dp = new datamovie();
        double alur = Double.parseDouble(frame.getAlurTxt().getText());
        double penokohan = Double.parseDouble(frame.getPenokohanTxt().getText());
        double akting = Double.parseDouble(frame.getAktingTxt().getText());
        double nilai = (alur + penokohan + akting) / 3;
        dp.setJudul(frame.getJudulTxt().getText());
        dp.setAlur(alur);
        dp.setPenokohan(penokohan);
        dp.setAkting(akting);
        dp.setNilai(nilai);
        impldatamv.insert(dp);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Harap masukan nilai berupa angka pada kolom Alur, Penokohan, dan Akting",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void update() {
        
        datamovie dp = new datamovie();
        double alur = Double.parseDouble(frame.getAlurTxt().getText());
        double penokohan = Double.parseDouble(frame.getPenokohanTxt().getText());
        double akting = Double.parseDouble(frame.getAktingTxt().getText());
        double nilai = (alur + penokohan + akting) / 3;
        dp.setJudul(frame.getJudulTxt().getText());
        dp.setAlur(alur);
        dp.setPenokohan(penokohan);
        dp.setAkting(akting);
        dp.setNilai(nilai);
        impldatamv.update(dp);
        
    }

    public void delete() {
        String judulHapus = frame.getJudulTxt().getText();
        impldatamv.delete(judulHapus);
    }
}
