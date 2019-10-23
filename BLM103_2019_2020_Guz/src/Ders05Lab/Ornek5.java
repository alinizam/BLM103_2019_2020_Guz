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
public class Ornek5 {
    // Bir sayının rakamları sağdan sola sürekli artıyor mu ? bulunuz.
    public static void main(String[] args) {
        int sayi=9535;
        int temp=sayi;
        int rakam,oncekiRakam=0;
        boolean artiyorMu=true;
        while(temp>0){
            rakam=(temp%10);
            temp/=10;
            if (oncekiRakam>rakam){
                artiyorMu=false;
                break;
            }
            oncekiRakam=rakam;
        }
        System.out.println("Artıyor mu =" +artiyorMu);
    }
}
