/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders07.Ornek2;

/**
 *
 * @author alinizam
 */
public class ArabaMetotTest {
    public static void main(String[] args) {
        Araba araba=new Araba();
        araba.hizlan();
        System.out.println(araba.anlikHiz);
        araba.hizlan();
        System.out.println(araba.anlikHiz); 
        araba.anlikHiz=150;
        araba.sonHiz=160;
        for (int i = 0; i < 15; i++) {
            araba.hizlan();
        }
        araba.anlikHiz=120;
        araba.hizlanArtisDegerineGore(5);
        System.out.println(araba.anlikHiz);
        
        System.out.println(araba.hiziOku());
        
    }
}
