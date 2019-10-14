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
public class Ornek13 {
    //Verilen bir aralıktaki çift sayıların toplamını bulunuz. 
    public static void main(String[] args) {
        int altSinir=-30,ustSinir=20;
        int i = altSinir;
        int toplam = 0;
        while (i <= ustSinir) {
            if (i % 2 == 0) {
                toplam = toplam + i;
            }
            i++;
        }
        System.out.println("Toplam = " + toplam);
    }
}
