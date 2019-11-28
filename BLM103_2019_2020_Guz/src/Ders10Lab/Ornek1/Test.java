/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders10Lab.Ornek1;

/**
 *
 * @author alinizam
 */
public class Test {
    public static void main(String[] args) {
        Fabrika f=new Fabrika();
        Malzeme m=new Malzeme();
        m.adi="Kalem";
        m.fiyat=3;
        f.malzemeEkle(m, 0);
        Malzeme m1=new Malzeme();
        m1.adi="Silgi";
        m1.fiyat=5;
        f.malzemeEkle(m1, 1); 
        System.out.println(f.getToplamMalzeme());
        System.out.println(f.getToplamMalzemeTutar());
        f.dusukTutarliMalzemeSil(4);
        System.out.println(f.getToplamMalzeme());
        System.out.println(f.getToplamMalzemeTutar());        
    }
}
