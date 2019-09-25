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
public class Ornek15 {

    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int c = 8;
        //Birinci yöntem
        System.out.println(3 - (a % 2 + b % 2 + c % 2));
        
        //İkinci yöntem
        int sayac = 0;
        sayac = sayac + 1 - (a%2);
        sayac = sayac + 1 - (b%2);
        sayac = sayac + 1 - (c%2);
        
        System.out.println(sayac);
        
        //Üçüncü yöntem
        sayac = 0;
        sayac = sayac + (a%2);
        sayac = sayac + (b%2);
        sayac = sayac + (c%2);
        
        System.out.println(3 - (sayac));
    }
}
