
import javax.swing.JFrame;
import java.awt.event.*;
import javax.swing.*;
import java.io.File;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.Scanner;
import java.util.regex.Matcher; 
import java.util.regex.Pattern;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class outputdata {
    public static void main(String[] args) {
        new hasildata();
    }
}
class hasildata extends JFrame{
    JTextField fjudul = new JTextField(0);
    JLabel ljudul = new JLabel(" Formulir Pendaftaran ");
    
    JTextField femail = new JTextField(50);
    JLabel lemail = new JLabel(" Email ");
      
    JTextField fusername = new JTextField(50);
    JLabel lusername = new JLabel(" Username ");  
    
    JTextField fpassword = new JTextField(50);
    JLabel lpassword = new JLabel(" Password ");
    
    JTextField fnama = new JTextField(50);
    JLabel lnama = new JLabel(" Nama Lengkap ");
      
    JTextField fttl = new JTextField(50);
    JLabel lttl = new JLabel(" TTLahir ");
    
    JRadioButton LakiButton = new JRadioButton("Laki-Laki");
    JRadioButton PerempuanButton = new JRadioButton("Perempuan");
    JLabel ljk = new JLabel(" Jenis Kelamin ");
    
    JTextField fdomisili = new JTextField(50);
    JLabel ldomisili = new JLabel(" Domisili ");
      
    JTextField fdesc = new JTextField(200);
    JLabel ldesc = new JLabel(" Deskripsi Singkat ");  
    
    ButtonGroup group = new ButtonGroup();
    
    public hasildata(){
        setTitle(" Hasil Data ");
	setDefaultCloseOperation(3);
	setSize(750,750);
        
        setLayout(null);
        add(ljudul); add(fjudul); add(lemail); add(femail); add(lusername); 
        add(fusername); add(lpassword); add(fpassword); add(lnama); add(fnama); 
        add(lttl); add(fttl); add(ljk); add(LakiButton); add(PerempuanButton); 
        add(ldomisili); add(fdomisili); add(ldesc); add(fdesc);
        
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
        
        setVisible(true);
        
        /*try{
            File simpenan = new File("data.txt");
            Scanner myReader = new Scanner(simpenan);
            while(myReader.hasNextLine()){
                String data = myReader.nextLine();
                System.out.println(data);
                if(femail == null)
                    femail = data;
                else if(fusername == null) 
                    fusername = data;
                else if(fpassword == null) 
                    fpassword = data;
                else if(fnama == null) 
                    fnama = data;
                else if(fttl == null) 
                    fttl = data;
                else if(LakiButton == null) 
                    LakiButton = data;
                else if(PerempuanButton == null) 
                    PerempuanButton = data;
                else if(fdomisili == null) 
                    fdomisili = data;
                else if(fdesc == null) 
                    fdesc = data;
            }
            myReader.close();
        }catch(FileNotFoundException y){
            System.out.println("File Tidak Ditemukan");
    }*/
    }
}