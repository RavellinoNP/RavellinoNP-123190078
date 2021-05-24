/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
import java.awt.event.*;
import javax.swing.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher; 
import java.util.regex.Pattern;


class ObjekGUI {
   public static void main(String[] args) {
	GUI g = new GUI();
   }
}

class GUI extends JFrame implements ActionListener {
    private javax.swing.JRadioButton RBLaki;
    private javax.swing.JRadioButton RBPerempuan;
    
    String sEmail, sUsername, sPassword, sNama, sTTLahir, sjk, sDomisili, sDesc;
    int count;
      
      final JTextField fjudul = new JTextField(0);
      JLabel ljudul = new JLabel(" Formulir Pendaftaran ");

      final JTextField femail = new JTextField(50);
      JLabel lemail = new JLabel(" Email ");
      
      final JTextField fusername = new JTextField(50);
      JLabel lusername = new JLabel(" Username ");
      
      final JTextField fpassword = new JTextField(50);
      JLabel lpassword = new JLabel(" Password ");
      
      final JTextField fnama = new JTextField(50);
      JLabel lnama = new JLabel(" Nama Lengkap ");
      
      final JTextField fttl = new JTextField(50);
      JLabel lttl = new JLabel(" TTLahir ");
      
      JRadioButton LakiButton = new JRadioButton("Laki-Laki");
      JRadioButton PerempuanButton = new JRadioButton("Perempuan");
      JLabel ljk = new JLabel(" Jenis Kelamin ");
      
      final JTextField fdomisili = new JTextField(50);
      JLabel ldomisili = new JLabel(" Domisili ");
      
      final JTextField fdesc = new JTextField(200);
      JLabel ldesc = new JLabel(" Deskripsi Singkat ");
            
    JButton bcancel = new JButton("Cancel");  
    JButton bdaftar = new JButton("Daftar");

      ButtonGroup group = new ButtonGroup();
   public GUI() {
	setTitle(" Formulir ");
	setDefaultCloseOperation(3);
	setSize(750,750);

	

	setLayout(null);
	add(ljudul); add(fjudul); add(lemail); add(femail); add(lusername); 
        add(fusername); add(lpassword); add(fpassword); add(lnama); add(fnama); 
        add(lttl); add(fttl); add(ljk); add(LakiButton); add(PerempuanButton); 
        add(ldomisili); add(fdomisili); add(ldesc); add(fdesc);
        add(bdaftar); add(bcancel);

	// setBounds(m,n,o,p)
	// m = posisi x; n = posisi n
	// o = panjang komponen; p = tinggi komponen
        
        ljudul.setBounds(150,0,220,50);
        fjudul.setBounds(0,0,0,0);
        
	lemail.setBounds(30,50,220,30);
	femail.setBounds(150,50,250,30);
        
	lusername.setBounds(30,100,220,30);
	fusername.setBounds(150,100,250,30);
        
        lpassword.setBounds(30,150,220,30);
	fpassword.setBounds(150,150,250,30);
        
        lnama.setBounds(30,200,220,30);
        fnama.setBounds(150,200,250,30);
        
        lttl.setBounds(30,250,220,30);
        fttl.setBounds(150,250,250,30);
        
        ljk.setBounds(30,300,220,30);
        LakiButton.setBounds(150,300,100,30);
        PerempuanButton.setBounds(250,300,100,30);
        
        ldomisili.setBounds(30,350,220,30);
        fdomisili.setBounds(150,350,250,30);
        
        ldesc.setBounds(30,400,220,100);
        fdesc.setBounds(150,450,250,100);
        
        bcancel.setBounds(150,600,75,40);
        bdaftar.setBounds(250,600,75,40);
        
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        femail.addActionListener((ActionListener) this);
        fusername.addActionListener((ActionListener) this);
        fpassword.addActionListener((ActionListener) this);
        fnama.addActionListener((ActionListener) this);
        fttl.addActionListener((ActionListener) this);
        LakiButton.addActionListener((ActionListener) this);
        PerempuanButton.addActionListener((ActionListener) this);
        fdomisili.addActionListener((ActionListener) this);
        fdesc.addActionListener((ActionListener) this);
        bcancel.addActionListener((ActionListener) this);
        bdaftar.addActionListener((ActionListener) this);
   }
   //rumus tambah, kurang, kali, bagi, dan cancel
   public void actionPerformed(ActionEvent e){     
        
        if(e.getSource() == bcancel){
             femail.setText("");
             fusername.setText("");
             fpassword.setText("");
             fnama.setText("");
             fttl.setText("");
             LakiButton.setText("");
             PerempuanButton.setText("");
             fdomisili.setText("");
             fdesc.setText("");
        }
        if (e.getSource() == bdaftar){
            sEmail = femail.getText();
            String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
            if (sEmail.matches(regex));
            else { 
                femail.setText("Harus sesuai format");
            }
            sUsername = fusername.getText();
            Pattern form = Pattern.compile("[^a-zA-Z0-9]");
            Matcher equal = form.matcher(sUsername);
            boolean no = equal.find();
            if(no){ 
                fusername.setText("hanya boleh menggunakan huruf dan angka");
            }
            sPassword = fpassword.getText();
            Pattern pattern = Pattern.compile("[^a-zA-Z0-9]");
            Matcher matcher = pattern.matcher(sPassword);
            boolean password = matcher.find();
            if(password);
            else{
                fpassword.setText("harus mengandung huruf, angka, dan simbol");
            }
            sNama = fnama.getText();
            sTTLahir = fttl.getText();
            sjk = LakiButton.getText();
            sjk = PerempuanButton.getText();
            sDomisili = fdomisili.getText();
            sDesc = fdesc.getText();
            count = sDesc.length();
            if(count > 200){ 
                fdesc.setText("max 200 character");
            }
            new hasildata();
            dispose();
        }
    }

}