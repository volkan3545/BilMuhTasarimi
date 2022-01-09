
package arackiralamaotomasyonu;

import java.awt.event.WindowEvent;
import java.sql.*;
import java.util.Vector;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.JFrame;

//JFrame s�n�n�f� kal�t�m yoluyla al�yoruz.
public class MusteriGuncelle extends JFrame {

   
 
    int id;
    public MusteriGuncelle() {
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
        
        
        
        ResultSet set = myStmt.executeQuery("select * from musteri");
        TabloVeriUreticisi tdb = new TabloVeriUreticisi();
        veri_tablosu.setModel(tdb.buildTableData(set));
        
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

        mus_guncel_email = new java.awt.TextField();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        label4 = new java.awt.Label();
        label5 = new java.awt.Label();
        label6 = new java.awt.Label();
        mus_guncel_tc = new java.awt.TextField();
        mus_guncel_adsoyad = new java.awt.TextField();
        mus_guncel_telefon = new java.awt.TextField();
        mus_guncel_adres = new java.awt.TextField();
        musteriGuncelle = new javax.swing.JButton();
        musteriİptal = new javax.swing.JButton();
        musteriSil = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        veri_tablosu = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        label2.setText("TC");

        label3.setText("Telefon");

        label4.setText("Adres");

        label5.setText("E-mail");

        label6.setText("Ad Soyad");

        mus_guncel_tc.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        musteriGuncelle.setText("Guncelle");
        musteriGuncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                musteriGuncelleActionPerformed(evt);
            }
        });

        musteriİptal.setText("�ptal");
        musteriİptal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                musteriİptalActionPerformed(evt);
            }
        });

        musteriSil.setText("Sil");
        musteriSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                musteriSilActionPerformed(evt);
            }
        });

        veri_tablosu.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(veri_tablosu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(mus_guncel_adres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(mus_guncel_telefon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(mus_guncel_email, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(mus_guncel_adsoyad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(mus_guncel_tc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(musteriİptal)
                        .addGap(64, 64, 64)
                        .addComponent(musteriGuncelle)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(musteriSil)
                .addGap(36, 36, 36))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(musteriSil)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mus_guncel_tc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(mus_guncel_adsoyad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mus_guncel_telefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(mus_guncel_adres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mus_guncel_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(musteriİptal)
                            .addComponent(musteriGuncelle))))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void musteriGuncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_musteriGuncelleActionPerformed
                
    String musteri_tc_str = mus_guncel_tc.getText();
    String musteri_adsoyad_str = mus_guncel_adsoyad.getText();
    String musteri_telefon_str = mus_guncel_telefon.getText();
    String musteri_adres_str = mus_guncel_adres.getText();
    String musteri_email_str = mus_guncel_email.getText();
    

        try{
            Connection  con =   DriverManager.getConnection("jdbc:mysql://localhost:3306/arackiralama"
                + "?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey","root","");

            Statement myStmt = con.createStatement();      

            String str = "update musteri set TC='"+  musteri_tc_str + "',"
                    +"adsoyad='"+ musteri_adsoyad_str + "',"
                    +"telefon='" + musteri_telefon_str + "',"
                    +"adres='"+ musteri_adres_str + "',"
                    +"email='"+ musteri_email_str + "' where id="+  id  ;
            
            myStmt.executeUpdate(str);
            myStmt.close();
            con.close();
            
            String[] strArray  = {musteri_tc_str,musteri_adsoyad_str,musteri_telefon_str,musteri_adres_str
            ,musteri_email_str};
            
            //Polymorfhizm
            TabloyuGuncelleme guncel = new MusteriTablosunuGuncelleme();
            guncel.guncelle(veri_tablosu, id, strArray);
  
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
     // veriGetir();
    }//GEN-LAST:event_musteriGuncelleActionPerformed


    private void musteriİptalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_musteriİptalActionPerformed
       this.dispose();
    }//GEN-LAST:event_musteriİptalActionPerformed

    
    private void musteriSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_musteriSilActionPerformed
             
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
        
    }//GEN-LAST:event_musteriSilActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
     
    
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MusteriGuncelle().setVisible(true);
            }
        });
    }
    void listen()
    {
        veri_tablosu.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
        public void valueChanged(ListSelectionEvent event) {
            
        int row = veri_tablosu.getSelectedRow();
        
        String musteri_tc_str = veri_tablosu.getModel().getValueAt(row, 1).toString();
        String musteri_adsoyad_str = veri_tablosu.getModel().getValueAt(row, 2).toString();
        String musteri_telefon_str = veri_tablosu.getModel().getValueAt(row, 3).toString();
        String musteri_adres_str  = veri_tablosu.getModel().getValueAt(row, 4).toString();
        String musteri_email_str   = veri_tablosu.getModel().getValueAt(row, 5).toString();
       
        id = Integer.parseInt(veri_tablosu.getModel().getValueAt(row, 0).toString());
        
        
        mus_guncel_tc.setText(musteri_tc_str);
        mus_guncel_adsoyad.setText(musteri_adsoyad_str);
        mus_guncel_telefon.setText(musteri_telefon_str);
        mus_guncel_adres.setText(musteri_adres_str);
        mus_guncel_email.setText(musteri_email_str);
        
        }
    });
        
    }

   private void deleteTableRow(int visitorID) {

   for (int i = 0; i < veri_tablosu.getRowCount(); i++)
        if (veri_tablosu.getValueAt(i, 0).equals(visitorID))
            for (int j = 0 ; j < 6 ; j++)
                veri_tablosu.setValueAt(" ", i, j);
   
    veri_tablosu.repaint();
    
        mus_guncel_tc.setText("");
        mus_guncel_adsoyad.setText("");
        mus_guncel_telefon.setText("");
        mus_guncel_adres.setText("");
        mus_guncel_email.setText("");
  }
   

 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Label label6;
    private java.awt.TextField mus_guncel_adres;
    private java.awt.TextField mus_guncel_adsoyad;
    private java.awt.TextField mus_guncel_email;
    private java.awt.TextField mus_guncel_tc;
    private java.awt.TextField mus_guncel_telefon;
    private javax.swing.JButton musteriGuncelle;
    private javax.swing.JButton musteriSil;
    private javax.swing.JButton musteriİptal;
    private javax.swing.JTable veri_tablosu;
    // End of variables declaration//GEN-END:variables
}