/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders13Lab.PersonelPaketi;

/**
 *
 * @author alinizam
 */
class MetotCagri {

    public MetotCagri(String metotAdi, int cagriAdet) {
        this.metotAdi = metotAdi;
        this.cagriAdet = cagriAdet;
    }
    
    static void Ekle(String metotAdi) {
        for (MetotCagri m:Personel.metotCagrilari){
            if (m.metotAdi.equals(metotAdi)){
                m.cagriAdet++;
                return;
            }
        }
        Personel.metotCagrilari.add(new MetotCagri(metotAdi,1));
        
    }
    String metotAdi;
    int cagriAdet;

    @Override
    public String toString() {
        return (metotAdi+" "+cagriAdet);
    }
    
    
}
