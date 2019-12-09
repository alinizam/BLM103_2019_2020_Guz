/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders12.Ornek2;

/**
 *
 * @author alinizam
 */
public class Test {
    public static void main(String[] args) {
        Personel p=new Personel();
        p.adi="Ahmet";
        p.soyadi="Ak";
        System.out.println(p.getAdi());
        Object o=new Object();
        Personel p1=new Personel();
        p1.adi="Ahmet";
        p1.soyadi="Ak";
        System.out.println(p.equals(p1));    
        p=p1;
        p.sicilNo="A10001";
        System.out.println(p.equals(p1));  
        System.out.println(p.getClass());
        System.out.println(p.toString());
    }
}
