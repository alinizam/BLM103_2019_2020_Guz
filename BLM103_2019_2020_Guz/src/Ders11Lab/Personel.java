/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders11Lab;

import java.util.ArrayList;

/**
 *
 * @author alinizam
 */
public class Personel {

    String adi, soyadi;
    int girisTarihi;
    Sirket sirket;
    Maas maas;

    static ArrayList<Personel> personeller = new ArrayList<>();

    public Personel() {
        personeller.add(this);
    }

    public Personel(String adi, String soyadi, int girisTarihi, Sirket sirket, Maas maas) {
        this.adi = adi;
        this.soyadi = soyadi;
        this.girisTarihi = girisTarihi;
        this.sirket = sirket;
        this.maas = maas;

        personeller.add(this);
    }

    void setMaas(Maas maas) {
        this.maas = maas;
    }

    static int toplamMaasiBul() {
        int toplamMaas = 0;
        for (Personel p : personeller) {
            toplamMaas += p.maas.netMaas + p.maas.prim;
        }

        /*
        for (int i = 0; i < personeller.size(); i++) {
            toplamMaas += personeller.get(i).maas.netMaas + personeller.get(i).maas.prim;
        }*/
        return toplamMaas;
    }
}
