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
public class Ornek3 {
    public static void main(String[] args) {
        int sayi=77771155;
        int temp=sayi;
        int rakam;
        boolean uceBolununenRakamVarMi=false;
        while(temp>0){
            rakam=temp%10;
            temp/=10;
            if(rakam%3==0){
                uceBolununenRakamVarMi=true;
                break;
            } 
        }
        System.out.println("Üçe bölünen rakam var mı= "+uceBolununenRakamVarMi);
    }
}
