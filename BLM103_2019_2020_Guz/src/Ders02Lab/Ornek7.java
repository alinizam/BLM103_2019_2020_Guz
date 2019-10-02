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
public class Ornek7 {

    //ASCII kodu 65’dan sonra gelen 5 karakteri ekrana yan yana yazdırınız.
    public static void main(String[] args) {
        char c = 65;
        int kod = c;
        kod = kod + 1;
        c = (char) kod;
        System.out.println(c);
        kod = kod + 1;
        c = (char) kod;
        System.out.println(c);
        kod = kod + 1;
        c = (char) kod;
        System.out.println(c);
        kod = kod + 1;
        c = (char) kod;
        System.out.println(c);
        kod=kod+1;
        c=(char)kod;
        System.out.println(c);
    }
}
