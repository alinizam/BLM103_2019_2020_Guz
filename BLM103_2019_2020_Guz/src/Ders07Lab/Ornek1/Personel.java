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
public class Personel {
    String adi,soyadi;
    int calismaSure;
    int netMaas;
    void ismiGoster(){
        System.out.println(adi+" "+soyadi);
    }
    String ismiDondur(){
        return adi+" "+soyadi;
    }
    void maasHesapla(){
        if (calismaSure<10){
            netMaas=3000;
        }else{
            netMaas=4000;
        }
        
    }
    void maatAta(int maas){
        netMaas=maas;
    }
    int maasOku(){
         if (calismaSure<10){
            netMaas=3000;
        }else{
            netMaas=4000;
        }
        return netMaas;
    }
}
