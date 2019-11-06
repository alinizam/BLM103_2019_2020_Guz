/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders07Lab.Ornek2;

/**
 *
 * @author alinizam
 */
public class Saat {

    int saat, dakika, saniye;

    void saniyeArttir() {
        if (saniye == 59) {
            saniye = 0;
            dakikaArttir();
        } else {
            saniye++;
        }
    }

    void dakikaArttir() {
        if (dakika == 59) {
            dakika = 0;
            saatArttir();
        } else {
            dakika++;
        }
    }

    void saatArttir() {
        if (saat == 23) {
            saat = 0;
        } else {
            saat++;
        }
    }

    void saatiGoster() {
        System.out.println(saat + " : " + dakika + " : " + saniye);
    }

}
