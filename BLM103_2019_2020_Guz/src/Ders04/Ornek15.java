/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders04;

/**
 *
 * @author alinizam
 */
public class Ornek15 {
    //Verilen bir aralıktaki 5'e bölünmeyen kaç tane çift sayı olduğunu bulunuz. 
    public static void main(String[] args) {
        int altSinir=-30,ustSinir=20;
        int i = altSinir;
        int sayac = 0;
        while (i <= ustSinir) {
            if (i % 2 == 0 && i % 5 != 0) {
                sayac++;
            }
            i++;
        }
        System.out.println("Toplam = " + sayac);
    }  
}
