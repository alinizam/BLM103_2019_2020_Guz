/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders02Lab;

/**
 *
 * @author alinizam
 */
public class Ornek9 {

    // Verilen bir sayının 10’un en yakın katının sayı değerini bulunuz. 
    // (Örnek: 146 verildiğinde 150, 143 verildiğinde 140 bulunmalıdır. 
    // 145 için en yakın 150 olacaktır.) 
    public static void main(String[] args) {
        int sayi=148;
        System.out.println(((sayi + 5) / 10) * 10);
        
        double dSayi=148.8;
        sayi = (int)dSayi;
        System.out.println(((sayi + 5) / 10) * 10);
    }

}
