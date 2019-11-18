/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders09.Ornek7;

/**
 *
 * @author alinizam
 */
public class ArabaReferansTest {
    public static void main(String[] args) {
        //Araba arabalar[]={new Araba(),new Araba(),new Araba()};
        Araba arabalar[]=new Araba[3];
        Araba araba=new Araba();
        araba.fiyat=500;
        arabalar[0]=araba;
        arabalar[1]=araba;
        arabalar[2]=araba;
        arabalar[1].fiyat=600;
        araba.fiyat=800;
        int toplam=0;
        for (int i = 0; i < arabalar.length; i++) {
            toplam+=arabalar[i].fiyat;
        }
        System.out.println("Toplam= "+toplam);
    }
}
