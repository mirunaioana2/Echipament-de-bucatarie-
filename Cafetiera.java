/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.echipamentdebucatarie;

/**
 *
 * @author Gigabyte
 */
public class Cafetiera extends EchipamentdeBucatarie {
    private double capacitateCeainic; // Capacitatea ceainicului
    private String material; // Materialul din care este făcută cafetiera
    private boolean functiePastreazaCald; // Dacă păstrează cafeaua caldă
    private int timpPreparare; // Timpul necesar pentru prepararea cafelei
    private String tipFiltru; // Tipul de filtru utilizat

    // Constructor fără argumente
    public Cafetiera() {
        super();
        this.capacitateCeainic = 0.0;
        this.material = "";
        this.functiePastreazaCald = false;
        this.timpPreparare = 0;
        this.tipFiltru = "";
    }

    // Constructor cu toți parametrii
    public Cafetiera(String marca, String model, double pret, int garantie, String categorie, 
 double capacitateCeainic, String material, boolean functiePastreazaCald, int timpPreparare, String tipFiltru) {
        super(marca, model, pret, garantie, categorie);
        this.capacitateCeainic = capacitateCeainic;
        this.material = material;
        this.functiePastreazaCald = functiePastreazaCald;
        this.timpPreparare = timpPreparare;
        this.tipFiltru = tipFiltru;
    }

    // Constructor de copiere
    public Cafetiera(Cafetiera other) {
        super(other);
        this.capacitateCeainic = other.capacitateCeainic;
        this.material = other.material;
        this.functiePastreazaCald = other.functiePastreazaCald;
        this.timpPreparare = other.timpPreparare;
        this.tipFiltru = other.tipFiltru;
    }

    // Implementare metodă abstractă: descriereEchipament
    @Override
    public String descriereEchipament() {
        return "Cafetiera " + getMarca() + " model " + getModel() + ", cu capacitate ceainic de " + capacitateCeainic + " litri, material " + material + ".";
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
               ", Cafetiera{" +
               "capacitateCeainic=" + capacitateCeainic +
               ", material='" + material + '\'' +
               ", functiePastreazaCald=" + functiePastreazaCald +
               ", timpPreparare=" + timpPreparare +
               ", tipFiltru='" + tipFiltru + '\'' +
               '}';
    }

    // Getters și Setters
    public double getCapacitateCeainic() {
        return capacitateCeainic;
    }

    public void setCapacitateCeainic(double capacitateCeainic) {
        this.capacitateCeainic = capacitateCeainic;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public boolean isFunctiePastreazaCald() {
        return functiePastreazaCald;
    }

    public void setFunctiePastreazaCald(boolean functiePastreazaCald) {
        this.functiePastreazaCald = functiePastreazaCald;
    }

    public int getTimpPreparare() {
        return timpPreparare;
    }

    public void setTimpPreparare(int timpPreparare) {
        this.timpPreparare = timpPreparare;
    }

    public String getTipFiltru() {
        return tipFiltru;
    }

    public void setTipFiltru(String tipFiltru) {
        this.tipFiltru = tipFiltru;
    }
}
