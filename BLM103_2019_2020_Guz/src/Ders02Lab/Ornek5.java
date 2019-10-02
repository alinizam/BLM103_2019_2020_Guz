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
public class Ornek5 {
    public static void main(String[] args) {
        int karakterKod=69;
        char c=(char)karakterKod;
        boolean esitMi;
        esitMi= (c =='A') || (c =='E') || (c =='O') || (c =='U');
        System.out.println("Sesli harf = " +esitMi);
    }
}
