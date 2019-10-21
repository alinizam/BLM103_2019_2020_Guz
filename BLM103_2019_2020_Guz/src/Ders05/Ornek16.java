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
public class Ornek16 {
     public static void main(String[] args) {
        int sayi=18;
        boolean asalMi=true;
        for (int i = 2; i <= sayi/2; i++) {
             if (sayi%i==0){
                 asalMi=false;
                 break;
             }
        }
        System.out.println("Aral Mi : "+asalMi);
    }
   
}
