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
public class Ornek7_2 {

    public static void main(String[] args) {
        // Üç sayıdan en büyüğünü bulunuz.
        int x = 16, y = 8, z = 11;
        int sonuc = (x > y ? (x > z ? x : z) : (z > y) ? z : y);
        System.out.println(sonuc);
    }
}
