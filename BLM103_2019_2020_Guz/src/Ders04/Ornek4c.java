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
public class Ornek4c {
     public static void main(String[] args) {
        int not=180;
        char harfNot=' ';
        if (not<0 || not>100){
            harfNot='H';
        }else if (not>=70){
            harfNot='A';
        }else if (not>=50 ){
            harfNot='C';
        }else if (not>=0){
            harfNot='F';
        }
        System.out.println("Harf Notu  = " +harfNot);
        
    }
}
