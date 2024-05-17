/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Acer
 */
public class modeltabel extends AbstractTableModel {

    List<datamovie> dm;

    public modeltabel(List<datamovie> dm) {
        this.dm = dm;
    }

    @Override
    public int getRowCount() {
        return dm.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Judul";
            case 1:
                return "Alur";
            case 2:
                return "Penokohan";
            case 3:
                return "Akting";
            case 4:
                return "Nilai";
            default:
                return null;

        }
    }

    @Override
    public Object getValueAt(int row, int column) {
        switch (column) {
            case 0:
                return dm.get(row).getJudul();
            case 1:
//                double Alur = (double)dm.get(row).getAlur();
                return dm.get(row).getAlur();
            case 2:
                double penokohan = (double)dm.get(row).getPenokohan();
                return penokohan;
            case 3:
                double akting = (double)dm.get(row).getAkting();
                return akting;
            case 4:
                double nilai = (double)dm.get(row).getNilai();
//                return dm.get(row).getNilai();
                return nilai;
            default:
                return null;

        }
    }

}
