/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders04Lab;

/**
 *
 * @author alinizam
 */
public class Ornek6 {
    public static void main(String[] args) {
        int sayi1=15, sayi2=20;
        int bolen=1;
        int enBuyukOrtakBolen=1;
        while(bolen<=sayi1 && bolen<=sayi2){
            if (sayi1%bolen==0 && sayi2%bolen==0){
                enBuyukOrtakBolen=bolen;
            }
            bolen++;
        } 
        System.out.println(enBuyukOrtakBolen);
    }
}
