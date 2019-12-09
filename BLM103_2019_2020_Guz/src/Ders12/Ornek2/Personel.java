/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders12.Ornek2;

/**
 *
 * @author alinizam
 */
public class Personel extends Insan{
    String sicilNo;
    public String getAdi() {
        return super.getIsim();
    }
    /*Hatalı kod
    @Override
    String getIsim() {
        return adi; //To change body of generated methods, choose Tools | Templates.
    }*/

    @Override
    public String toString() {
        return sicilNo;
    }
    
    
}
