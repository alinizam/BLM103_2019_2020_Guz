/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders07.Ornek3;

/**
 *
 * @author alinizam
 */
public class MatematikTest {
    public static void main(String[] args) {
        Matematik m=new Matematik();
        int sonuc=m.topla(3, 5);
        System.out.println(sonuc);
        
        System.out.println(m.topla(1,3));
        
        int x=6;
        x=x+m.topla(1,3);
        System.out.println(x); 
        
    }
}
