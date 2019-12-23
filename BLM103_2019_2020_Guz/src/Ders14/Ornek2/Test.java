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
public class Test {
    public static void main(String[] args) {
        IHareketEdebililir iAraba=new Araba();
        IHareketEdebililir iKamyon=new Kamyon();
        System.out.println(iKamyon.getHiz());
        System.out.println(iAraba.getHiz());
        iAraba=new Kamyon();
        System.out.println(iAraba.getHiz());
        
        ISatilabilir iArac=new Araba();
        System.out.println(iArac.getFiyat());
    }
        
}
