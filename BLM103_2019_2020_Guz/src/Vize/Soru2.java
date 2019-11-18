/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vize;

/**
 *
 * @author alinizam
 */
public class Soru2 {

    public static void main(String[] args) {

        /*
        Verilen bir aralıktaki sayıların ikilik sistemde toplam kaç adet 1 içerdiğini bulunuz. 
        (Örnek 1 ile 3 aralığı verildiğinde 01,10,11 şeklinde 4 adet bir içerecektir.)
         */
        int altSinir=1;
        int ustSinir=3;
        int sayac = 0;
        for (int i = altSinir; i <= ustSinir; i++) {
            int sayi = i;
            while (sayi > 0) {
                if ((sayi & 1) > 0) {
                    sayac++;
                } 
                sayi = sayi >> 1;
            }
        }
           
        System.out.println(sayac);
    }

}
