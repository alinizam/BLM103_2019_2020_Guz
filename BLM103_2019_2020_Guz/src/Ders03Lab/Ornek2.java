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
public class Ornek2 {

    public static void main(String[] args) {
        /*
        Şubat ayı 4’e bölünen yıllarda ve 400’e bölünen 100 yıl başlarında 29 çekmektedir.
        Şubat ayı 4’e bölünmeyen yıllarda 28 çekmektedir.
        Şubat ayı 400’e bölünmeyen 100 yıl başlarında 28 çekmektedir.
        Girilen yıl için şubatın kaç çektiğini bulunuz.        
        */
        
        int gunSayi = 28;
        int yil = 1900;
        if ((yil % 4 == 0 && yil % 100 != 0) || yil % 400 == 0) {
            gunSayi = 29;
        }
        System.out.println("Gün sayı = " + gunSayi);
    }
}
