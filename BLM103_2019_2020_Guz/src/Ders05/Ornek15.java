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
public class Ornek15 {

    // VErilen bir aralıkta 7'ye bölünen sayı var mı? bulunuz
    public static void main(String[] args) {
        int baslangic = 10, bitis = 1300;
        boolean varMi = false;
        for (int i = baslangic; i < bitis; i++) {
            if (i % 7 == 0) {
                varMi = true;
                break;
            }
            System.out.println("i : " + i + " var mi = "+varMi);
        }
        System.out.println("Bölünen sayı var =" + varMi);
    }
}
