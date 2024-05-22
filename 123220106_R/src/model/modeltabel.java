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

    List<Datamodel> dm;

    public modeltabel(List<Datamodel> dm) {
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
                return "Penulis";
            case 2:
                return "Rating";
            case 3:
                return "Harga";
            case 4:
                return "ID";
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
//              
                return dm.get(row).getPenulis();
            case 2:
                double rating = (double) dm.get(row).getRating();
                return rating;
            case 3:
                int harga = dm.get(row).getHarga();
                return harga;
            case 4:
                int id = dm.get(row).getId();
                return id;
            default:
                return null;

        }
    }

}
