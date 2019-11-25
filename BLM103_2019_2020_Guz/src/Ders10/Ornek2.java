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
public class Ornek2 {
    public static void main(String[] args) {
        ArrayList iller=new ArrayList();
        iller.add("Ankara");
        iller.add("İstanbul");
        iller.add("İzmir");
        System.out.println(iller);
        iller.add(0,"Adana");
        iller.add(0,"Ak");
        System.out.println(iller);
        
        System.out.println(iller.get(1));
        
        System.out.println(iller.indexOf("Çankırı"));
        
    }
}
