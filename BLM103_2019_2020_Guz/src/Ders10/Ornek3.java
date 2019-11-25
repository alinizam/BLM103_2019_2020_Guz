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
public class Ornek3 {
    public static void main(String[] args) {
        ArrayList nesneler=new ArrayList();
        nesneler.add("İzmir");
        nesneler.add(15);
        Personel p=new Personel();
        Object o=new Object();
        nesneler.add(o);
        nesneler.add(p);
        for (Object object : nesneler) {
            System.out.println(object);
        }
    }
}
