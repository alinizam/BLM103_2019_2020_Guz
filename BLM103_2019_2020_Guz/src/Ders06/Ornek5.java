/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders06;

/**
 *
 * @author alinizam
 */
public class Ornek5 {
    public static void main(String[] args) {
        int kalan;
        for (int i = 0; i < 10; i++) {
            kalan=i%2;
            // Statik tanım yapılmamalı  -- int kalan=i%2;
            System.out.println(kalan);
        } 
    }
}
