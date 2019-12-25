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
public interface IHareket {
    void HareketEt(int konum);            
    void SetXY(int x1,int x2,int y1,int y2);
    int getX1();
    int getX2();
    int getY1();
    int getY2();
}
