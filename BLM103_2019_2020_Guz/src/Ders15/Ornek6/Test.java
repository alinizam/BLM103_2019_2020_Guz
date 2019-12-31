/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders15.Ornek6;

/**
 *
 * @author alinizam
 */
public class Test {
    public static void main(String[] args) {
        HesapIslem h=new HesapIslem();
        h.hesapla();
        h.hesapla((a,b)->a+b);
        h.hesapla((a,b)->a*b);
        h.hesapla((a,b)->b-a);
        
    }
}
