/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders05Lab;

/**
 *
 * @author alinizam
 */
public class Ornek4 {
    // Bir sayının rakamlarının toplamını bulunuz.
    public static void main(String[] args) {
        int sayi=1237;
        int temp=sayi;
        int rakam;
        int toplam=0;
        while (temp>0){
            rakam=temp%10;
            toplam+=rakam;
            temp/=10;
        }
        System.out.println(sayi+ " sayisinin rakamları toplami : "+toplam);
    }
}
