/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders12Lab;

/**
 *
 * @author alinizam
 */
public class Test {
    public static void main(String[] args) {
        Fabrika f=new Fabrika();
        f.personelEkle(new Isci("Ahmet",10000,2000));
        f.personelEkle(new Isci("Mehmet",10000,4000));
        f.personelEkle(new Isci("Ayşe",10000,6000));
        f.personelEkle(new Memur());
        f.personelEkle(new Sozlesmeli());
        String[] turAdetler= f.getPersonelTurAdet();
        for (String tur : turAdetler) {
            System.out.println(tur);
        }
        System.out.println("---------------");
        f.yazdirYuksekMesaiIsci();
        
        Birim b=new Birim();
        Memur m=new Memur(b);
        m.maas=6000;
        Memur m1=new Memur(b);
        m1.maas=7000;
        Isci i1=new Isci(b);
        i1.maas=10000;
        
        f.personelEkle(m);
        f.personelEkle(m1);
        f.personelEkle(i1);
        System.out.println(f.getEnYuksekMemurMaas(b));
        
    }
}
