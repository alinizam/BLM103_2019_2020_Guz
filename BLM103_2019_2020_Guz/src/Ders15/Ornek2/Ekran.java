/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders15.Ornek2;

import java.util.ArrayList;

/**
 *
 * @author alinizam
 */
public class Ekran {
    String renk;
    ArrayList<Bilesen> bilesenler=new ArrayList();
    void bilesenlerRenk(){
        for (Bilesen bilesen : bilesenler) {
           bilesen.renk=renk;
           bilesen.boya(renk);
        }
    }
    //İç sınıf ile parametre geçmeden ortama uygun davranma
    ArrayList<benimBilesenim> icBilesenler=new ArrayList();
    class benimBilesenim extends Bilesen{
        String renk=Ekran.this.renk;

        @Override
        void boya(String renk) {
            renk=Ekran.this.renk;
        }
        
    }
}
