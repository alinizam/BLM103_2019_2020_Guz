/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders11.Ornek7;

/**
 *
 * @author alinizam
 */
public class Test {
    public static void main(String[] args) {
        Personel p=new Personel();
        p.adi="Ahmet";
        System.out.println(p.getMaas());
        
        Memur m=new Memur();
        m.burut=10000;
        m.vergi=1000;
        m.mesai=10000;
        System.out.println(m.adi);
        System.out.println(m.getMaas());
        
        
        Isci i=new Isci();
        i.burut=10000;
        i.vergi=1000;
        i.mesai=5000;
        
        System.out.println(i.getMaas());
        
        
    }
}
