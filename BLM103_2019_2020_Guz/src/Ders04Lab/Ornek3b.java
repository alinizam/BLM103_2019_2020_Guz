/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders04Lab;

/**
 *
 * @author alinizam
 */
public class Ornek3b {

    public static void main(String[] args) {
        int sayi = 7;

        int i = 1;
        int faktoriyel = 1;
        while (i <= sayi) {
            faktoriyel = faktoriyel * i;
            System.out.println(i + "! = " + faktoriyel);
            i++;
        }
    }
}
