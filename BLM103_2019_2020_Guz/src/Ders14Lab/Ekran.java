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
public class Ekran {
    ArrayList<IHareket> bilesenler=new ArrayList();
    void bilesenEkle(IHareket bilesen){
        bilesenler.add(bilesen);
    }
    int getAlan(){
        int toplamAlan=0;
        for (IHareket b : bilesenler) {
            toplamAlan+=(b.getX2()-b.getX1())*(b.getY2()-b.getY1());
        }
        return toplamAlan;
    }
    
    int renkliBilesenSayi(String renk){
        int toplam=0;
        for (IHareket iHareket : bilesenler) {
            if (renk.equals(((Bilesen)iHareket).getRenk())){
                toplam++;
            }
        }
        return toplam; 
    }
}
