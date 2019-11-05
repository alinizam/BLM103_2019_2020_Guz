/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders07.Ornek4;

/**
 *
 * @author alinizam
 */
public class ArabaTest {
    public static void main(String[] args) {
        Araba araba=new Araba();
        
        //basit değişken
        int hiz=10;
        araba.hizAyarla(hiz);
        System.out.println(hiz);
        
        //referasn değişken
        Araba araba1=new Araba();
        araba1.sonHiz=150;
        Fabrika f=new Fabrika();
        f.sonHizArtir(araba1, 200);
        System.out.println(araba1.sonHiz);   
    }
}
