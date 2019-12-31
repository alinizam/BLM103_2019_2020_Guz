/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders15.Ornek1;

/**
 *
 * @author alinizam
 */
public class DisSinif {

    public DisSinif() {
        
        System.out.println("Dis sinif örneği");
    }
    
    static String sinifAdi="DisSinif";
    String adi, soyadi;
    class IcSinif{ 
        void yazdir(){
            System.out.println(adi+" "+soyadi);
        }
    }
    
    IcSinif getIcSinif(){
        return new IcSinif();
    }
    static class StatikGomulu{

        public StatikGomulu() {
            System.out.println("Bir statik gömülü sınıf örneği");
        }
        
        void yazdir(){
            System.out.println("Statik bir şeyler: "+sinifAdi);
            //Hatalı kod
            //System.out.println(adi+" "+soyadi);
        }
    }
    
    void ustYazdir(){
        //yerel sinir
        class yerelYazdirmaIslem{
            void yaz(){
                System.out.println("Birşeyler");
            }
        }
        //Anonim
        Object o=new Object(){
            @Override
            public String toString() {
               return "Bir isim ver bana";
            }
            
        };
    }
    
}
