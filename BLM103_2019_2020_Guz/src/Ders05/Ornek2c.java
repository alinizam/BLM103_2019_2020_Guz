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
public class Ornek2c {
     public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        //System.out.println("Bir sayı giriniz");
        //int sayi=s.nextInt();
        int sayi=0;
        int toplam=0;
        System.out.println("Bir sayı giriniz");
        while ((sayi=s.nextInt())!=-1){
            toplam+=sayi; 
            System.out.println("Bir sayı giriniz");
        }
        System.out.println("Toplam = "+toplam);
    }

}
