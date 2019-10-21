/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders05;

/**
 *
 * @author alinizam
 */
public class Ornek1 {

    public static void main(String[] args) {
        //1 'den 10'a kadar olan sayıların toplamını bulunuz.
        int i = 1;
        int toplam = 0;
        do {
            toplam += i;
            i++;
        } while (i <= 10);
        System.out.println("Toplam = "+toplam);
    }
}
