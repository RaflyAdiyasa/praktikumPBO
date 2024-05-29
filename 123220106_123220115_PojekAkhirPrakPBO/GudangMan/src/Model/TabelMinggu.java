package Model;

import java.util.List;
import javax.swing.table.AbstractTableModel;

public class TabelMinggu extends AbstractTableModel {
    
    List<DataMinggu> dataMinggu;
    
    @Override
    public int getRowCount() {
        return dataMinggu.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }
    
    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "ID";
            case 1:
                return "Tanggal awal";
            case 2:
                return "Tanggal akhir";
            case 3:
                return "Deskripsi";
            case 4:
                return "Total pengeluaran";
            default:
                return null;
        }
    }

    @Override
    public Object getValueAt(int row, int column) {
        switch (column) {
            case 0:
                return dataMinggu.get(row).getId();
            case 1:
                return dataMinggu.get(row).getAwal();
            case 2:
                return dataMinggu.get(row).getAkhir();
            case 3:
                return dataMinggu.get(row).getDeskripsi();
            case 4:
                return dataMinggu.get(row).getTotal();
            default:
                return null;
        }
    }
    
}
