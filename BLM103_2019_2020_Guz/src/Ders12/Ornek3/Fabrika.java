/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders12.Ornek3;

/**
 *
 * @author alinizam
 */
public class Fabrika {
    Personel[] personeller=new Personel[3];
    Memur[] memurlar=new Memur[5];
    Isci[] isciler=new Isci[2];
    
    int getToplamMaas(){
        int toplam=0;
        for (Personel personel : personeller) {
            toplam+=personel.getMaas();
        }
        for (Memur memur : memurlar) {
            toplam+=memur.getMaas();
        }
        for (Isci isci : isciler) {
            toplam+=isci.getMaas();
        }
        return toplam;
    }
}
