/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders11.Ornek3;

/**
 *
 * @author alinizam
 */
public class Personel {
    String adi, soyadi;
    int maas;
    static int personelSayisi;
    void personelEkle(){
        personelSayisi++;
        isimVer("", "");
    }

    public Personel(String adi, String soyadi) {
        this.adi = adi;
        this.soyadi = soyadi;
        
    }
    
    static void isimVer(String a, String s){
        //adi=a;
    }
}
