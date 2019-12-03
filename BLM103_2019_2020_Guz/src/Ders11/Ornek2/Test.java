/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders11.Ornek2;

/**
 *
 * @author alinizam
 */
public class Test {
    public static void main(String[] args) {
         
        Personel p=new Personel();
        Personel p1=new Personel();
        Personel p2=new Personel();
        new Personel();
        Personel[] personeller={new Personel(),new Personel()};
        System.out.println(p.personelSayisi);
        Personel.zamYap(1000);
        Fabrika f=new Fabrika();
        System.out.println(f.getPersonelSayi());
        
    }
}
