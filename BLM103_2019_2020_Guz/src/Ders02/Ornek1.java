/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders02;

/**
 *
 * @author alinizam
 */
public class Ornek1 {

    public static void main(String[] args) {
        int i = 1234567890;
        int j = 1234567890;
        System.out.println(i + j);

        byte b = 15;
        //Hatalı kod
        //b = b + 2;
        i=b;
        long uzunTamsayi=10l;
        //Hatalı kod
        //int k=10l;
        
        int sayi16likGosterim=0xFF;
        sayi16likGosterim=150;
        System.out.println(sayi16likGosterim);
        
        int sayi2likGosterim = 0b1101;
        System.out.println(sayi2likGosterim);
    }
}
