/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders14Lab;

import java.util.ArrayList;

/**
 *
 * @author alinizam
 */
public class EkranSoyutOrnek {
    ArrayList<Bilesen> bilesenler=new ArrayList();
    void bilesenEkle(Bilesen bilesen){
        bilesenler.add(bilesen);
    }
     
    int renkliBilesenSayi(String renk){
        int toplam=0;
        for (Bilesen b : bilesenler) {
            if (renk.equals(b.getRenk())){
                toplam++;
            }
        }
        return toplam; 
    }
}
