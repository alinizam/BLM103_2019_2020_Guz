/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders15.Ornek3;

/**
 *
 * @author alinizam
 */
public class Dis {
    static String isim="Dış isim";
    String firma="Dış firma";
    class Ic{
        String isim="İç isim";  
        String firma="İç firma";
        void yaz(){
            System.out.println(isim);
            System.out.println(Dis.isim);
            System.out.println(firma);
            System.out.println(Dis.this.firma);
            
        }
    }
    void disYaz(){
        Ic i=new Ic();
        i.yaz();
    }
}
