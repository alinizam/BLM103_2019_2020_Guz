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
public class Ornek51 {
    // Bir sayının rakamları sağdan sola sürekli artıyor mu ? bulunuz.
    public static void main(String[] args) {
        int sayi=953821;
        int temp=sayi;
        int rakkam=1,oncekiRakkam=0;
        boolean artiyorMu=true;
        while(temp>0 && artiyorMu){
            rakkam=(temp%10);
            temp/=10; 
            artiyorMu=(oncekiRakkam<rakkam);
            oncekiRakkam=rakkam;
        }
        System.out.println("Artıyor mu =" +artiyorMu);
    }
}
