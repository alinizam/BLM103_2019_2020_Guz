/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders11.Ornek2;

/**
 *
 * @author alinizam
 */
public class StaticErisimTest {
    public static void main(String[] args) {
        Personel p=new Personel();
        Personel.personelSayisi=3;
        p.personelSayisi++;
        Personel p1=new Personel();
        p1.personelSayisi++;
        
        System.out.println(p.personelSayisi);
    }
}
