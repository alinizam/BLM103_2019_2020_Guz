/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders01;

import java.util.Scanner;

/**
 *
 * @author alinizam
 */
public class Ornek5 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int sayi;
        sayi = s.nextInt();
        System.out.println("Bir artis miktari giriniz");
        int artisMiktari;
        artisMiktari = s.nextInt();
        System.out.println(sayi);
        sayi = sayi + artisMiktari;
        System.out.println(sayi);
        sayi = sayi + artisMiktari;
        System.out.println(sayi);
        sayi = sayi + artisMiktari;
        System.out.println(sayi);
        sayi = sayi + artisMiktari;
        System.out.println(sayi);

    }
}
