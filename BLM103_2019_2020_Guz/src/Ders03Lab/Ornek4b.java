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
public class Ornek4b {
    /*Üç basamaklı ikili sistemdeki bir sayıda kaç 
    adet 1 rakamı geçtiğini bulunuz.*/
    public static void main(String[] args) {
        
        int sayi=0b101;
        
        int temp=sayi;
        int basamak=1;
        int sayac=0;
        sayac+=(temp & basamak);
        temp=temp>>1;   // 0b010
        sayac+=(temp & basamak);
        temp=temp>>1;   // 0b001
        sayac+=(temp & basamak);
        System.out.println(sayi+" sayısında "+sayac+" adet 1 vardır");
        
    }
}
