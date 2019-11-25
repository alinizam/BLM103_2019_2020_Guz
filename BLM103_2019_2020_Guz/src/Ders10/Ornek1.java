/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders10;

/**
 *
 * @author alinizam
 */
public class Ornek1 {
    public static void main(String[] args) {
        int sayiDizisi[]={1,8,11};
        System.out.println("Toplam = "+toplamAl(sayiDizisi));
        System.out.println("Değişken argüman ------------------");
        System.out.println("Toplam = " + toplamAlDegiskenArguman(1,2,3));
        System.out.println("Toplam = " + toplamAlDegiskenArguman(1,2));
        System.out.println("Toplam = " + toplamAlDegiskenArguman(sayiDizisi));
        toplamAlYazdir("Dizinin Toplamı =",1,5,4);
    }
    static int toplamAl(int[] sayilar){
        int toplam=0;
        for (int sayi : sayilar) {
            toplam+=sayi;
        }
        return toplam;
    }
    static int toplamAlDegiskenArguman(int... sayilar){
        int toplam=0;
        for (int sayi : sayilar) {
            toplam+=sayi;
        }
        return toplam;
    }
    static int toplamAlYazdir(String ek, int... sayilar){
        int toplam=0;
        for (int sayi : sayilar) {
            toplam+=sayi;
        }
        System.out.println(ek +toplam);
        return toplam;
    }
}
