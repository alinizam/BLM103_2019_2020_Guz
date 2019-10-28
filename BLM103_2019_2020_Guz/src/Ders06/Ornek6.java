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
public class Ornek6 {
    public static void main(String[] args) {
        int sayi=123;
        // Soru: Bir sayının rakamlarının toplamını bulunuz.
        
        //WHILE: Tüm rakamlarını bulana kadar 
            //Basamak değerini bul
                 //10'a bölümünde kalanı al ve Sayıyı 10'a böl 
            //değeri toplama ekle
        //END WHILE
        
        int toplam=0;
        //WHILE: Tüm rakamlarını bulana kadar 
        while (sayi>0){
            //Basamak değerini bul
                //10'a bölümünde kalanı al ve Sayıyı 10'a böl 
                int kalan=sayi%10;
                sayi=sayi/10;
            //değeri toplama ekle
                toplam+=kalan;
        //END WHILE
        }
        System.out.println("Toplam  = " +toplam);
    }
}
