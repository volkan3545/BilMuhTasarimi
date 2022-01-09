/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arackiralamaotomasyonu;

import javax.swing.JTable;


public class MusteriTablosunuGuncelleme extends TabloyuGuncelleme{

    MusteriTablosunuGuncelleme() {
        
    }
    
    @Override
    void guncelle(JTable veri_tablosu,int id,String[] data)
    {
         for (int i = 0; i < veri_tablosu.getRowCount(); i++)
        if (veri_tablosu.getValueAt(i, 0).equals(id))
            for (int j = 1 ; j <= data.length ; j++)
                veri_tablosu.setValueAt(data[j - 1], i, j);
    
    veri_tablosu.repaint();
    }
    
}
