/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arackiralamaotomasyonu;

import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;


public class ResimYukleyici {
    
       private int sycId = 0;
       int getSycId()
       {
           return sycId;
       }
       public void resimYukle(File selectedFile)
       {
           try{
       Connection  con =   DriverManager.getConnection("jdbc:mysql://localhost:3306/arackiralama"
                + "?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey","root","");
                                   
       Statement myStmt = con.createStatement();
        
        ResultSet set = myStmt.executeQuery("select * from resim");
        
        if(set.next()){
          String query = ("SELECT * FROM resim ORDER BY id DESC LIMIT 1;");
          ResultSet rs = myStmt.executeQuery(query);
          if (rs.next()) {
             sycId = Integer.valueOf(rs.getString("id")) + 1;
               
         }
        }
        else sycId = 1;
       
      
       FileInputStream fin = new FileInputStream(selectedFile);
       PreparedStatement pre = con.prepareStatement("insert into resim values(?,?)");
       
       pre.setInt(1,sycId); 
       pre.setBinaryStream(2,(InputStream)fin,(int)selectedFile.length());
       pre.executeUpdate();
          
             
        
       }
           catch(Exception e)
           {
               e.printStackTrace();
           }
       }
       public void resimGuncelle(File selectedFile,int id)
       {
           try{
       Connection  con =   DriverManager.getConnection("jdbc:mysql://localhost:3306/arackiralama"
                + "?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey","root","");
             
       
      
       FileInputStream fin = new FileInputStream(selectedFile);
       PreparedStatement pre = con.prepareStatement("update resim set resim = ? where id = " + id );
       
             
   
       pre.setBinaryStream(1,(InputStream)fin,(int)selectedFile.length());
   

       pre.executeUpdate();
          
             
        
       }
           catch(Exception e)
           {
               e.printStackTrace();
           }
       }
       public void resimGetir(int id,JLabel jlabel)
       {
         
        try{
        Connection  con =   DriverManager.getConnection("jdbc:mysql://localhost:3306/arackiralama"
                + "?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey","root","");

        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("select resim from resim where id = " + id);
        int i = 0;
        while (rs.next()) {
            
            InputStream in = rs.getBinaryStream("resim");
            Image picture = ImageIO.read(in);
            
            Image scaledPic = picture.getScaledInstance(jlabel.getWidth(), jlabel.getHeight(),
            Image.SCALE_SMOOTH);
            
            ImageIcon ii = new ImageIcon(scaledPic);
            jlabel.setIcon(ii);
            /*
            OutputStream f = new FileOutputStream(new File("test"+i+".jpg"));
            i++;
            int c = 0;
            while ((c = in.read()) > -1) {
                f.write(c);
            }
            f.close();
            in.close();
        */

            }
        }catch(Exception ex){
        System.out.println(ex.getMessage());
            }
       }
}
