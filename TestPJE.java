/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.echipamentdebucatarie;


/**
 *
 * @author Gigabyte
 */
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        // Testare Expressor
        Expressor expressor1 = new Expressor();
        Expressor expressor2 = new Expressor("Philips", "EP3246/70", 1500.0, 24, "Automat",
                1.8, 1450, true, "Cafea boabe", "Negru");
        Expressor expressor3 = new Expressor(expressor2);

        System.out.println("Expressor 1: " + expressor1);
        System.out.println("Expressor 2: " + expressor2);
        System.out.println("Expressor 3 (copiat): " + expressor3);
        System.out.println();

        // Testare Cafetiera
        Cafetiera cafetiera1 = new Cafetiera();
        Cafetiera cafetiera2 = new Cafetiera("Bosch", "TKA6A041", 300.0, 12, "Manual",
                1.2, "Plastic", true, 6, "Permanent");
        Cafetiera cafetiera3 = new Cafetiera(cafetiera2);

        System.out.println("\nCafetiera 1: " + cafetiera1);
        System.out.println("Cafetiera 2: " + cafetiera2);
        System.out.println("Cafetiera 3 (copiată): " + cafetiera3);
        System.out.println();

        // Vector pentru Expressor
        ArrayList<Object> expressors = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            expressors.add(new Expressor("Expressor" + i, "ModelX" + i, 500.0 + i * 50, 24,
                    "Automat", 1.2 + i * 0.1, 1500 + i * 100, true, "Cafea boabe", "Alb"));
        }

        // Vector pentru Cafetiera
        ArrayList<Object> cafetiere = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            cafetiere.add(new Cafetiera("Cafetiera" + i, "ModelC" + i, 200.0 + i * 20, 18,
                    "Manual", 1.0 + i * 0.2, "Plastic", false, 10, "Filtru permanent"));

        if(i % 2 == 0)
            System.out.println("ModelC este par:" + cafetiere.get(i));
        }

        // Afisare exemple
        System.out.println("\nExpressors:");
        expressors.forEach(System.out::println);

        System.out.println("\nCafetiere:");
        cafetiere.forEach(System.out::println);

        // Afisare obiecte conform unor conditii
        System.out.println("\nExpressors cu putere > 1500 si capacitate rezervor > 1.5:");
        expressors.stream()
                .filter(obj -> obj instanceof Expressor)
                .map(obj -> (Expressor) obj)
                .filter(ex -> ex.getPutere() > 1500 && ex.getCapacitateRezervor() > 1.5)
                .forEach(System.out::println);

        System.out.println("\nCafetiere care au functia de a pastra cald si capacitate ceainic > 1.2:");
        cafetiere.stream()
                .filter(obj -> obj instanceof Cafetiera)
                .map(obj -> (Cafetiera) obj)
                .filter(ca -> ca.isFunctiePastreazaCald() && ca.getCapacitateCeainic() > 1.2)
                .forEach(System.out::println);
    }
}
