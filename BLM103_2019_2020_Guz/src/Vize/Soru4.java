/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vize;

/**
 *
 * @author alinizam
 */
public class Soru4 {
    public static void main(String[] args) {
        int n=5;
        int sayi=1;
        for (int i = 0; i < n; i++) {
            int satirBasi=sayi-i;
            for (int j = 0; j <= i; j++) {
                System.out.print(satirBasi++ + " ");
            }
            sayi*=2;
            System.out.println("");
        }
    }
}
