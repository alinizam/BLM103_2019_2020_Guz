/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders09Lab.Ornek2;

/**
 *
 * @author alinizam
 */
public class Test {
    public static void main(String[] args) {
        Fabrika f=new Fabrika();
        Personel p1=new Personel();
        p1.unvan="Memur";
        p1.adi="Ahmet";
        p1.soyadi="Ak";
        p1.maas=5000;
        Personel p2=new Personel();
        p2.unvan="İşçi";
        p2.maas=6000;
        Personel p3=new Personel();
        p3.unvan="Memur";
        p3.maas=10000;
        f.personelEkle(p1);
        f.personelEkle(p2);
        f.personelEkle(p3);
        System.out.println(f.getUnvanToplam("Memur"));
        f.setIsimMaas("Ahmet","Ak", 50000);
        System.out.println(f.getUnvanToplam("Memur"));
    }
}
