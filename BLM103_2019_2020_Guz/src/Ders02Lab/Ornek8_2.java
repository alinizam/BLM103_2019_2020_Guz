/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders02Lab;

/**
 *
 * @author alinizam
 */
public class Ornek8_2 {
    public static void main(String[] args) {
         int num = 0xA;

        int bolen = num;
        int carpim=1;
        int yazilacakSayi = carpim*(bolen % 2);
        bolen = bolen / 2;
        carpim=carpim*10;

        yazilacakSayi = yazilacakSayi+carpim*(bolen % 2);
        bolen = bolen / 2;
        carpim=carpim*10;

        yazilacakSayi = yazilacakSayi+carpim*(bolen % 2);
        bolen = bolen / 2;
        carpim=carpim*10;

        yazilacakSayi = yazilacakSayi+carpim*(bolen % 2);
        bolen = bolen / 2;
        carpim=carpim/10;
         
        System.out.println(num);
        System.out.println(yazilacakSayi);
    }
}
