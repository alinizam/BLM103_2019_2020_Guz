/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders06Lab;

/**
 *
 * @author alinizam
 */
public class Ornek5 {
    public static void main(String[] args) {
        int f=2;
        for (int i = 0; i < 5; i++) {
            int artis=(i%2==0)?1:-1;
            int sayi=f;
            for (int j = 0; j < (5-i); j++) {
                System.out.print(sayi+" ");
                sayi=sayi+artis;
            }
            f=f*(i+3);
            System.out.println("");
        }
    }
}
