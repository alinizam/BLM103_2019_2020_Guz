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
public class Ornek4 {
    public static void main(String[] args) {
        int sayi=512;
        System.out.println((double)sayi/100);
        
        double kusurat=(double)sayi/100-sayi/100;
        System.out.println(kusurat);
        
        System.out.println((sayi%100)/100.0);
        
        System.out.println((sayi%100)/(double)100);
    }
}
