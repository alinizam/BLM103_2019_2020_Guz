/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders03Lab;

/**
 *
 * @author alinizam
 */
public class Ornek5 {

    /*
        A kişisi B kişine X TL borç para verdiğinde, 
        B kişisi de Y ve Z TL şeklinde iki defada geri ödeme yaptığında 
        A ve B kişisinin mevcut parasal varlığındaki değişim nasıl olur? 
        Borcun tamamıyla geri ödendiği nasıl kontrol edilebilir. 
        Gerekli değişkenleri tanımlayarak kodlayınız.
     */
    public static void main(String[] args) {
        int a = 500, b = 60, x = 10, y = 3, z = 7;

        a = a - x + (y + z);
        b = b + x - (y + z);

        System.out.println("a: " + a);
        System.out.println("b: " + b);

        System.out.println("Borc bitti mi ? : " + (x == (y + z)));
    }
}
