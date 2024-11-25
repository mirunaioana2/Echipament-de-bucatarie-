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
    private double capacitateCeainic; 
    private String material; 
    private boolean functiePastreazaCald; 
    private int timpPreparare; 
    private String tipFiltru; 

    // Constructor fara argumente
    public Cafetiera() {
        super();
        this.capacitateCeainic = 0.0;
        this.material = "";
        this.functiePastreazaCald = false;
        this.timpPreparare = 0;
        this.tipFiltru = "";
    }

    // Constructor cu tori parametrii
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

    // implementarea metodei abstracte
    @Override
    public String tipEchipament() {
        return "Cafetiera";
    }

    @Override
    public double calculeazaCostTotal(double costLivrare) {
        return getPret() + costLivrare;
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

