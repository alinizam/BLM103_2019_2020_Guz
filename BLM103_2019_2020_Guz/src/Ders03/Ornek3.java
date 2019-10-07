/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders03;

/**
 *
 * @author alinizam
 */
public class Ornek3 {

    public static void main(String[] args) {
        int x = 2, y = 3, sonuc;
        sonuc = 3 * (x++) + (x--);
        System.out.println("sonuc = " + sonuc + "  x inson hali :" + x);

        System.out.println(++x == y--);
        System.out.println(x > y);
        System.out.println(x + ":" + y);

        sonuc = (x = (2 * (x++) - (--x)) + (--y + y++));
        System.out.println("Sonuç = " + sonuc);
        System.out.println(x + ":" + y);
    }
}
