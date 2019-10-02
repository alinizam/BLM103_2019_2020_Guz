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
public class Ornek6 {
    //Verilen 2 karakterin ASCII değerleri toplamında hangi karakterin olduğunu bulunuz.

    public static void main(String[] args) {
        char c1 = '1';
        char c2 = '2';

        int res = (int) c1 + (int) c2;
        System.out.println("yeni karakter : " + (char) res);
    }
}
