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
public class Ornek2 {
    public static void main(String[] args) {
        //4 sayının faktöriyelini bulunuz.
        int sayi=4;
       //System.out.println(sayi*(sayi-1)*(sayi-2)*(sayi-3));
        int f=1;
        f*=sayi==0?1:sayi;
        sayi--;
        f*=sayi==0?1:sayi;
        sayi--;
        f*=sayi==0?1:sayi;
        sayi--;
        f*=sayi==0?1:sayi;
        sayi--;
        
        System.out.println("Faktöriyel = " +f);
    }
}
