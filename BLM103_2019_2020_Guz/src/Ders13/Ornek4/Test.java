/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders13.Ornek4;

/**
 *
 * @author alinizam
 */
public class Test {
    public static void main(String[] args) {
        Araba a=new Araba();
        System.out.println(((IDemirbas)a).getFiyat());
        System.out.println(((ITasit)a).getFiyat());
    }
}
