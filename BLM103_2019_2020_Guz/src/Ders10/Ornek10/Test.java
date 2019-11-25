/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders10.Ornek10;

/**
 *
 * @author alinizam
 */
public class Test {
    public static void main(String[] args) {
        /*Araba a=new Araba();
        a.marka="Honda";
        a.model="Civic";
        a.fiyat=100000;*/
        Araba a=new Araba("Honda","Civic",100000);
        System.out.println(a.fiyat);
    
        Araba[] arabalar = new Araba[3];
       
        arabalar[0]=new Araba("Honda","Civic",100000);
        arabalar[1]=new Araba("Merc","Civic",100000);
        
        Personel p=new Personel(10000);
        
        Personel p1=new Personel();
        System.out.println(p1.maas);    
        
        
        Personel p3=new Personel(null);
    }
}
