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
public class Idari extends Personel {

    String unvan;
    int seviye;

    @Override
    void setMaas(Maas maas) {
        maas.netMaas += maas.netMaas * seviye;
        maas.prim += maas.prim * seviye;
        
        this.maas = maas;
    }

}
