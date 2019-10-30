/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders06Lab;

/**
 *
 * @author alinizam
 */
public class Ornek01a {
    public static void main(String[] args) {
        int sayi=321328447;
        int enBuyukRakam=0;
        int rakam;
        int temp=sayi;
        while (temp>0){
            rakam=temp%10;
            temp/=10;
            if (rakam>enBuyukRakam){
                enBuyukRakam=rakam;
            }
        }
        System.out.println(sayi+"'sının en büyük rakamı = "+enBuyukRakam);
    }
}
