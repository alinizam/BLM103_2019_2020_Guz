/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vize.Soru3;

/**
 *
 * @author alinizam
 */
public class Test {
    public static void main(String[] args) {
        Personel p=new Personel();
        p.maas=5000;
        p.unvan="Memur";
        System.out.println(p.zamYap(p, 10));
        System.out.println(p.maas);
    }
}
