package Controller;

import DAOImplement.DAOInv;
import DAOInterface.DAOInvInterface;
import Frame.FrameInv;
import Model.DataInv;
import Model.TableInv;
import Notify.Notify;
import java.util.List;

public class InvController {
    
    FrameInv frame;
    DAOInvInterface invDAO;
    List<DataInv> dataInv;
    
    public InvController(FrameInv frame){
        this.frame = frame;
        invDAO = new DAOInv();
        dataInv = invDAO.getAll();
    }
    
    public void fillTable() {
        dataInv = invDAO.getAll();
        TableInv ti = new TableInv(dataInv);
        frame.getTable().setModel(ti);
    }
    
    public void insert() {
        try {
            DataInv di = new DataInv();
            String nama = frame.getInputNama().getText();
            String strJumlah = frame.getInputJumlah().getText();
            String strHarga = frame.getInputHarga().getText();
            String tahun = frame.getInputTahun().getText();
            String bulan = frame.getInputBulan().getText();
            String tanggal = frame.getInputTanggal().getText();
            
            if (nama.isEmpty() || strJumlah.isEmpty() || strHarga.isEmpty() || tahun.isEmpty() || bulan.isEmpty() || tanggal.isEmpty()) {
                Notify notify = new Notify("Isi semua kolom terlebih dahulu");
                notify.setVisible(true);
                return;
            }
            
            String date = tahun + "-" + bulan + "-" + tanggal;
            int jumlah = Integer.parseInt(strJumlah);
            int harga = Integer.parseInt(strHarga);
            int subTotal = jumlah * harga;
            
            di.setNama(nama);
            di.setJumlah(jumlah);
            di.setHarga(harga);
            di.setTanggal(date);
            di.setSubTotal(subTotal);
            invDAO.insert(di);
            
        } catch (NumberFormatException ex) {
            Notify notify = new Notify("Masukan inputan berupa angka");
            notify.setVisible(true);
        }
    }
    
    public void update(){
        try {
            DataInv di = new DataInv();
            int id = frame.getId();
            if(id == 0){
                Notify notify = new Notify("Pilih baris dulu");
                notify.setVisible(true);
            }
            String nama = frame.getInputNama().getText();
            String strJumlah = frame.getInputJumlah().getText();
            String strHarga = frame.getInputHarga().getText();
            String tahun = frame.getInputTahun().getText();
            String bulan = frame.getInputBulan().getText();
            String tanggal = frame.getInputTanggal().getText();
            
            if (nama.isEmpty() || strJumlah.isEmpty() || strHarga.isEmpty() || tahun.isEmpty() || bulan.isEmpty() || tanggal.isEmpty()) {
                Notify notify = new Notify("Isi semua kolom terlebih dahulu");
                notify.setVisible(true);
                return;
            }
            
            String date = tahun + "-" + bulan + "-" + tanggal;
            int jumlah = Integer.parseInt(strJumlah);
            int harga = Integer.parseInt(strHarga);
            int subTotal = jumlah * harga;
            
            di.setId(id);
            di.setNama(nama);
            di.setJumlah(jumlah);
            di.setHarga(harga);
            di.setTanggal(date);
            di.setSubTotal(subTotal);
            invDAO.update(di);
            
        } catch (NumberFormatException ex) {
            Notify notify = new Notify("Masukan inputan berupa angka");
            notify.setVisible(true);
        }
    }
    
    public void delete() {
        int id = frame.getId();
        if(id == 0){
                Notify notify = new Notify("Pilih baris dulu");
                notify.setVisible(true);
            }
        invDAO.delete(id);
    }
    
    public void search(){
        String nama = frame.getInputSearch().getText();
        dataInv = invDAO.search(nama);
        TableInv ti = new TableInv(dataInv);
        frame.getTable().setModel(ti);
    }
}
