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
public class BasitTest {
    public static void main(String[] args) {
        Personel p=new Personel();
        System.out.println(p.getMaas());
        p=new Isci();
        System.out.println(p.getMaas());
        //Aralarında Kalıtım olmayan sınıflara arayaüzlük yapılamaz p=new Sozlesmeli();
        Personel p1=new Isci();
        //Isci i=p1;    Hatalı çünkü tüm personeller işçi değil
    }
}
