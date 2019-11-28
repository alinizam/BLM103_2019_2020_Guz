/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders10Lab.Ornek1;

import java.util.ArrayList;

/**
 *
 * @author alinizam
 */
public class Fabrika {

    Malzeme[] malzemeler = new Malzeme[5];
    ArrayList<Personel> personeller=new ArrayList();
    void malzemeEkle(Malzeme m, int indis) {
        if (malzemeler[indis] == null) {
            malzemeler[indis] = m;
        }
    }

    void malzemeSil(int indis) {
        malzemeler[indis] = null;
    }

    /*Malzeme malzemeSil(int indis){
        Malzeme m=malzemeler[indis]; 
        malzemeler[indis]=null;    
        return m;
    }*/
    int getToplamMalzeme() {
        int sayac = 0;
        for (Malzeme malzeme : malzemeler) {
            if (malzeme != null) {
                sayac++;
            }
        }
        return sayac;
    }
    
    int getToplamMalzemeTutar() {
        int toplamTutar= 0;
        for (Malzeme malzeme : malzemeler) {
            if (malzeme != null) {
                toplamTutar+=malzeme.fiyat;
            }
        }
        return toplamTutar;
    }
    void dusukTutarliMalzemeSil(int fiyat){
        for (int i = 0; i < malzemeler.length; i++) {
            if (malzemeler[i]!=null && malzemeler[i].fiyat<fiyat){
                malzemeler[i]=null;
            }
        }
    }
    void personelMalzemeEkle(String adi ,String soyadi, Malzeme m){
        for (Personel personel : personeller) {
            if (adi.equals(personel.adi) && soyadi.equals(personel.soyadi)){
                personel.malzemeler.add(m);
            } 
        }
    }
    int zamYap(String malzemeAdi){
        int toplamZam=0;
        for (Malzeme malzeme : malzemeler) {
            if (malzeme!=null && malzemeAdi.equals(malzeme.adi) && malzeme.fiyat<5){
                malzeme.fiyat+=2;
                toplamZam+=2;
            }
        }
        return toplamZam;
    }
}
