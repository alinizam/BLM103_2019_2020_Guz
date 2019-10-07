/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders03;

/**
 *
 * @author alinizam
 */
public class Ornek4 {
    public static void main(String[] args) {
        int x=5,y=10;
        x+=y;  //x=x+y;
        System.out.println(x);
        double d=10.5;
        x+=d;  //x=x+d;  tamamen aynı değil, otommatik tür dönüşümü
        System.out.println(x);  
        byte b=1;
        b+=250;
        System.out.println(b);
        
    }
}
