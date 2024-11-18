/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.echipamentdebucatarie;

/**
 *
 * @author Gigabyte
 */
public class Expressor extends EchipamentdeBucatarie {
    private double capacitateRezervor; 
    private int putere; 

//constructor implicit
    public Expressor() {
        super(); //apelează constructorul implicit al clasei părinte
        capacitateRezervor = 0.0;
        putere = 0;
    }

//constructor cu parametri
    public Expressor(String marca, double pret, double greutate, double capacitateRezervor, int putere) {
        super(marca, pret, greutate); // Apelează constructorul clasei părinte
        this.capacitateRezervor = capacitateRezervor;
        this.putere = putere;
    }

//metodă pentru afișare
    @Override
    public String toString() {
        return "Expressor: marca=" + marca + ", pret=" + pret +", greutate=" + greutate + ", capacitate=" + capacitateRezervor +" litri, putere=" + putere + "W";
    }
}
