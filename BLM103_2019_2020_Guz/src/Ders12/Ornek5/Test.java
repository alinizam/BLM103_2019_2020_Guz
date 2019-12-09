/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders12.Ornek5;

/**
 *
 * @author alinizam
 */
public class Test {

    
         

    public static void main(String[] args) {
        Kisi Insan1 = new Kisi();
        Personel Insan2 = new Personel();
        Personel Insan3 = new Muhendis();

        KimimOnuYaz(Insan1);
        KimimOnuYaz(Insan2);
        KimimOnuYaz((Personel) Insan3);

    }

    static void KimimOnuYaz(Kisi k) {
        k.BenKimim();
    }

}


