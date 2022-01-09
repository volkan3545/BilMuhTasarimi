/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arackiralamaotomasyonu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class VeriEkleme 
{
    
    protected  Connection  con;
    protected  Statement  myStmt;
    
    public VeriEkleme()
    {
          try {
                 con =   DriverManager.getConnection("jdbc:mysql://localhost:3306/arackiralama"
                + "?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey","root","");
            
             myStmt = con.createStatement();
             
             
             
             
        } catch (SQLException ex) {
            Logger.getLogger(VeriEkleme.class.getName()).log(Level.SEVERE, null, ex);
        }    
    }
    
    
   
}
    


