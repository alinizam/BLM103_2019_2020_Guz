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
public class Ornek16 {
   //Verilen bir aralıktaki kaç tane çift sayı olduğunu bit düzeyindeki operatörlerle
   //bulunuz. 
    public static void main(String[] args) {
        int altSinir=-30,ustSinir=20;
        int i = altSinir;
        int sayac = 0;
        while (i <= ustSinir) {
            if ((i & 1) == 0 ) {
                sayac++;
            }
            i++;
        }
        System.out.println("Toplam = " + sayac);
    }  
}
