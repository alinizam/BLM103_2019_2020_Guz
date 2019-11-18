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
public class Ornek3 {
    public static void main(String[] args) {
        int dizi1[]={5,8,9};
        int dizi2[];
        dizi2=new int[]{1,5,7};
        
        dizi1=dizi2;
        System.out.println(dizi2==dizi1); 
        System.out.println(dizi1[2]);
    }
}
