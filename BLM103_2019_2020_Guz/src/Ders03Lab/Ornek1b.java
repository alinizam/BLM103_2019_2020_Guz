/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders03Lab;

/**
 *
 * @author alinizam
 */
public class Ornek1b {
    public static void main(String[] args) {
        int not = 70;
        String harfNotu = "";
        
        if (not <= 100 && not >= 70) {
            harfNotu = "AA";
        }
        if (not < 70 && not >= 40) {
            harfNotu = "CC";
        }
        if (not < 40 && not >= 0) {
            harfNotu = "FF";
        }
        
        System.out.println(harfNotu);
    }
}
