/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arackiralamaotomasyonu;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.filechooser.FileNameExtensionFilter;


public class ResimSectirici {
 
    public File sec(JLabel label)
    {
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter(
                "JPG & GIF Images", "jpg", "gif","png");
        chooser.setFileFilter(filter);
        int returnVal = chooser.showOpenDialog(null);
        if(returnVal == JFileChooser.APPROVE_OPTION) {
          File selectedFile = chooser.getSelectedFile();
          
             try {
                 Image picture = ImageIO.read(selectedFile);
                 
                 Image picture1 =  picture.getScaledInstance(label.getWidth(), label.getHeight(),
                 Image.SCALE_SMOOTH);
                 
                 ImageIcon ii = new ImageIcon(picture1);
                 label.setIcon(ii);
                 
                 return selectedFile;                    
                 
             } catch (IOException ex) {
                  
                 Logger.getLogger(AracKayit.class.getName()).log(Level.SEVERE, null, ex);
                 
             }
          
        }
              
      return null;
    
    }
    
}
