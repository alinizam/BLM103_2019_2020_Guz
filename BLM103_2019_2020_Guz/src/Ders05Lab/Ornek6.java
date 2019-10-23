/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders05Lab;

/**
 *
 * @author alinizam
 */
public class Ornek6 {

    public static void main(String[] args) {
        int sayac=10;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == 4 - j) {
                    System.out.print(sayac+" ");
                     sayac=sayac-2;
                } else if (i < 4 - j) {
                    System.out.print("x ");
                } else {
                    System.out.print("y ");
                }
            }
            System.out.println("");
        }
    }
}
