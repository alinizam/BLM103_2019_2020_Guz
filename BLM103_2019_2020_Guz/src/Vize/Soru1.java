/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vize;

/**
 *
 * @author alinizam
 */
public class Soru1 {

    public static void main(String[] args) {
        /*
        16’lık hexadecimal sistemde büyük ‘A’ harfi ‘41’ ve ‘Z’ harfi ‘5A’ ve 
        küçük ‘a’ harfi ‘61’ ve ‘z’ harfi ‘7A’ ile temsil edilmektedir. Verilen bir karakteri; 
        büyük harf, küçük harf veya harf olmayan karakter şeklinde niteleyen algoritmayı kodlayınız.
         */
        char A = 0x41;
        char Z = 0x5A;
        char a = 0x61;
        char z = 0x7A;
        //char karakter = 'K';
        int karakter='K';
        if (karakter >= A && karakter <= Z) {
            System.out.println("Büyük harf");
        } else if (karakter >= a && karakter <= z) {
            System.out.println("Küçük harf");
        } else {
            System.out.println("Harf değil");
        }

    }
}
