/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders05Lab;


/*
   1
   2 3
   4 5 6
   7 8 9 10
   11 12 13 14 15
 */
public class Ornek1 {
    public static void main(String[] args) {
        int sayac=1;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(sayac +" ");
                sayac++;
            }
            System.out.println("");
        }
 
    }
}
