package kuis_123220106;

import java.awt.event.ActionListener;
import java.awt.event.*;
import javax.swing.*;

class BuatLoginPage extends JFrame implements ActionListener{
    final JTextField username = new JTextField(10);     //Membuat elemen inputText
    final JTextField password = new JTextField(10);      //Membuat elemen inputText
    JLabel lblLogin = new JLabel(" ");                   //Membuat elemen labelText
    JLabel lblusername = new JLabel("Username : ");        //Membuat elemen labelText
    JLabel lblpassword = new JLabel("Password : ");     //Membuat elemen labelText
    JButton btnlogin = new JButton("Masuk");        //Membuat tombol hitung
   
    
    
    public BuatLoginPage(String judul){
        setTitle(judul);  // judul window nya
        btnlogin.addActionListener(this);
       
        setLayout(null);
        add(lblusername); //menambah elemen ke kontainer
        add(username);
        add(lblpassword);
        add(password);
       
        add(btnlogin);
        add(lblLogin);
        setSize(350,200); // men setting ukuran
        setLocationRelativeTo(null);  //Tempat spawn ditengah
        setDefaultCloseOperation(3);  //langsung close
       
        
        lblusername.setBounds(10,10,120,20);  // men setting letak
        username.setBounds(130,10,170,20);
        lblpassword.setBounds(10,40,120,20);
        password.setBounds(130,40,170,20);
        btnlogin.setBounds(10,120,90,20);
       
        lblLogin.setBounds(100,120,190,20);   
         setVisible(true);   // membuat semuanya terlihat
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==btnlogin){
            String usrname = username.getText();  // mengambil data dari inputan
            String passwrd = password.getText();    // mengambil data dari inputan
            if(usrname.equals("tukang_106")&&passwrd.equals("tukang_106")){  // melakukan perbandingan user/pw yg benar
           HitungSiku nextpage = new HitungSiku("SegitigaSiku"); // ke arah panel berikutnya
               this.dispose();  // menghilangkan panel lama
            }
            else{
                lblLogin.setText("  Password/Username salah");  // pesan ketika salah
            }    
        }
        
        
    }

}

public class Kuis_123220106 {
   public static void main (String[] args){
       BuatLoginPage login =  new BuatLoginPage("Login") {};  // membuat objek login
   }
}

