/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders07.Ornek1;

/**
 *
 * @author alinizam
 */
public class ArabaTest {
    public static void main(String[] args) {
       //Yeni araba üretmek
        new Araba();
        
        Araba araba;
        araba=new Araba();
        araba.marka="Mercedes";
        araba.model="E250";
        araba.fiyat=300000;
        
        System.out.println(araba);
        
       
    }
}
