/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders07.Ornek4;

/**
 *
 * @author alinizam
 */
public class FabrikaTest {
    public static void main(String[] args) {
        Fabrika f=new Fabrika();
        Araba araba=f.arabaUret();
        Araba araba1=f.modelliArabaUret("KIA", "Rio");
        f.arabaOzellikleriniYazdir(araba1);
        
    }
}
