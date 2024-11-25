/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.echipamentdebucatarie
/**
 *
 * @author Gigabyte
 */
//clasa parinte
abstract class EchipamentdeBucatarie {
    private String marca;
    private String model;
    private double pret;
    private int garantie; 
    private String categorie; 
    
    //constructor fără argumente
    public EchipamentdeBucatarie() {
        this.marca = "";
        this.model = "";
        this.pret = 0.0;
        this.garantie = 0;
        this.categorie = "";
    }

    //constructor cu toți parametrii
    public EchipamentdeBucatarie(String marca, String model, double pret, int garantie, String categorie) {
        this.marca = marca;
        this.model = model;
        this.pret = pret;
        this.garantie = garantie;
        this.categorie = categorie;
    }

    // Constructor de copiere
    public EchipamentdeBucatarie(EchipamentdeBucatarie other) {
        this.marca = other.marca;
        this.model = other.model;
        this.pret = other.pret;
        this.garantie = other.garantie;
        this.categorie = other.categorie;
    }

    //metode abstracte
    public abstract String descriereEchipament();
    public abstract double calculeazaReducere(double procent);

    //Getters și Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    public int getGarantie() {
        return garantie;
    }

    public void setGarantie(int garantie) {
        this.garantie = garantie;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    //metoda toString
    @Override
    public String toString() {
        return "EchipamentDeBucatarie{" +"marca='" + marca + '\'' +", model='" + model + '\'' +", pret=" + pret +", garantie="
+ garantie +", categorie='" + categorie + '\'' +'}';
    }
}




