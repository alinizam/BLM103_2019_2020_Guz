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
public class Soru5 {

    public static void main(String[] args) {
        int y = 20;
        int x = 1;
        boolean buyukMu = true;
        while (buyukMu) {
            if (x > 1) {
                System.out.println("x: " + x + "  y: " + y);
            }
            y = y >> 1;
            buyukMu = (2 * x++ <= y--);
        }
        System.out.println("x: " + x + "  y: " + y);

    }
}
