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
public class Ornek8_1 {

    public static void main(String[] args) {
        int num = 0xB;
        int basamakDegeri = 8;

        System.out.print(num / basamakDegeri);
        num = num % basamakDegeri;
        basamakDegeri = basamakDegeri / 2;
        
        System.out.print(num / basamakDegeri);
        num = num % basamakDegeri;
        basamakDegeri = basamakDegeri / 2;
        
        System.out.print(num / basamakDegeri);
        num = num % basamakDegeri;
        basamakDegeri = basamakDegeri / 2;
        
        System.out.println(num / basamakDegeri);
    }
}
