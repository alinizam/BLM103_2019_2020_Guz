/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders09Lab.Ornek2;

/**
 *
 * @author alinizam
 */
public class Fabrika {

     Personel personeller[] = new Personel[3];
    
    void personelEkle(Personel p) {
        for (int i = 0; i < personeller.length; i++) {
            if (personeller[i] == null) {
                personeller[i] = p;
                return;
            }
        }
    }

    int getUnvanToplam(String unvan) {
        int toplamMaas = 0;
        
        for (Personel p : personeller) {
            if (p != null && p.unvan.equals(unvan)) {
                toplamMaas += p.maas;
            }
        }
        return toplamMaas;
    }

    void setIsimMaas(String adi, String soyadi, int maas) {

        for (Personel personel : personeller) {
            if (personel != null
                    && adi.equals(personel.adi)
                    && soyadi.equals(personel.soyadi)) {
                personel.maas = maas;
            }
        }

    }

}
