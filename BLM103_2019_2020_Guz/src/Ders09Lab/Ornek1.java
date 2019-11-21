/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders09Lab;

/**
 *
 * @author alinizam
 */
public class Ornek1 {

    public static void main(String[] args) {
        int[] sayilar = {1, 5, 3, 8, 3};
        int aranan = 3;
        boolean varMi = dizideAra(sayilar, aranan);
        System.out.println("Bulundu mu = " + varMi);
        int sonuc[] = dizidekiYerleriBul(sayilar, aranan);
        for (int i : sonuc) {
            System.out.print(i + " ");
        }
        //alternatif metot çağrısı
        for (int i : dizidekiYerleriBul(sayilar, aranan)) {
            System.out.print(i + " ");
        }
        System.out.println("------------------");
        
        
        
        
        
        int ikiboyutludizi[][] = {{1, 2, 3}, {2, 5, 7}};
        System.out.println(ikiBoyutluDizideAra(ikiboyutludizi, 2));
    }

    static boolean dizideAra(int[] sayilar, int aranan) {
        boolean varMi = false;
        for (int i = 0; i < sayilar.length; i++) {
            if (sayilar[i] == aranan) {
                varMi = true;
                break;
            }
        }
        return varMi;
    }

    static int[] dizidekiYerleriBul(int[] sayilar, int aranan) {
        int[] sonuc = new int[sayilar.length];
        
        for (int i = 0; i < sayilar.length; i++) {
            if (sayilar[i] == aranan) {
                sonuc[i] = 1;
            }
        }
        
        return sonuc;
    }

    static boolean ikiBoyutluDizideAra(int[][] sayilar, int aranan) {
        boolean varMi = false;
        ust:
        for (int i = 0; i < sayilar.length; i++) {
            for (int j = 0; j < sayilar[i].length; j++) {
                if (sayilar[i][j] == aranan) {
                    varMi = true;
                    break ust;
                }
            }
        }
        return varMi;
    }

    static int[][] dizidekiYerleriBul(int[][] sayilar, int aranan) {
        int[][] sonuc = new int[sayilar.length][sayilar[0].length];
        for (int i = 0; i < sayilar.length; i++) {
            for (int j = 0; j < sayilar[i].length; j++) {
                if (sayilar[i][j] == aranan) {
                    sonuc[i][j] = 1;
                }
            }

        }
        return sonuc;
    }
}
