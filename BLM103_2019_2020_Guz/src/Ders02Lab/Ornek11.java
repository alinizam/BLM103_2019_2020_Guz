/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders02Lab;

/**
 *
 * @author alinizam
 */
public class Ornek11 {

    public static void main(String[] args) {
        // iki sayının hangisinin küsüratının büyük olduğunu bulunuz.
        double num1 = 56.45;
        double num2 = 24.367475;

        double kusurat1 = num1 - (int) num1;
        double kusurat2 = num2 - (int) num2;

        System.out.println("kusurat1 > kusurat2 : " + (kusurat1 > kusurat2));
    }
}
