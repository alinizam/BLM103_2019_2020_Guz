/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders12.Ornek1;

/**
 *
 * @author alinizam
 */
public class Mercedes extends Araba {
    int sonHiz=250;
    Mercedes(int sonHiz){
        super(sonHiz);
        System.out.println("Mercedes'in yapısıcısı çağrıldı");
        System.out.println(super.sonHiz);
        System.out.println(this.sonHiz);
    }

    public Mercedes() {
        System.out.println("Mercedes'in varsayılan yapısıcısı çağrıldı.");
    }
    
}
