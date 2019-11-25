/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders10;

import java.util.ArrayList;

/**
 *
 * @author alinizam
 */
public class Ornek4 {
    public static void main(String[] args) {
        ArrayList<Personel> personeller=new ArrayList<Personel>();
        Personel p=new Personel();
        p.adi="Ahmet";
        p.maas=50000;
        personeller.add(p);
        Personel p1=new Personel();
        p1.adi="Ayşe";
        p1.maas=60000;
        personeller.add(p1);
        System.out.println(personeller.get(0).maas);
        System.out.println(personeller.size());
        int toplam=0;
        for (Personel personel : personeller) {
            toplam+=personel.maas;
        }
        System.out.println("Toplam  = "+toplam);
        System.out.println(personeller.indexOf(p1));
        
        
    }
}
