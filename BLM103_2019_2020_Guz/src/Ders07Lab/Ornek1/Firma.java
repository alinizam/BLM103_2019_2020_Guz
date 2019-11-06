/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders07Lab.Ornek1;

/**
 *
 * @author alinizam
 */
public class Firma {
    Personel amir,memur;
    void amirAta(Personel p){
        amir=p;
    }
    void memurAta(Personel p){
        memur=p;
    }
    int maasToplam(){
        return (amir.netMaas+memur.netMaas);
    }
}
