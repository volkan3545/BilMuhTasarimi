/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arackiralamaotomasyonu;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.filechooser.FileNameExtensionFilter;


public class AracGuncelleme extends javax.swing.JFrame {

    /**
     * Creates new form AracGuncelleme
     */
    public AracGuncelleme() {
        initComponents();
        this.setResizable(false);
        veriGetir();
        listen();
    }
    
    void veriGetir()
    {
    
         try{
        Connection  con =   DriverManager.getConnection("jdbc:mysql://localhost:3306/arackiralama"
                + "?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey","root","");
                                   
        Statement myStmt = con.createStatement();
        
        
        
        ResultSet set = myStmt.executeQuery("select * from arac");
        TabloVeriUreticisi tvu = new TabloVeriUreticisi();
        veri_tablosu2.setModel(tvu.buildTableData(set));
        
        myStmt.close();
        con.close();
     }
     catch(Exception ex)
     {
         ex.printStackTrace();
     }

    }
  
    int id;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        yakt = new java.awt.Label();
        arac_guncel_renk = new java.awt.TextField();
        kiraucreti = new java.awt.Label();
        arac_guncel_km = new java.awt.TextField();
        arac_guncel_model = new java.awt.TextField();
        plaka = new java.awt.Label();
        seri = new java.awt.Label();
        arac_guncel_kira_ucreti = new java.awt.TextField();
        renk = new java.awt.Label();
        model = new java.awt.Label();
        km = new java.awt.Label();
        aracGuncelle_btn = new javax.swing.JButton();
        marka = new java.awt.Label();
        arac_guncel_plaka = new java.awt.TextField();
        arac_guncel_iptal = new javax.swing.JButton();
        arac_guncel_marka = new java.awt.TextField();
        arac_guncel_seri = new java.awt.TextField();
        yakitTuru_guncel_combox = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        veri_tablosu2 = new javax.swing.JTable();
        aracSil_btn = new javax.swing.JButton();
        resim_paneli_guncel = new javax.swing.JLabel();
        durum_guncel_combox = new javax.swing.JComboBox<>();
        yakt1 = new java.awt.Label();
        resim_sec_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        yakt.setText("Yakıt Türü");

        kiraucreti.setText("Kira Ücreti");

        plaka.setText("Plaka");

        seri.setText("Seri");

        renk.setText("Renk");

        model.setText("Model(Yıl)");

        km.setText("Km");

