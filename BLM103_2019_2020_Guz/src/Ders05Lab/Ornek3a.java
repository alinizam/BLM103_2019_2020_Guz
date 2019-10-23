/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders05Lab;

/**
 *
 * @author alinizam
 */
public class Ornek3a {
    /*10uk sistemden ikilik sisteme çevirme*/
    public static void main(String[] args) {
        int sayi=25;
        int temp=sayi;
        int kalan;
        int sonuc=0;
        int basamak=1;
        while(temp>0){
            kalan=temp%2;
            temp=temp/2;
            //System.out.print(kalan);
            sonuc=sonuc+kalan*basamak;
            basamak=basamak*10;
        }
        System.out.println(sonuc);
    }

}
