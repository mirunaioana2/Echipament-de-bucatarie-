/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.echipamentdebucatarie;

/**
 *
 * @author Asus
 */

    public class CombinaFrigorifica extends EchipamentdeBucatarie {
    int numarUsi; // Numarul de usi
    boolean areDispenserApa; // Daca are dispenser de apa

    // Constructor fara argumente
    public CombinaFrigorifica() {
        super(); // Apelam constructorul implicit al clasei parinte
        this.numarUsi = 2;
        this.areDispenserApa = false;
    }

    // Constructor cu toate argumentele
    public CombinaFrigorifica(String marca, String model, double capacitate, double consumEnergie, int numarUsi, boolean areDispenserApa) {
        super(marca, model, capacitate, consumEnergie); // Apelam constructorul clasei parinte
        this.numarUsi = numarUsi;
        this.areDispenserApa = areDispenserApa;
    }

    // Constructor de copiere
    public CombinaFrigorifica(CombinaFrigorifica altaCombina) {
        super(altaCombina); // Apelăm constructorul de copiere al clasei părinte
        this.numarUsi = altaCombina.numarUsi;
        this.areDispenserApa = altaCombina.areDispenserApa;
    }

    // Metoda toString rescrisa pentru CombinaFrigorifica
    @Override
    public String toString() {
        return "Combina Frigorifica [Marca: " + marca + ", Model: " + model + ", Capacitate: " + capacitate + 
               "L, Consum energie: " + consumEnergie + " kWh, Numar usi: " + numarUsi + 
               ", Are dispenser apa: " + (areDispenserApa ? "Da" : "Nu") + "]";
    }
}


