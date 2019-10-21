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
public class Ornek2b {
    public static void main(String[] args) {
         Scanner s=new Scanner(System.in);
        int sayi=0;
        int toplam=0;
        do{
            toplam+=sayi;
            System.out.println("Bir sayı giriniz");
            sayi=s.nextInt();
        }while(sayi!=-1);
        System.out.println("Toplam = "+toplam);
    }
}
