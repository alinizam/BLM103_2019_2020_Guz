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
public class ArabaTest {
    public static void main(String[] args) {
        Araba araba=new Araba();
        
        araba.sonHiz=200;
        araba.anlikHiz=100;
        for (int i = 0; i < 200; i++) {
            araba.anlikHiz++;
            System.out.println(araba.anlikHiz);
        }
    }
}
