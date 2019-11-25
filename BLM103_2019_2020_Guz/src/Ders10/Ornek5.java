/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders10;

import java.util.ArrayList;

/**
 *
 * @author alinizam
 */
public class Ornek5 {
    public static void main(String[] args) {
         Personel[] personeller=new Personel[3];
         ArrayList<Personel[]> sirket=new ArrayList();
         sirket.add(personeller);
         sirket.get(0)[0]=new Personel();
         Personel[] sirketPersonelleri=sirket.get(0);
         sirket.add(new Personel[]{new Personel(),new Personel()});
    }
}
