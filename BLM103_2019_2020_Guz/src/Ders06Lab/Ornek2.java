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
public class Ornek2 {
    public static void main(String[] args) {
        int sayi=1;
        char c='a';
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                if (i%2==0){
                    System.out.print(sayi+" ");
                    sayi*=2;
                }else{
                    System.out.print(c+" ");
                    //c++;
                    c=(char)((int)c+1);
                }
            }
            System.out.println("");
        }
    }
}
