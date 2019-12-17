/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders13.Ornek1;

/**
 *
 * @author alinizam
 */
public class Test {

    public static void main(String[] args) {
        Personel personeller[] = new Personel[3];
        personeller[0] = new Memur();
        personeller[1] = new Memur();
        personeller[2] = new Personel();
        int toplam = 0;
        for (Personel personel : personeller) {
            if (personel instanceof Memur) {
                Memur m=(Memur) personel;
                toplam += m.ikramiye;
            } 
           
        }
        System.out.println("Toplam = " + toplam);
    }
}
