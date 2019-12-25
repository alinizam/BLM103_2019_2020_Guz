/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders14Lab;

/**
 *
 * @author alinizam
 */
public class Test {
    public static void main(String[] args) {
        IHareket bilesen=new Buton();
        bilesen.SetXY(10, 20, 5, 15);
        bilesen.HareketEt(10);
        System.out.println("Buton= "+bilesen.getX1());
        
        bilesen=new MetinKutu();
        bilesen.SetXY(10, 20, 5, 15);
        bilesen.HareketEt(10);
        System.out.println("Metin Kutu= "+bilesen.getX1());
        
        Ekran e=new Ekran();
        e.bilesenEkle(bilesen);
        bilesen=new Buton();
        bilesen.SetXY(10, 30, 5, 15);
        e.bilesenEkle(bilesen);
        
        
        System.out.println("Ekrandaki bileşenlerin toplam alanı ="+e.getAlan());
        Bilesen b=new Buton();
        b.setRenk("Mavi");
        e.bilesenEkle((IHareket)b);
        System.out.println(e.renkliBilesenSayi("Mavi"));
        
    }
}
