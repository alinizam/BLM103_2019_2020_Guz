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
public class Ornek11 {

    public static void main(String[] args) {
        int sayi = 551;
        int yuzler = sayi % 10;
        int birler = sayi / 100;
        int onlar = (sayi / 10) % 10;
        System.out.println(yuzler * 100 + onlar * 10 + birler);
    }
}
