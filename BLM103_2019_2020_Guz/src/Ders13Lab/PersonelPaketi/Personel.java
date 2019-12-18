/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders13Lab.PersonelPaketi;

import Ders13Lab.UnvanPaketi.Memur;
import Ders13Lab.UnvanPaketi.Unvan;
import Ders13Lab.UnvanPaketi.Yonetici;
import java.util.ArrayList;

/**
 *
 * @author alinizam
 */
public class Personel {

    private String adi;
    String soyadi;
    private Unvan[] unvanlar;
    ArrayList<String> adresler = new ArrayList<>();
    Birim birim;
    
    
    
    public static ArrayList<MetotCagri> metotCagrilari = new ArrayList();

    public String getAdi() {
        MetotCagri.Ekle("getAdi");
        return adi;
    }

    public void setAdi(String adi) {
        MetotCagri.Ekle("setAdi");
        this.adi = adi;
    }

    public void setUnvanlar(Unvan[] unvanlar) {
        this.unvanlar = unvanlar;
    }

    public Unvan[] getUnvanlar() {
        return unvanlar;
    }

    int getPersonelMaas() {
        int toplam = 0;
        for (Unvan unvan : unvanlar) {
            toplam += unvan.getUnvanMaas();
        }
        return toplam;
    }

    void adresYazdir() {
        boolean memurMu = false;
        for (Unvan unvan : unvanlar) {
            if (unvan instanceof Memur) {
                memurMu = true;
                break;
            }
        }
        if (memurMu) {
            for (String adres : adresler) {
                System.out.println(adres);
            }
        }
    }

    void getUnvanAdet() {
        int memurAdet = 0, yoneticiAdet = 0;
        for (Unvan unvan : unvanlar) {
            if (unvan instanceof Memur) {
                memurAdet++;
            } else if (unvan instanceof Yonetici) {
                yoneticiAdet++;
            }
        }
        System.out.println("Memur Adet = " + memurAdet);
        System.out.println("Yentici Adet = " + yoneticiAdet);
    }
}
