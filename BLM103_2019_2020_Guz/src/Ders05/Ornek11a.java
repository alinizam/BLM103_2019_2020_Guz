/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders05;

/**
 *
 * @author alinizam
 */
public class Ornek11a {
        /* Bir defada tek yıldız hakkı
        *****
        ****
        ***
        **
        *
        */
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 5; j > i ; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
