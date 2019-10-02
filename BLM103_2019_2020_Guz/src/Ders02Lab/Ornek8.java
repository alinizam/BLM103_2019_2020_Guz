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
public class Ornek8 {
    // Tek basamaklı bir hexodecimal sayının ikilik karşılığını bulunuz.

    public static void main(String[] args) {
        int num = 0xE;

        int bolen = num;
        
        int kalan1 = bolen % 2;
        bolen = bolen / 2;

        int kalan2 = bolen % 2;
        bolen = bolen / 2;

        int kalan3 = bolen % 2;
        bolen = bolen / 2;

        int kalan4 = bolen % 2;
        //bolen = bolen / 2;
        
        System.out.println(num);
        System.out.println(kalan4 + "" + kalan3 + "" + kalan2 + "" + kalan1);
    }
}
