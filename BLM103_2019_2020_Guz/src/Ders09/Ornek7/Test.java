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
public class Test {
    public static void main(String[] args) {
        Araba arabalar[]=new Araba[3];
        
        Araba a=new Araba();
        a.fiyat=500;
        arabalar[0]=a;
        
        arabalar[1]=new Araba();
        arabalar[1].fiyat=700;
        System.out.println(arabalar[0].fiyat);
        int toplam=0;
        /*for (int i = 0; i < arabalar.length; i++) {
            toplam=toplam+arabalar[i].fiyat;
        }*/
        for (Araba araba : arabalar) {
             toplam=toplam+araba.fiyat;
        }
        System.out.println(toplam);
    }
}
