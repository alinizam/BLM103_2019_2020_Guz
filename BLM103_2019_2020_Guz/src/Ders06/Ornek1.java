/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders06;

/**
 *
 * @author alinizam
 */
public class Ornek1 {

    public static void main(String[] args) {
        // VErilen bir sayısı verilen bir aralıktaki 
        //sayılara bölüp bölümleri toplatınız. 

        int alt = -1, ust = 5;
        int sayi = 20;
        int toplam = 0;
        for (int i = alt; i < ust; i++) {
            if (i == 0) {
                continue;
            }
            toplam += sayi / i;
        }
        System.out.println("Toplam : " + toplam);
    }
}
