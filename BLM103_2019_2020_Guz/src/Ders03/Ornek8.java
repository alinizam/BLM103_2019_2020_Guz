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
public class Ornek8 {
    public static void main(String[] args) {
        int sayi1=11; //1011
        int sayi2=9;  //1001
        //1011
        //1001
    //& //1001
        int sonuc = sayi1 & sayi2;
        System.out.println(sonuc);
        //1011
        //1001
    //| //1011   
        sonuc = sayi1 | sayi2;
        System.out.println(sonuc);
        
        sayi1=3;   //0011
        sayi2=14;  //1110
        sonuc = sayi1 & sayi2;  //10
        System.out.println(sonuc);
    }
}
