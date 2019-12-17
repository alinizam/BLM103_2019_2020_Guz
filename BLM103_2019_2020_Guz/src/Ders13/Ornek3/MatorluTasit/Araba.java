/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders13.Ornek3.MatorluTasit;

import Ders13.Ornek3.Personel.Memur;
import java.util.ArrayList;

/**
 *
 * @author alinizam
 */
public class Araba {
    Memur m;
    Mercedes mercedes;
    ArrayList a;
    private String model;
    protected String marka;
    public String renk;
    void birMetot(){
       model="Genel";
       Araba a=new Araba();
       a.model="Özel";
    }
}
