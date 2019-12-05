/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders11Lab;

/**
 *
 * @author alinizam
 */
public class Test {
    public static void main(String[] args) {
        Maas m1 = new Maas(9000,500);
        Maas m2 = new Maas(9000,500);
        Maas m3 = new Maas(9000,500);
        
        Personel p = new Personel();
        Akademik a = new Akademik();
        Idari i = new Idari();
        i.seviye = 1;
        
        p.setMaas(m1);
        a.setMaas(m2);
        i.setMaas(m3);
        
        System.out.println("personel maaş: " + p.maas.netMaas);
        System.out.println("akademik maaş: " + a.maas.netMaas);
        System.out.println("idari maaş: " + i.maas.netMaas);
        /*
        int toplamMaas = Personel.toplamMaasiBul();
        System.out.println("toplam maaş :  " + toplamMaas);*/
    }
}
