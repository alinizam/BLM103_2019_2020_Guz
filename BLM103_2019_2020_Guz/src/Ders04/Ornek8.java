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
public class Ornek8 {

    //Verilen sayıya göre Haftanın günlerinin isimlerini yazdırınız.
    public static void main(String[] args) {
        int gunNo = 22;
        switch (gunNo) {
            case 1:
                System.out.println("Pazar");
                break;
            case 2:
                System.out.println("Pazartesi");
                break;
            case 3:
                System.out.println("Salı");
                break;
            case 4:
                System.out.println("Çarşamba");
                break;
            case 5:
                System.out.println("Perşembe");
                break;
            case 6:
                System.out.println("Cuma");
                break;
            case 7:
                System.out.println("Cumartesi");
                break;
            default:
                System.out.println("Hatalı");
                break;
                
        }

    }
}
