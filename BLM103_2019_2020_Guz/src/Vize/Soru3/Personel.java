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
public class Personel {

    String adi, soyadi, unvan;
    int maas;

    double zamYap(Personel p, int zamOrani) {
        double zamTutar=0;
        if (p.unvan == "Memur") {
            zamTutar=(p.maas) * (( zamOrani + 10) / 100.0);
            p.maas +=zamTutar;
        } else if (p.unvan == "İşçi") {
            zamTutar=(p.maas) * (( zamOrani + 20) / 100.0);
            p.maas +=zamTutar;
        }
        return zamTutar;
    }
}