        aracGuncelle_btn.setText("Güncelle");
        aracGuncelle_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aracGuncelle_btnActionPerformed(evt);
            }
        });

        marka.setText("Marka");

        arac_guncel_plaka.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        arac_guncel_iptal.setText("Geri");
        arac_guncel_iptal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arac_guncel_iptalActionPerformed(evt);
            }
        });

        yakitTuru_guncel_combox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Dizel", "Benzin", "Hibrit", "LPG" }));
        yakitTuru_guncel_combox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yakitTuru_guncel_comboxActionPerformed(evt);
            }
        });

        veri_tablosu2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(veri_tablosu2);

        aracSil_btn.setText("Sil");
        aracSil_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aracSil_btnActionPerformed(evt);
            }
        });

        durum_guncel_combox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Musait", "Kiralı" }));
        durum_guncel_combox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                durum_guncel_comboxActionPerformed(evt);
            }
        });

        yakt1.setText("Durumu");

        resim_sec_btn.setText("Resim Seç");
        resim_sec_btn.setEnabled(false);
        resim_sec_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resim_sec_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(arac_guncel_iptal)
                        .addGap(35, 35, 35)
                        .addComponent(aracGuncelle_btn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(aracSil_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(plaka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(seri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(renk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(km, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(marka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(model, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(arac_guncel_renk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(arac_guncel_seri, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(arac_guncel_km, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(arac_guncel_model, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(arac_guncel_marka, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(arac_guncel_plaka, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(kiraucreti, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(arac_guncel_kira_ucreti, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 2, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(yakt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(yakt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(durum_guncel_combox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(yakitTuru_guncel_combox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(resim_sec_btn)
                    .addComponent(resim_paneli_guncel, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(39, 39, 39)
                                    .addComponent(marka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(seri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(model, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(9, 9, 9)
                                            .addComponent(renk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(10, 10, 10)
                                            .addComponent(arac_guncel_renk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(arac_guncel_km, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(km, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(arac_guncel_plaka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(plaka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(19, 19, 19)
                                    .addComponent(arac_guncel_marka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(arac_guncel_seri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(arac_guncel_model, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(yakt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(yakt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(yakitTuru_guncel_combox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(durum_guncel_combox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(arac_guncel_kira_ucreti, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(kiraucreti, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(22, 22, 22)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(arac_guncel_iptal)
                                .addComponent(aracGuncelle_btn)
                                .addComponent(aracSil_btn)))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(resim_paneli_guncel, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resim_sec_btn)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    int resimId;
    private void aracGuncelle_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aracGuncelle_btnActionPerformed
    
        String arac_plaka = arac_guncel_plaka.getText();
        String arac_marka = arac_guncel_marka.getText();
        String arac_seri = arac_guncel_seri.getText();
        String arac_yil  = arac_guncel_model.getText();
        String arac_renk   = arac_guncel_renk.getText();
        String arac_km   = arac_guncel_km.getText();
        String arac_kiraucreti =  arac_guncel_kira_ucreti.getText();
        String arac_yakit   =  yakitTuru_guncel_combox.getSelectedItem().toString();
        String arac_durum   = durum_guncel_combox.getSelectedItem().toString();
           
        if(selectedFile != null){
            
        ResimYukleyici resimYukleyici = new ResimYukleyici();
        resimYukleyici.resimGuncelle(selectedFile, resimId);
        
        }
        try{
            Connection  con =   DriverManager.getConnection("jdbc:mysql://localhost:3306/arackiralama"
                + "?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey","root","");

            Statement myStmt = con.createStatement();      

            String str = "update arac set plaka='"+  arac_plaka + "',"
                    +"marka='"+ arac_marka + "',"
                    +"seri='" + arac_seri + "',"
                    +"yil='"+ arac_yil + "',"
                    +"renk='"+ arac_renk + "',"
                    +"km='"+ arac_km + "',"
                    +"yakit='"+ arac_yakit + "',"
                    +"kiraucreti='"+ arac_kiraucreti + "',"
                    +"durum='"+ arac_durum + "'"
                    +" where id="+  id  ;
            
            myStmt.executeUpdate(str);
            myStmt.close();
            con.close();
            
            String[] strArray  = {arac_plaka,arac_marka,arac_seri,arac_yil,arac_renk,arac_km,arac_kiraucreti,arac_yakit,
            arac_durum};
            
            //Polymorfhizm
            TabloyuGuncelleme guncel = new AracTablosunuGuncelle();
            guncel.guncelle(veri_tablosu2, id, strArray);
  
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_aracGuncelle_btnActionPerformed

    private void arac_guncel_iptalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arac_guncel_iptalActionPerformed
         this.dispose();
    }//GEN-LAST:event_arac_guncel_iptalActionPerformed

    private void yakitTuru_guncel_comboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yakitTuru_guncel_comboxActionPerformed

        
        
    }//GEN-LAST:event_yakitTuru_guncel_comboxActionPerformed

    
    private void durum_guncel_comboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_durum_guncel_comboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_durum_guncel_comboxActionPerformed
    File selectedFile;
    private void resim_sec_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resim_sec_btnActionPerformed
         ResimSectirici resimSectirici = new ResimSectirici();
         selectedFile = resimSectirici.sec(resim_paneli_guncel);             
        
    }//GEN-LAST:event_resim_sec_btnActionPerformed

    private void aracSil_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aracSil_btnActionPerformed
               
        try{
           Connection  con =   DriverManager.getConnection("jdbc:mysql://localhost:3306/arackiralama"
                + "?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey","root","");

            Statement myStmt = con.createStatement();      

            String query = "delete from musteri where id="+id;
            
            myStmt.executeUpdate(query);
            myStmt.close();
            con.close();
            deleteTableRow(id);
        }
         catch(Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_aracSil_btnActionPerformed
    void listen()
    {
        veri_tablosu2.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
            
        public void valueChanged(ListSelectionEvent event) {
        resim_sec_btn.setEnabled(true);
        int row = veri_tablosu2.getSelectedRow();
        
        String arac_plaka = veri_tablosu2.getModel().getValueAt(row, 1).toString();
        String arac_marka = veri_tablosu2.getModel().getValueAt(row, 2).toString();
        String arac_seri = veri_tablosu2.getModel().getValueAt(row, 3).toString();
        String arac_yil  = veri_tablosu2.getModel().getValueAt(row, 4).toString();
        String arac_renk   = veri_tablosu2.getModel().getValueAt(row, 5).toString();
        String arac_km   = veri_tablosu2.getModel().getValueAt(row, 6).toString();
        String arac_yakit   = veri_tablosu2.getModel().getValueAt(row, 7).toString();
        String arac_kiraucreti   = veri_tablosu2.getModel().getValueAt(row, 8).toString();
        String arac_durum  = veri_tablosu2.getModel().getValueAt(row, 9).toString();
         resimId =  Integer.valueOf(veri_tablosu2.getModel().getValueAt(row, 10).toString());
         
        ResimYukleyici ry = new ResimYukleyici();
        ry.resimGetir(resimId, resim_paneli_guncel);
    
        id = Integer.parseInt(veri_tablosu2.getModel().getValueAt(row, 0).toString());
        
        
        arac_guncel_plaka.setText(arac_plaka);
        arac_guncel_marka.setText(arac_marka);
        arac_guncel_seri.setText(arac_seri);
        arac_guncel_model.setText(arac_yil);
        arac_guncel_renk.setText(arac_renk);
        arac_guncel_km.setText(arac_km);
        arac_guncel_kira_ucreti.setText(arac_kiraucreti);
 
    
        
        if(arac_durum.equals("Musait"))
            durum_guncel_combox.setSelectedIndex(1);
        else if (arac_durum.equals("Kiralı"))
                 durum_guncel_combox.setSelectedIndex(2); 
        else  durum_guncel_combox.setSelectedIndex(0);
            
        if(arac_yakit.equals("Dizel"))
            yakitTuru_guncel_combox.setSelectedIndex(1);
        else if (arac_yakit.equals("Benzin"))
                 yakitTuru_guncel_combox.setSelectedIndex(2); 
        else if (arac_yakit.equals("Hibrit"))
                 yakitTuru_guncel_combox.setSelectedIndex(2); 
        else if (arac_yakit.equals("LPG"))
                 yakitTuru_guncel_combox.setSelectedIndex(2); 
        
        else  yakitTuru_guncel_combox.setSelectedIndex(0);
 
                
                
        }
    });
        
    }
   
    
   private void deleteTableRow(int visitorID) {

   for (int i = 0; i < veri_tablosu2.getRowCount(); i++)
        if (veri_tablosu2.getValueAt(i, 0).equals(visitorID))
            for (int j = 0 ; j < 12 ; j++)
                veri_tablosu2.setValueAt(" ", i, j);
   
    veri_tablosu2.repaint();
                
    durum_guncel_combox.setSelectedIndex(0);
    yakitTuru_guncel_combox.setSelectedIndex(0);
    arac_guncel_plaka.setText("");
    arac_guncel_marka.setText("");
    arac_guncel_seri.setText("");
    arac_guncel_model.setText("");
    arac_guncel_renk.setText("");
    arac_guncel_km.setText("");
    arac_guncel_kira_ucreti.setText("");
        
  }
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AracGuncelleme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AracGuncelleme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AracGuncelleme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AracGuncelleme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AracGuncelleme().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aracGuncelle_btn;
    private javax.swing.JButton aracSil_btn;
    private javax.swing.JButton arac_guncel_iptal;
    private java.awt.TextField arac_guncel_kira_ucreti;
    private java.awt.TextField arac_guncel_km;
    private java.awt.TextField arac_guncel_marka;
    private java.awt.TextField arac_guncel_model;
    private java.awt.TextField arac_guncel_plaka;
    private java.awt.TextField arac_guncel_renk;
    private java.awt.TextField arac_guncel_seri;
    private javax.swing.JComboBox<String> durum_guncel_combox;
    private javax.swing.JScrollPane jScrollPane2;
    private java.awt.Label kiraucreti;
    private java.awt.Label km;
    private java.awt.Label marka;
    private java.awt.Label model;
    private java.awt.Label plaka;
    private java.awt.Label renk;
    private javax.swing.JLabel resim_paneli_guncel;
    private javax.swing.JButton resim_sec_btn;
    private java.awt.Label seri;
    private javax.swing.JTable veri_tablosu2;
    private javax.swing.JComboBox<String> yakitTuru_guncel_combox;
    private java.awt.Label yakt;
    private java.awt.Label yakt1;
    // End of variables declaration//GEN-END:variables
}