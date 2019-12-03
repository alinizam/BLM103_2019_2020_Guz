/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders11.Ornek1;

/**
 *
 * @author alinizam
 */
public class Personel {
    String adi,soyadi;
    int maas;
    static int personelSayisi;

    public Personel(String adi, String soyadi) {
        this.adi = adi;
        this.soyadi = soyadi;
    }
    Personel olustur(String adi, String soyadi){
        return new Personel(adi,soyadi);
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Silindi");
        super.finalize(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
