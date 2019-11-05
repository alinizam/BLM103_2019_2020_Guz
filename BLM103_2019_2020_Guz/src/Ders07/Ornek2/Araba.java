/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders07.Ornek2;

/**
 *
 * @author alinizam
 */
public class Araba {

    int anlikHiz;
    int sonHiz;
    
    void hizlan() {
        if ((anlikHiz + 1) < sonHiz) {
            anlikHiz++;
            System.out.println("Hiz :"+anlikHiz);
        }else{
            System.out.println("Son hıza geldi.");
        }
    }
    void hizlanArtisDegerineGore(int artis){
        anlikHiz=anlikHiz+artis;
    }
    int hiziOku(){
        return anlikHiz;
    }
}
