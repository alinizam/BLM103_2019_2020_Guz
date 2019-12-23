/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders14.Ornek2;

/**
 *
 * @author alinizam
 */
public class Araba extends Tasit implements IHareketEdebililir,ISatilabilir{
    int hiz;
    public int getHiz(){
        return 132;
    }
    public void hizlan(int artis){
    }
    public void yavasla(int azalma){
    }

    @Override
    public int getFiyat() {
        return 150000;
    }
}
