/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders13.Ornek3.Personel;
import Ders13.Ornek3.MatorluTasit.*;
/**
 *
 * @author alinizam
 */
public class SoforluAraba extends Araba {
    void birMetot(){
        Araba a=new Araba();
        a.renk="Ak";
        super.marka="Yerli";
        SoforluAraba s=new SoforluAraba();
        s.marka="Yerli";
        this.marka="Yerli";
    }
}
