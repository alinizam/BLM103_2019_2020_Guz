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
public class Ornek12 {
        /*
        1
        1 2 
        1 2 3
        1 2 3 4
        1 2 3 4 5
        */
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 1; j <= i+1; j++) {
                System.out.print(j+" ");
            }
            System.out.println("");
        }
        
            
    }
}
