/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders12Lab;

/**
 *
 * @author alinizam
 */
public class Isci extends Personel{
    int fazlaMesai;

    public Isci(String adi,int maas,int fazlaMesai) {
        this.adi=adi;
        this.maas = maas;
        this.fazlaMesai = fazlaMesai;
    }
    Isci(){
    }
    Isci(Birim birim){
        this.birim=birim;
    }
}
