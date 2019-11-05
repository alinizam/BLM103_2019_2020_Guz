/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders07.Ornek4;

/**
 *
 * @author alinizam
 */
public class Fabrika {
    void sonHizArtir(Araba araba,int sonHiz){
        araba.sonHiz=sonHiz;
    }
    Araba arabaUret(){
        Araba yeniAraba=new Araba();
        return yeniAraba;
    }
    Araba modelliArabaUret(String marka,String model){
        Araba yeniAraba=new Araba();
        yeniAraba.marka=marka;
        yeniAraba.model=model;
        return yeniAraba;
    }
    void arabaOzellikleriniYazdir(Araba araba){
        System.out.println("Arabanın marka="+araba.marka);
        System.out.println("Arabanın model="+araba.model);
        System.out.println("Arabanın hızı="+araba.anlikHiz);
        System.out.println("Arabanın son hız="+araba.sonHiz);
    }
    
}
