/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders14.Ornek4;

/**
 *
 * @author alinizam
 */
public abstract class Sekil implements IHareket{
    void getAdi(){
        System.out.println("GEnel Şekil");
    }
    abstract int getAlan();
}
