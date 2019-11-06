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
public class Test {
    public static void main(String[] args) {
        Personel p=new Personel();
        p.adi="Ahmet";
        p.soyadi="Ak";
        p.ismiGoster();
        System.out.println(p.ismiDondur());
        
        p.calismaSure=19;
        p.maasHesapla();
        System.out.println(p.maasOku());
      
        p.maatAta(5000);
        System.out.println(p.maasOku());
    }
}
