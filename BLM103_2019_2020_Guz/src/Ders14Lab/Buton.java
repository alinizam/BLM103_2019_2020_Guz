/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders14Lab;

/**
 *
 * @author alinizam
 */
public class Buton extends Bilesen implements IHareket{
    int x1,x2,y1,y2;
    @Override
    public void HareketEt(int konum) {
        x1+=konum+5;
        x2+=konum+5;
        y1+=konum+5;
        y2+=konum+5;
    }

    @Override
    public void SetXY(int x1, int x2, int y1, int y2) {
        this.x1=x1;
        this.x2=x2;
        this.y1=y1;
        this.y2=y2;
    }

   @Override
    public int getX1() {
        return x1;
    }

    @Override
    public int getX2() {
        return x2;
    }

     @Override
    public int getY1() {
        return y1;
    }

    @Override
    public int getY2() {
        return y2;
    }
    
    @Override
    public String getRenk() {
        return renk;
    }

    @Override
    public void setRenk(String renk) {
        this.renk=renk;
    }
    
}
