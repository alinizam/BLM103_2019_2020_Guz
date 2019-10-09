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
public class Ornek1a {
    /*
        Bir öğrencinin dönem sonu notuna göre alacağı harf notunu hesaplayan bir program yazınız. 
        100-70 arası AA
        70-40 arası CC
        40’ten küçükse FF
        ? Ve if kullanarak ayrı ayrı çözünüz.
    */
    public static void main(String[] args) {
        int not = 70;

        if (not <= 100 && not >= 70) {
            System.out.println("AA");
        }
        if (not < 70 && not >= 40) {
            System.out.println("CC");
        }
        if (not < 40 && not >= 0) {
            System.out.println("FF");
        }
    }
}
