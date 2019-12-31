/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders15.Ornek4;

import com.sun.org.apache.xalan.internal.xsltc.runtime.BasisLibrary;

/**
 *
 * @author alinizam
 */
public class KaramasikIslem {
    final int a;

    public KaramasikIslem() {
        this.a = 10;
    }
    
    void islemYap(int a1,int b1,String islemTuru){
        int metotParameter=3;
        class YerelBasitIslem extends BasitIslem{
            public YerelBasitIslem() {
                a=a1;
                b=b1;
            }

            @Override
            void carp() {
                System.out.println(metotParameter);
            }
            
       }
        YerelBasitIslem yerelIslem=new YerelBasitIslem();
        yerelIslem.carp();
        yerelIslem.topla();
    }
     void anonimIslemYap(int a1,int b1,String islemTuru){
        
        BasitIslem anonimBasitIslem=new BasitIslem(){
            @Override
            void carp() {
                System.out.println(a1*b1);
            }
            
        };
        anonimBasitIslem.carp();
        anonimBasitIslem.topla();
    }
    
}
