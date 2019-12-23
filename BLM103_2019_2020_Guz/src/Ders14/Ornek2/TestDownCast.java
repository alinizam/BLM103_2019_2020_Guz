/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders14.Ornek2;

/**
 *
 * @author alinizam
 */
public class TestDownCast {
    public static void main(String[] args) {
        Araba a=new Araba();
        System.out.println(((ISatilabilir)a).getFiyat()); 
        System.out.println(((IHareketEdebililir)a).getHiz());
        Kamyon k=new Kamyon();
        System.out.println(((ISatilabilir)k).getFiyat()); 
        System.out.println(((IHareketEdebililir)k).getHiz());
    }
}
