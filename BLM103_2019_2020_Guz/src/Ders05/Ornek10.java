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
public class Ornek10 {
       /* Bir defada tek yıldız hakkı
        *
        **
        ***
        ****
        *****
        */ 
      public static void main(String[] args) {
          int n=5;
          for (int i = 0; i < n; i++) {
              for (int j = 0; j <= i; j++) {
                  System.out.print("*"); 
              }
              System.out.println("");
          }
    }
 
}
