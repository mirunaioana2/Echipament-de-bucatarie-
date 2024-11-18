/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.echipamentdebucatarie;

/**
 *
 * @author Asus
 */
public class Test {
    public static void main(String[] args) {
        // Crearea unui obiect EchipamentdeBucatarie
        EchipamentdeBucatarie echipament = new EchipamentdeBucatarie("Samsung", "X123", 300, 1.2);
        System.out.println(echipament); // Afișează informațiile despre echipament

        // Crearea unui obiect Frigider
        Frigider frigider = new Frigider("Bosch", "FreshX", 500, 1.5, true);
        System.out.println(frigider); // Afișează informațiile despre frigider

        // Crearea unui obiect CombinaFrigorifica
        CombinaFrigorifica combina = new CombinaFrigorifica("Whirlpool", "ComboX", 600, 1.8, 2, true);
        System.out.println(combina); // Afișează informațiile despre combina frigorifica
    }
}
