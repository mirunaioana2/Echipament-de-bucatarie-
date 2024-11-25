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
    private double capacitateRezervor; // Capacitatea rezervorului de apă
    private int putere; // Puterea în wați
    private boolean rasnitaIncorporata; // Dacă are râșniță încorporată
    private String tipCafea; // Tipul de cafea suportat (boabe, măcinată etc.)
    private String culoare; // Culoarea expressorului

    // Constructor fără argumente
    public Expressor() {
        super();
        this.capacitateRezervor = 0.0;
        this.putere = 0;
        this.rasnitaIncorporata = false;
        this.tipCafea = "";
        this.culoare = "";
    }

    // Constructor cu toți parametrii
    public Expressor(String marca, String model, double pret, int garantie, String categorie, 
                     double capacitateRezervor, int putere, boolean rasnitaIncorporata, String tipCafea, String culoare) {
        super(marca, model, pret, garantie, categorie);
        this.capacitateRezervor = capacitateRezervor;
        this.putere = putere;
        this.rasnitaIncorporata = rasnitaIncorporata;
        this.tipCafea = tipCafea;
        this.culoare = culoare;
    }

    // Constructor de copiere
    public Expressor(Expressor other) {
        super(other);
        this.capacitateRezervor = other.capacitateRezervor;
        this.putere = other.putere;
        this.rasnitaIncorporata = other.rasnitaIncorporata;
        this.tipCafea = other.tipCafea;
        this.culoare = other.culoare;
    }

    // Implementare metodă abstractă: descriereEchipament
    @Override
    public String descriereEchipament() {
        return "Expressor " + getMarca() + " model " + getModel() + ", putere de " + putere + " W, cu capacitate rezervor " + capacitateRezervor + " litri.";
    }

    // Implementare metodă abstractă: calculeazaReducere
    @Override
    public double calculeazaReducere(double procent) {
        return getPret() - (getPret() * procent / 100);
    }

    // Metodă toString
    @Override
    public String toString() {
        return super.toString() +
               ", Expressor{" +
               "capacitateRezervor=" + capacitateRezervor +
               ", putere=" + putere +
               ", rasnitaIncorporata=" + rasnitaIncorporata +
               ", tipCafea='" + tipCafea + '\'' +
               ", culoare='" + culoare + '\'' +
               '}';
    }

    // Getters și Setters
    public double getCapacitateRezervor() {
        return capacitateRezervor;
    }

    public void setCapacitateRezervor(double capacitateRezervor) {
        this.capacitateRezervor = capacitateRezervor;
    }

    public int getPutere() {
        return putere;
    }

    public void setPutere(int putere) {
        this.putere = putere;
    }

    public boolean isRasnitaIncorporata() {
        return rasnitaIncorporata;
    }

    public void setRasnitaIncorporata(boolean rasnitaIncorporata) {
        this.rasnitaIncorporata = rasnitaIncorporata;
    }

    public String getTipCafea() {
        return tipCafea;
    }

    public void setTipCafea(String tipCafea) {
        this.tipCafea = tipCafea;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }
}
