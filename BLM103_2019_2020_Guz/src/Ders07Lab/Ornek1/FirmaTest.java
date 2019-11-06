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
public class FirmaTest {
    public static void main(String[] args) {
        Firma f=new Firma();
        Personel p1=new Personel();
        p1.adi="Ahmet";
        p1.soyadi="Ak";
        p1.netMaas=10000;
        f.amirAta(p1);
        Personel pMemur=new Personel();
        pMemur.adi="Mehmet";
        pMemur.soyadi="Ak";
        pMemur.netMaas=8000;
        f.memurAta(pMemur);
        System.out.println(f.amir.adi);
        System.out.println(f.memur.adi);
        
        System.out.println(f.maasToplam());
    }
}
