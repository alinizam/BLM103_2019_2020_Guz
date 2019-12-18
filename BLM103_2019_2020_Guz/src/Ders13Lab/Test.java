/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders13Lab;

import Ders13Lab.PersonelPaketi.Personel;

/**
 *
 * @author alinizam
 */
public class Test {
    public static void main(String[] args) {
        Personel p=new Personel();
        p.getAdi();
        p.setAdi("Ahmet");
        p.getAdi();
        p.setUnvanlar(null);
        System.out.println(Personel.metotCagrilari);
        
    }
}
