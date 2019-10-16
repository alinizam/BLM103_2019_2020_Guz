/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders04Lab;

/**
 *
 * @author alinizam
 */
public class Ornek8 {

    public static void main(String[] args) {
        int sayi = 4000;
        int rakam = 9;
        int temp = sayi;
        int basamak;
        boolean varMi = false;
        while (temp > 0) {
            basamak = temp % 10;
            if (basamak == rakam) {
                varMi = true;
            }
            System.out.println(basamak);
            temp = temp / 10;
        }
        if (varMi==true) {
            System.out.println("Rakam Var");
        } else {
            System.out.println("Rakam Yok");
        }
    }
}
