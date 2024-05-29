package Controller;

import DAOImplement.DAOAddForm;
import DAOInterface.DAOAddFormInterface;
import Notify.Notify;
import Notify.NotifyAddForm;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class AddFormController {

    NotifyAddForm frame;
    DAOAddFormInterface addFormDAO;

    public AddFormController(NotifyAddForm frame) {
        this.frame = frame;
        addFormDAO = new DAOAddForm();
    }

    public void insert() {
        try {
            String tanggal = frame.getInputTanggal().getText();
            String bulan = frame.getInputBulan().getText();
            String tahun = frame.getInputTahun().getText();
            String deskripsi = frame.getInputKeterangan().getText();
            
            String awal = tahun+"-"+bulan+"-"+tanggal;
            LocalDate ldAwal = LocalDate.parse(awal);
            LocalDate ldAkhir = ldAwal.plusDays(7);
            String akhir = ldAkhir.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            
            addFormDAO.insert(awal, akhir, deskripsi);
        } catch (NumberFormatException ex) {
            Notify notify = new Notify("Masukan inputan berupa angka");
            notify.setVisible(true);
        }
    }
}
