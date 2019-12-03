/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders11.Ornek4;

/**
 *
 * @author alinizam
 */
public class Personel {
    final static int sayi;
    final int maas;
    static{
        sayi=10;
    }
    public Personel() {
        maas=1000;
    }
    
    int x;
    static int y;

    //static int getX() {
       // Hatalı Kod
       //return x;
    //}
    static int getY() {
        return y;
    }
    int getXY() {
        return x * y;
    }
}
