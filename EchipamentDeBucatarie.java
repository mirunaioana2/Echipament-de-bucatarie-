/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.echipamentdebucatarie;

/**
 *
 * @author Asus
 */

public class EchipamentdeBucatarie {
    String marca;
    String model;
    double capacitate; // Capacitatea în litri
    double consumEnergie; // Consumul de energie (kWh)

    // Constructor fara argumente
    public EchipamentdeBucatarie() {
        marca = "Necunoscut";
        model = "Necunoscut";
        capacitate = 0.0;
        consumEnergie = 0.0;
    }

    // Constructor cu toate argumentele
    public EchipamentdeBucatarie(String marca, String model, double capacitate, double consumEnergie) {
        this.marca = marca;
        this.model = model;
        this.capacitate = capacitate;
        this.consumEnergie = consumEnergie;
    }

    // Constructor de copiere

    public EchipamentdeBucatarie(EchipamentdeBucatarie echipament) {
        this.marca = echipament.marca;
        this.model = echipament.model;
        this.capacitate = echipament.capacitate;
        this.consumEnergie = echipament.consumEnergie;
    }

    // Metoda toString rescrisa pentru clasa EchipamentdeBucatarie
    
    @Override
    public String toString() {
        return "Echipament de bucatarie [Marca: " + marca + ", Model: " + model + 
               ", Capacitate: " + capacitate + "L, Consum energie: " + consumEnergie + " kWh]";
    }
} 
    
        

       
