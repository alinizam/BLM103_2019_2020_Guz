/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders12.Ornek3;

/**
 *
 * @author alinizam
 */
public class Test {
    public static void main(String[] args) {
        YeniFabrika f=new YeniFabrika();
        f.personeller[0]=new Personel();
        f.personeller[1]=new Isci();
        f.personeller[2]=new Isci();
        f.personeller[3]=new Memur();
        
        System.out.println(f.getToplamMaas());
        
    }
 
}
