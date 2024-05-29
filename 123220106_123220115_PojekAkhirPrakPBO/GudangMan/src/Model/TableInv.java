package Model;

import java.util.List;
import javax.swing.table.AbstractTableModel;

public class TableInv extends AbstractTableModel {
    
    List<DataInv> dataInv;

    public TableInv(List<DataInv> dataInv) {
        this.dataInv = dataInv;
    }

    @Override
    public int getRowCount() {
        return dataInv.size();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "ID";
            case 1:
                return "Nama";
            case 2:
                return "Jumlah";
            case 3:
                return "Harga";
            case 4:
                return "Tanggal Masuk";
            case 5:
                return "SubTotal";
            default:
                return null;
        }
    }

    @Override
    public Object getValueAt(int row, int column) {
        switch (column) {
            case 0:
                return dataInv.get(row).getId();
            case 1:
                return dataInv.get(row).getNama();
            case 2:
                return dataInv.get(row).getJumlah();
            case 3:
                return dataInv.get(row).getHarga();
            case 4:
                return dataInv.get(row).getTanggal();
            case 5:
                return dataInv.get(row).getSubTotal();
            default:
                return null;
        }
    }
}
