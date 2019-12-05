/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders11Lab;

/**
 *
 * @author alinizam
 */
public class Akademik extends Personel {

    String unvan;

    @Override
    void setMaas(Maas maas) {
        maas.netMaas *= 1.1;
        maas.prim *= 1.1;
        
        this.maas = maas;
    }

}
