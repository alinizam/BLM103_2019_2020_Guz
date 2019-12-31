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
public class HesapIslem {
    void hesapla(){
        IHesaplama i=new IHesaplama() {
            @Override
            public int topla(int a, int b) {
                return (a+b);
            }
        };
        System.out.println(i.topla(10, 15));
    }
    void hesapla1(){
        IHesaplama i=(a,b)->{return a+b;};
        System.out.println(i.topla(10, 15));
    }
    
    void hesapla2(){
        IHesaplama i=(a,b)->a+b;
        System.out.println(i.topla(10, 15));
    }
    
    void hesapla(IHesaplama islem){
        System.out.println(islem.topla(10, 15));
    }
    
}
