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
public class YeniFabrika {

    Personel[] personeller = new Personel[10];
    Personel getPersonel(){
        return null;
    }
    int getToplamMaas() {
        int toplam = 0;
        for (Personel personel : personeller) {
            if (personel != null) {
                toplam += personel.getMaas();
                System.out.println(personel.getClass()+" "+personel.getMaas());
            }
        }
        return toplam;
    }
}
