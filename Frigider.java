/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.echipamentdebucatarie;

/**
 *
 * @author Asus
 */

  public class Frigider extends EchipamentdeBucatarie {
    boolean areNoFrost; // Tehnologia NoFrost

    // Constructor fara argumente
    public Frigider() {
        super(); // Apelam constructorul implicit al clasei parinte
        this.areNoFrost = false;
    }

    // Constructor cu toate argumentele
    public Frigider(String marca, String model, double capacitate, double consumEnergie, boolean areNoFrost) {
        super(marca, model, capacitate, consumEnergie); // Apelăm constructorul clasei părinte
        this.areNoFrost = areNoFrost;
    }

    // Constructor de copiere
    public Frigider(Frigider altFrigider) {
        super(altFrigider); // Apelăm constructorul de copiere al clasei părinte
        this.areNoFrost = altFrigider.areNoFrost;
    }

    // Metoda toString rescrisa pentru Frigider
    @Override
    public String toString() {
        return "Frigider [Marca: " + marca + ", Model: " + model + ", Capacitate: " + capacitate + 
               "L, Consum energie: " + consumEnergie + " kWh, Are NoFrost: " + (areNoFrost ? "Da" : "Nu") + "]";
    }
}
