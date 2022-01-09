/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arackiralamaotomasyonu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;


public class Sozlesme extends javax.swing.JFrame {


    public Sozlesme() {
        initComponents();
        this.setResizable(false);
        araclarıGetir();
    }
    private void araclarıGetir()
    {
            try{
        Connection  con =   DriverManager.getConnection("jdbc:mysql://localhost:3306/arackiralama"
                + "?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey","root","");
                                   
        Statement myStmt = con.createStatement();
        
        ResultSet set = myStmt.executeQuery("select * from arac");
        
        ArrayList<ArrayList<String>> araclar = new ArrayList<ArrayList<String>>();
        while(set.next()) {
            
            ArrayList<String> aracBilgileri = new ArrayList<String>();
            aracBilgileri.add(set.getString(2));
             aracBilgileri.add(set.getString(3));
              aracBilgileri.add(set.getString(4));
               aracBilgileri.add(set.getString(5));
                aracBilgileri.add(set.getString(6));
                 aracBilgileri.add(set.getString(7));
                  aracBilgileri.add(set.getString(8));
                   aracBilgileri.add(set.getString(9));
                    aracBilgileri.add(set.getString(10));
                   //  aracBilgileri.add(set.getString(10));
                     
           araclar.add(aracBilgileri);
                   
        }
         ArrayList<String> plakalar = new ArrayList<String>();
        
         for(int i = 0;i<araclar.size();i++)
         {
             plakalar.add(araclar.get(i).get(0));
         }
         
        Vector<String> vAraclar = new Vector<String>( plakalar );
            araclar_combobox.setModel(new DefaultComboBoxModel(vAraclar));
        
            
                     araclar_combobox.addActionListener (new ActionListener () {
           public void actionPerformed(ActionEvent e) {
               
               for(int i = 0;i<araclar.size();i++)
               {
                   
               if (araclar_combobox.getSelectedItem().equals(araclar.get(i).get(0))) {
                           sozlesme_marka.setText(araclar.get(i).get(1) );
                           sozlesme_seri.setText(araclar.get(i).get(2) );
                           sozlesme_model.setText( araclar.get(i).get(3) );
                           sozlesme_renk.setText(araclar.get(i).get(4)  );
                }
               
               }
            }
          });   
            
        
        /*
        ArrayList<String> araclar = new ArrayList<String>();
        while(set.next()) 
            araclar.add(set.getString("plaka"));
            
        Vector<String> vAraclar = new Vector<String>( araclar );
            araclar_combobox.setModel(new DefaultComboBoxModel(vAraclar));
      
        */
        myStmt.close();
        con.close();
     }
     catch(Exception ex)
     {
         ex.printStackTrace();
     }


            
            
            
            
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new java.awt.Panel();
        ara_txt_field = new java.awt.TextField();
        label2 = new java.awt.Label();
        label8 = new java.awt.Label();
        ara_btn = new javax.swing.JButton();
        sozlesme_adsoyad = new java.awt.Label();
        sozlesme_adres = new java.awt.Label();
        sozlesme_telefon = new java.awt.Label();
        sozlesme_email = new java.awt.Label();
        sozlesme_email1 = new java.awt.Label();
        sozlesme_adsoyad1 = new java.awt.Label();
        sozlesme_telefon1 = new java.awt.Label();
        sozlesme_adres1 = new java.awt.Label();
        panel2 = new java.awt.Panel();
        label9 = new java.awt.Label();
        sozlesme_marka22 = new java.awt.Label();
        label11 = new java.awt.Label();
        label12 = new java.awt.Label();
        label13 = new java.awt.Label();
        sozlesme_seri = new java.awt.TextField();
        sozlesme_renk = new java.awt.TextField();
        label14 = new java.awt.Label();
        sozlesme_gun = new java.awt.TextField();
        sozlesme_kiraUcreti = new java.awt.TextField();
        label16 = new java.awt.Label();
        label17 = new java.awt.Label();
        tutar = new java.awt.Label();
        button1 = new java.awt.Button();
        tutar_btn = new java.awt.Button();
        teslimEt_btn1 = new java.awt.Button();
        araclar_combobox = new javax.swing.JComboBox<>();
        sozlesme_model = new java.awt.TextField();
        sozlesme_marka = new java.awt.TextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        sozlesme_table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ara_txt_field.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        label2.setText("TC");

        label8.setText("Müşteri Bilgileri");

        ara_btn.setText("Ara");
        ara_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ara_btnActionPerformed(evt);
            }
        });

        sozlesme_email1.setText("E-mail      :");

        sozlesme_adsoyad1.setText("Ad Soyad  : ");

        sozlesme_telefon1.setName(""); // NOI18N
        sozlesme_telefon1.setText("Telefon     :");

        sozlesme_adres1.setText("Adres       :");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ara_txt_field, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ara_btn))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sozlesme_telefon1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sozlesme_adres1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sozlesme_email1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sozlesme_adsoyad1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(sozlesme_adres, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                            .addComponent(sozlesme_telefon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sozlesme_email, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sozlesme_adsoyad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(58, Short.MAX_VALUE))
            .addGroup(panel1Layout.createSequentialGroup()
                .addComponent(label8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(label8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ara_btn)
                    .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(ara_txt_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(sozlesme_adsoyad1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sozlesme_telefon1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(sozlesme_adres1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sozlesme_email1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(sozlesme_adsoyad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sozlesme_telefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(sozlesme_adres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sozlesme_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(100, Short.MAX_VALUE))
        );

        label9.setText("Seri");

        sozlesme_marka22.setText("Marka");

        label11.setText("Araçlar");

        label12.setText("Araç Bilgileri");

        label13.setText("Model (Y�l)");

        label14.setText("Renk");

        label16.setText("Kira Ucreti");

        label17.setText("Gün");

        tutar.setText("Tutar  : ");

        button1.setLabel("button1");

        tutar_btn.setLabel("Tutar Hesapla");
        tutar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tutar_btnActionPerformed(evt);
            }
        });

        teslimEt_btn1.setLabel("Teslim Et");
        teslimEt_btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teslimEt_btn1ActionPerformed(evt);
            }
        });

        araclar_combobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                araclar_comboboxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tutar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(sozlesme_marka22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(label11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(label13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(label14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(label9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(5, 5, 5)
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(sozlesme_seri, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sozlesme_renk, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(araclar_combobox, 0, 120, Short.MAX_VALUE)
                            .addComponent(sozlesme_model, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sozlesme_marka, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel2Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(label17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panel2Layout.createSequentialGroup()
                                        .addGap(17, 17, 17)
                                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(teslimEt_btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tutar_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(panel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(sozlesme_kiraUcreti, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(sozlesme_gun, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(panel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(label12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(araclar_combobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sozlesme_kiraUcreti, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(panel2Layout.createSequentialGroup()
                                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sozlesme_marka22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel2Layout.createSequentialGroup()
                                .addComponent(sozlesme_marka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(sozlesme_seri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel2Layout.createSequentialGroup()
                                .addComponent(label13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sozlesme_renk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tutar_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(15, 15, 15)
                                .addComponent(tutar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(teslimEt_btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(sozlesme_model, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(sozlesme_gun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        sozlesme_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(sozlesme_table);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tutar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tutar_btnActionPerformed
        
        
        int yil = 2015;
        
        int gun = Integer.getInteger(sozlesme_gun.getText().toString());
        
        int kira_ucreti = Integer.getInteger(sozlesme_kiraUcreti.getText().toString());
               
        
        
        if(yil >= 2020){
            int tutar1 = kira_ucreti*gun*6;
            tutar.setText("Tutar   :  "+ tutar1 );
        }
        else if (yil < 2020 && yil >= 2017)    
        {
          int tutar1 = kira_ucreti*gun*5;
          tutar.setText("Tutar  :  " +tutar1 );
        }
        else if (yil < 2017 && yil >= 2014)    
        {
          int tutar1 = kira_ucreti*gun*4;
          tutar.setText("Tutar  :  " +tutar1 );
          
        }
        else if (yil < 2014 && yil >= 2011)    
        {
          int tutar1 = kira_ucreti*gun*3;
          tutar.setText("Tutar  :  " +tutar1 );
          
        }
         else if (yil < 2011)    
        {
          int tutar1 = kira_ucreti*gun*2;
          tutar.setText("Tutar  :  " +tutar1 );
          
        }
    }//GEN-LAST:event_tutar_btnActionPerformed

    private void teslimEt_btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teslimEt_btn1ActionPerformed
    
      String plaka =  araclar_combobox.getSelectedItem().toString();
      String marka =  sozlesme_marka22.getText();
      String seri =  label9.getText();
      String model =  label13.getText();
      String renk =  label14.getText();
      String kiraUcreti =  sozlesme_kiraUcreti.getText();
      String gun =  sozlesme_gun.getText();
     
              
       try{
         
        Connection  con =   DriverManager.getConnection("jdbc:mysql://localhost:3306/arackiralama"
                + "?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey","root","");
                                   
        Statement myStmt = con.createStatement();
          
        String str = "insert into sozlesme (Plaka,Marka,Seri,Yil,Renk,KiraUcreti,Gun,Tutar)"
                + " values('" + plaka+"',"
                +"'"+ marka+ "'," 
                +"'"+ seri +"',"
                +"'"+ model+ "',"
                +"'"+ renk+ "',"
                +"'"+ kiraUcreti+ "',"
                +"'"+ gun+ "',"
                +"'"+ musteriTC+ "',"
                +"'"+ adsoyad +"')";
       
        
        myStmt.executeUpdate(str); 
          
        
        myStmt.close();
        con.close();
        setTable();
        }catch(Exception e)
        {
            e.printStackTrace();
        }
                
    }//GEN-LAST:event_teslimEt_btn1ActionPerformed
    private void setTable()
    {
        
    try{
        Connection  con =   DriverManager.getConnection("jdbc:mysql://localhost:3306/arackiralama"
                + "?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey","root","");
                                   
        Statement myStmt = con.createStatement();
        
        
        
        ResultSet set = myStmt.executeQuery("select * from arac");
        TabloVeriUreticisi tvu = new TabloVeriUreticisi();
        sozlesme_table.setModel(tvu.buildTableData(set));
        
        myStmt.close();
        con.close();
     }
     catch(Exception ex)
     {
         ex.printStackTrace();
     }
      
    
                    
    }
    String musteriTC =  "";
    String adsoyad =  "";
    private void ara_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ara_btnActionPerformed

        
         try{
        Connection  con =   DriverManager.getConnection("jdbc:mysql://localhost:3306/arackiralama"
                + "?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey","root","");
        String tc = ara_txt_field.getText().toString();
        String adsoyad1 = "";
        String telefon = "";
        String adres = "";
        String email = "";
        Statement myStmt = con.createStatement();         
        ResultSet set = myStmt.executeQuery("select * from musteri");
        while(set.next())
            if(tc.equals(set.getString("TC")))
            {
                adsoyad1 = set.getString("adsoyad");
                telefon = set.getString("telefon");
                adres = set.getString("adres");
                email = set.getString("email");
            }
       musteriTC = tc;
       adsoyad = adsoyad1;
       sozlesme_adsoyad.setText(adsoyad1);
       sozlesme_adres.setText(adres);
       sozlesme_email.setText(email);
       sozlesme_telefon.setText(telefon);
       
        myStmt.close();
        con.close();
     }
     catch(Exception ex)
     {
         ex.printStackTrace();
     }

        
        
    }//GEN-LAST:event_ara_btnActionPerformed

    private void araclar_comboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_araclar_comboboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_araclar_comboboxActionPerformed

   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sozlesme().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ara_btn;
    private java.awt.TextField ara_txt_field;
    private javax.swing.JComboBox<String> araclar_combobox;
    private java.awt.Button button1;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Label label11;
    private java.awt.Label label12;
    private java.awt.Label label13;
    private java.awt.Label label14;
    private java.awt.Label label16;
    private java.awt.Label label17;
    private java.awt.Label label2;
    private java.awt.Label label8;
    private java.awt.Label label9;
    private java.awt.Panel panel1;
    private java.awt.Panel panel2;
    private java.awt.Label sozlesme_adres;
    private java.awt.Label sozlesme_adres1;
    private java.awt.Label sozlesme_adsoyad;
    private java.awt.Label sozlesme_adsoyad1;
    private java.awt.Label sozlesme_email;
    private java.awt.Label sozlesme_email1;
    private java.awt.TextField sozlesme_gun;
    private java.awt.TextField sozlesme_kiraUcreti;
    private java.awt.TextField sozlesme_marka;
    private java.awt.Label sozlesme_marka22;
    private java.awt.TextField sozlesme_model;
    private java.awt.TextField sozlesme_renk;
    private java.awt.TextField sozlesme_seri;
    private javax.swing.JTable sozlesme_table;
    private java.awt.Label sozlesme_telefon;
    private java.awt.Label sozlesme_telefon1;
    private java.awt.Button teslimEt_btn1;
    private java.awt.Label tutar;
    private java.awt.Button tutar_btn;
    // End of variables declaration//GEN-END:variables
}