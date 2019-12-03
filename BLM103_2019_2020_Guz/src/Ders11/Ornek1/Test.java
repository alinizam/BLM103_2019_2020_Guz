/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders11.Ornek1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alinizam
 */
public class Test {
    public static void main(String[] args) {
        Personel[] personeller=new Personel[3];
        personeller[0]=new Personel("Ahmet","Ak");
        (new Personel("Ahmet","Ak")).maas=5000;
        dosyayaYaz();
        
    }
    static void dosyaOku(){
        try {
            FileReader f=new FileReader("c:\\dosyalar\\Sayilar.txt");
            System.out.println((char)f.read());
            System.out.println((char)f.read());
            System.out.println((char)f.read());
            f.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    static void dosyayaYaz(){
        try {
            FileWriter f=new FileWriter("c:\\dosyalar\\Sayilar.txt",true);
            f.write("Merhaba");
            f.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
