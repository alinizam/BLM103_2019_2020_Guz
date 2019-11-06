/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders07Lab.Ornek2;

/**
 *
 * @author alinizam
 */
public class Test {
    public static void main(String[] args) {
        Saat s=new Saat();
        s.saat=23;
        s.dakika=59;
        s.saniye=50;
        
        for (int i = 0; i < 15; i++) {
            s.saniyeArttir();
            s.saatiGoster();
        }
    }
}
