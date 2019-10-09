/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders03Lab;

/**
 *
 * @author alinizam
 */
public class Ornek4a {

    /*Üç basamaklı ikili sistemdeki bir sayıda kaç 
    adet 1 rakamı geçtiğini bulunuz.*/
    public static void main(String[] args) {
        int sayi = 0b100;
        
        int basamak = 1;    //0b100
        int sayac = 0;
        
        sayac += (sayi & basamak) > 0 ? 1 : 0;
        basamak = basamak << 1;
        sayac += (sayi & basamak) > 0 ? 1 : 0;
        basamak = basamak << 1;
        sayac += (sayi & basamak) > 0 ? 1 : 0;

        System.out.println(sayac);

    }
}
