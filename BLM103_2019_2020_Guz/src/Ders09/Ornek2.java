/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders09;

/**
 *
 * @author alinizam
 */
public class Ornek2 {
    //Dizi eleman toplamlarını bulma
    public static void main(String[] args) {
        int sayilar[];
        sayilar=new int[5];
        sayilar[1]=10;
        sayilar[3]=15;
        int toplam=0;
        for (int i = 0; i < sayilar.length; i++) {
            toplam=toplam+sayilar[i];
        }
        System.out.println("Toplam = "+toplam);
    }
    
}
