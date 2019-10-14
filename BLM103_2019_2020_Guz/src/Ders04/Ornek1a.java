/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders04;

/**
 *
 * @author alinizam
 */
public class Ornek1a {
    public static void main(String[] args) {
        //Bir sayısının 5' ve 5'ten küçük kaç tana böleni olduğunu bulunuz.
        int sayi=60;
        int bolen=1;
        
        System.out.println(((sayi%bolen==0)?1:0) 
                + ((sayi%(++bolen)==0)?1:0)  
                + ((sayi%(++bolen)==0)?1:0)
        + ((sayi%(++bolen)==0)?1:0)
        + ((sayi%(++bolen)==0)?1:0));
           
        
    }
}
