/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders15.Ornek1;

import Ders15.Ornek1.DisSinif;

/**
 *
 * @author alinizam
 */
public class IcSinifTest {
    public static void main(String[] args) {
        //1
        DisSinif dis=new DisSinif();
        dis.adi="Ahmet";
        dis.soyadi="Ak";
        DisSinif.IcSinif ic=dis.new IcSinif();
        ic.yazdir();
        //2-Tek satırda iç sınıf oluşturma
        DisSinif.IcSinif ic1=new DisSinif().new IcSinif();
        //3-
        DisSinif.IcSinif ic2=dis.getIcSinif();
        
        
    }
}
