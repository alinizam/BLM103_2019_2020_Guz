/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders12Lab;

import java.util.ArrayList;

/**
 *
 * @author alinizam
 */
public class Fabrika {

    ArrayList<Personel> personeller = new ArrayList();

    void personelEkle(Personel p) {
        personeller.add(p);
    }

    String[] getPersonelTurAdet() {
        String personelTurler[] = {"Personel", "Işçi", "Memur", "Sözleşmeli", "Kadrolu"};
        int personelTurAdet[] = new int[5];
        for (Personel personel : personeller) {
            if (personel instanceof Sozlesmeli) {
                personelTurAdet[3]++;
            } else if (personel instanceof Kadrolu) {
                personelTurAdet[4]++;
            }else if (personel instanceof Isci) {
                personelTurAdet[1]++;
            } else if (personel instanceof Memur) {
                personelTurAdet[2]++;
            }else if (personel instanceof Personel) {
                personelTurAdet[0]++;
            } 
        }
        for (int i = 0; i < personelTurler.length; i++) {
            personelTurler[i] += " " + personelTurAdet[i];
        }
        return personelTurler;
    }
    void yazdirYuksekMesaiIsci(){
        for (Personel personel : personeller) {
            if (personel instanceof Isci){
                Isci i=(Isci)personel;
                if (i.fazlaMesai>(i.maas/2)){
                    System.out.println(i.adi);
                }
            }
        }
    }
    int getEnYuksekMemurMaas(Birim b){
        int enYuksekMaas=0;
        for (Personel personel : personeller) {
            if (personel instanceof Memur && personel.birim==b && personel.maas>enYuksekMaas){
                enYuksekMaas=personel.maas;
            }
        }
        
        return enYuksekMaas;
    }
}
