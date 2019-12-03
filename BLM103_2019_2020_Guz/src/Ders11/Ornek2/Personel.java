/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders11.Ornek2;

import java.util.ArrayList;

/**
 *
 * @author alinizam
 */
public class Personel {
    String adi,soyadi;
    int maas;
    static ArrayList<Personel> personeller=new ArrayList();
    public Personel() {
        personelSayisi++;
        personeller.add(this);
    }
    
    static int personelSayisi;
    static int zamYap(int zam){
        return zam;
    }
}
