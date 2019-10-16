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
public class Ornek3 {

    public static void main(String[] args) {
        int sayi = 1;

        while (sayi <= 10) {
            int n = sayi;
            int faktoriyel = 1;
            while (n > 0) {
                faktoriyel = n * faktoriyel;
                n--;
            }
            System.out.println(sayi + "! = " + faktoriyel);
            sayi++;
        }
    }
}
