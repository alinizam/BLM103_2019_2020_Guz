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
public class Ornek1c {
    public static void main(String[] args) {
        int not = 70;
        String harfNotu = "";
        
        harfNotu = not > 70 ? "AA": not > 40 ? "CC" : "FF";
        
        System.out.println(harfNotu);
    }
}
