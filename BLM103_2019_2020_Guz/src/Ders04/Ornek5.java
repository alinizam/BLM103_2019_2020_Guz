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
public class Ornek5 {
    //Kişinin yaşı 0 ile 200 arasındayda normal değilse hatalı yazsın.
    public static void main(String[] args) {
        int yas=500;
        if (yas>=0 && yas<=200){
            System.out.println("Normal");
        }else{
            System.out.println("Hatalı");
        }
    }
    
}
