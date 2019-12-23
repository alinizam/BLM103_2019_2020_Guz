/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders14.Ornek5;

/**
 *
 * @author alinizam
 */
public class Test {
    public static void main(String[] args) {
        Hasta h=new Hasta();
        h.adi="Ahmet";
        IKisi i=h;
        Hastane hastane=Hastane.yeniHastaneOlustur("FSM");
        hastane.hastalar.add(new Doktor());  
        hastane.hastalar.add(i);
        int hastaSayi=hastane.getHastaSayi();
        hastane.taburcuEt(h);
        hastane.taburcuEt(new Doktor());

    }
}
