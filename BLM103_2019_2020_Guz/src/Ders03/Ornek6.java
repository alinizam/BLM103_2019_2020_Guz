/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders03;

/**
 *
 * @author alinizam
 */
public class Ornek6 {
    public static void main(String[] args) {
        // Sayının ikiye bölünüp bölünmediğini 'E' ve 'H' karakterleriyle yazdırınız.
        int sayi=11;
        char sonuc=(sayi%2)==0 ? 'E':'H';
        System.out.println(sonuc);
        
        boolean sonucBool=(sayi%2)==0 ? true:false;
        System.out.println(sonucBool);
        //Hatalı kod
        //String s=(sayi%2)==0 ?  System.out.println("Evet"):System.out.println("Evet"); 
       
    }
}
