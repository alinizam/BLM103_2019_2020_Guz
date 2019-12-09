/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders12.Ornek3;

/**
 *
 * @author alinizam
 */
public class DonusumTest {

    public static void main(String[] args) {
        Personel p = new Memur();
        if (p instanceof Isci) {
            Isci i=(Isci) p;
            System.out.println(i.getMaas());
        }
        Memur m=new Memur();
        Personel p1=m;
        YeniFabrika f=new YeniFabrika();
        if (f.getPersonel() instanceof Isci)
            System.out.println(((Isci)f.getPersonel()).getMesai());
    }
}
