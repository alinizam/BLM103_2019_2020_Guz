/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders12.Ornek1;

/**
 *
 * @author alinizam
 */
public class Araba {
    int sonHiz=200;

    public Araba() {
        System.out.println("Arabanın varsayılan yapısıcısı çağrıldı.");
    }
    
    public Araba(int sonHiz) {
        this.sonHiz = sonHiz;
        System.out.println("Arabanın yapısıcısı çağrıldı");
    }
    
}
