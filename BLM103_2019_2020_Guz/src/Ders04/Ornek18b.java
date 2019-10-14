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
public class Ornek18b {

    //sayının faktöriyelini while döngüsü ile bulunuz.
    public static void main(String[] args) {
        int sayi = 5;
        int i = 1;
        int f = 1;
        while (i <= sayi) {
            f = f * i;
            i++;
        }
        System.out.println(f);
    }
}
