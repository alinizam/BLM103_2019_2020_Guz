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
public class Ornek18a {

    //sayının faktöriyelini while döngüsü ile bulunuz.
    public static void main(String[] args) {
        int sayi = 5;
        int i = sayi;
        int f = 1;
        while (i > 0) {
            f=f*i;
            i--;
        }
        System.out.println(f);
    }
}
