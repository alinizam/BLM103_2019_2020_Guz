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
public class Ornek18 {

    public static void main(String[] args) {
        // Verilen bir aralıkta asal sayı olmadığını bulunuz.
        int baslangic = 16, bitis = 170000;
        boolean asalMi=false;
        ust:
        for (int i = baslangic; i <= bitis; i++) {          
            asalMi = true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    asalMi = false;
                    break ust;
                }
            }
            
        }
        System.out.println("Var Mi : " + asalMi);
    }

}
