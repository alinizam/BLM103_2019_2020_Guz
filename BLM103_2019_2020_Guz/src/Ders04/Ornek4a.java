/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders04;

/**
 *
 * @author alinizam
 */
public class Ornek4a {
    // not > 70 se A
    // not 50-70 C
    // not < 50 F
    public static void main(String[] args) {
        int not=80;
        char harfNot=' ';
        if (not>=70 && not<=100){
            harfNot='A';
        }
        if (not>=50 && not<70){
            harfNot='C';
        }
        if (not>=0 && not<40){
            harfNot='F';
        }
        System.out.println("Harf Notu  = " +harfNot);
        
    }
}
