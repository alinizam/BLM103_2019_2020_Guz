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
public class Ornek4 {
    public static void main(String[] args) {
        int sayi=77771155;
        int temp=sayi;
        int rakam;
        int arananRakam=5;
        boolean bolununenRakamVarMi=false;
        while(temp>0){
            rakam=temp%10;
            temp/=10;
            if(rakam%arananRakam==0){
                bolununenRakamVarMi=true;
                break;
            } 
        }
        System.out.println(arananRakam+" sayısına bölünen rakam var mı= "+bolununenRakamVarMi);
    }
}
