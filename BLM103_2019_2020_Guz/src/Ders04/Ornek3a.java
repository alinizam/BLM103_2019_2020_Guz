/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders04;

/**
 *
 * @author alinizam
 */
public class Ornek3a {
    //sayının mutlak değerini bulunuz.
    public static void main(String[] args) {
        int sayi=-5;
        int temp=sayi;
        if (sayi<0){
            temp=sayi*-1;
        }
        System.out.println(sayi + " sayinin mutlak değer  = "+ temp);
    }
}
