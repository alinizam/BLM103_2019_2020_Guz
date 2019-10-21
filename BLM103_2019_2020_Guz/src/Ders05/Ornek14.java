/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders05;

/**
 *
 * @author alinizam
 */
public class Ornek14 {
    /*
    
    A	1				
    1	B  2			
    1	2  C  3		
    1	2  3  D  4	
    1	2  3  4  E  5

    */
    public static void main(String[] args) {
        char karakter='A';
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                if (i==j){
                    System.out.print((char)(karakter + i) +" ");
                }
                System.out.print((j+1)+" ");
            }
            System.out.println();
        }
   
    }
    
    
}
