
package kuis_123220106;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class HitungSiku extends JFrame implements ActionListener{
    JLabel lblalas = new JLabel("Alas : ");    //Membuat elemen labelText
    JLabel lbltinggi = new JLabel("Tinggi : ");    //Membuat elemen labelText
    JLabel lblHasil1 = new JLabel("Hasil : ");  //Membuat elemen labelText
    JLabel lblHasil = new JLabel("|____|");   //Membuat elemen labelText
    final JTextField alas = new JTextField(10);  //Membuat elemen inputText
    final JTextField tinggi = new JTextField(10);  //Membuat elemen inputText
    JButton btnHitung = new JButton("Hitung");  //Membuat elemen tombol
    
    public HitungSiku(String judul){
    setTitle(judul);  // judul window
    btnHitung.addActionListener(this);   
    setLayout(null);
    setSize(300,400); // atur ukuran
    setLocationRelativeTo(null);  //spawn point di tengah
    setDefaultCloseOperation(3); //aksi ketika ditutup x
    
    add(lbltinggi);
    add(lblalas);
    add(alas);
    add(tinggi); //menambah elemen ke kontainer
    add(btnHitung);
    add(lblHasil);
    add(lblHasil1);
    
    lblalas.setBounds(10,40,60,25);
    alas.setBounds(140,40,100,20);     // mengatur letak
    lbltinggi.setBounds(10,75,60,25);
    tinggi.setBounds(140,75,100,20);
    btnHitung.setBounds(10,115,90,20);
    lblHasil.setBounds(50,330,90,20);
    lblHasil1.setBounds(10,330,90,20);
     setVisible(true);
    }
    
    
    public void actionPerformed(ActionEvent e){
    if(e.getSource()==btnHitung){
          double numberAlas = Integer.parseInt(alas.getText());  // mengambil data sekaligus mengubah menjadi double
          double numberTinggi = Integer.parseInt(tinggi.getText());  // mengambil data sekaligus mengubah menjadi double
          double numberHasil1 = Math.pow(numberAlas,2) + Math.pow(numberTinggi,2) ;  // melakukan a^2 + b^2
          double numberHasil = Math.sqrt(numberHasil1); // mengakar hasil di atas
           String strHasil = Double.toString(numberHasil); // mengubah dari double ke String
          lblHasil.setText(strHasil);  // menampilakn Hasil ke Label
    
    }
    
    
    }
}
