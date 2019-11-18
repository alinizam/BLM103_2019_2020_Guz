/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders09.Ornek8;

/**
 *
 * @author alinizam
 */
public class Test {
    public static void main(String[] args) {
        Galeri g=new Galeri();
        g.arabalar[0]=new Araba();
        g.arabalar[1].sofor=new Sofor();
        g.arabalar[1].sofor.maas=10000;
        int toplam=0;
        for (Araba araba : g.arabalar) {
            toplam+=araba.sofor.maas;
        }
        System.out.println(toplam);
    }
}
