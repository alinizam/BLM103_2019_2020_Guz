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
public class Ornek3 {

    public static void main(String[] args) {
        /*
        İkilik sistemde verilen 3 basamaklı bir sayının 2’ye bölünüp bölünmediğini 
        bit düzeyindeki operatörler ile bulunuz (Mod kullanılmadan).

        */
        int sayi = 0b111;
        int kontrol = 1;    // 0b001
        
        System.out.println((sayi & kontrol) == 0 ? "Bölünür" : "Bölünemez");

    }
}
