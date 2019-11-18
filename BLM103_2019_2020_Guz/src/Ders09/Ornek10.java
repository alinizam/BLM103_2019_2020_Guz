/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders09;

/**
 *
 * @author alinizam
 */
public class Ornek10 {
    public static void main(String[] args) {
         int matris[][]=new int[2][3];
        matris[0][0]=3;
        matris[0][1]=2;
        matris[0][2]=1;
        matris[1][0]=3;
        matris[1][1]=1;
        matris[1][2]=5;

        
        for (int i = 0; i < matris.length; i++) {
            int satirToplam=0;
            for (int j = 0; j < matris[i].length; j++) {
                satirToplam+=matris[i][j];
            }
            System.out.println(satirToplam);
        }
    }
}
