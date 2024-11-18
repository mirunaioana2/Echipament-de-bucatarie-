/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.echipamentdebucatarie;

/**
 *
 * @author Gigabyte
 */
public class Test {
    public static void main(String[] args) {
        // === Test EchipamentDeBucatarie ===
        EchipamentdeBucatarie echipament = new EchipamentdeBucatarie("Bosch", 500.0, 7.5);
        System.out.println("Echipament: " + echipament);

        // === Test Expressor ===
        Expressor expressor = new Expressor("DeLonghi", 799.99, 4.2, 1.5, 1350);
        System.out.println("Expressor: " + expressor);

        // === Test Cafetiera ===
        Cafetiera cafetiera = new Cafetiera("Philips", 299.99, 3.5, 10, true);
        System.out.println("Cafetiera: " + cafetiera);
    }
}
