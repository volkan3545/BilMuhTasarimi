
package arackiralamaotomasyonu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JTable;


public class VeritabaniYukleme  {
    
   private JTable table; 
   
    Connection con;
    Statement myStmt;
   
   public VeritabaniYukleme()
   {
       
        try{
          con =   DriverManager.getConnection("jdbc:mysql://localhost:3306/arackiralama"
                + "?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey","root","");
                                   
        myStmt = con.createStatement();
                    
     }
     catch(Exception ex)
     {
         ex.printStackTrace();
     }
    }
   }
   
   

