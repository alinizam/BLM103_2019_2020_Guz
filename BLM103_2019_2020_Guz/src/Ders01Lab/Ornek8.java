/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders01Lab;

/**
 *
 * @author alinizam
 */
public class Ornek8 {

    public static void main(String[] args) {
        int hedef = 3;
        int kaynak = 5;

        System.out.println("hedef : " + hedef + " kaynak : " + kaynak);

        hedef = hedef + kaynak;
        kaynak = hedef - kaynak;
        hedef = hedef - kaynak;

        System.out.println("hedef : " + hedef + " kaynak : " + kaynak);
    }
}
