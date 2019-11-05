/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders07.Ornek1;

/**
 *
 * @author alinizam
 */
public class ArabaTest1 {
    public static void main(String[] args) {
        Araba araba1=new Araba();
        araba1.fiyat=100000;
        Araba araba2=new Araba();
        System.out.println(araba2.fiyat);
        araba2=araba1;
        System.out.println(araba2.fiyat);
        araba2.fiyat=150000;
        System.out.println(araba1.fiyat);
        Araba araba3=araba2;
        System.out.println(araba3.fiyat);
        System.out.println(araba1);
        System.out.println(araba2);
        System.out.println(araba3);
    }
}
