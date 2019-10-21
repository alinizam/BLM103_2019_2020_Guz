/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders05;

import java.util.Scanner;

/**
 *
 * @author alinizam
 */
public class Ornek2a {
    //Kalavyeden girilen sayıları toplatan bir algoritma yazınız.
    //-1 girilene kadar işlem devam etmelidir.
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        //System.out.println("Bir sayı giriniz");
        //int sayi=s.nextInt();
        int sayi=0;
        int toplam=0;
        while (sayi!=-1){
            toplam+=sayi;
            System.out.println("Bir sayı giriniz");
            sayi=s.nextInt();
        }
        System.out.println("Toplam = "+toplam);
    }

}
