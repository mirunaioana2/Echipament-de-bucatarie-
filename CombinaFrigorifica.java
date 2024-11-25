/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.echipamentdebucatarie;

/**
 *
 * @author Asus
 */

   /* public class CombinaFrigorifica extends EchipamentdeBucatarie {
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
*/
/*public abstract class CombinaFrigorifica extends EchipamentdeBucatarie {
    int numarUsi; // Numarul de usi
    boolean areDispenserApa; // Daca are dispenser de apa
    String sistemRacire; // Tipul de sistem de racire (ex: No Frost, clasic)
    double nivelZgomot; // Nivelul de zgomot (în decibeli)
    String culoare; // Culoarea combinei frigorifice
    double pret; // Pretul combinei frigorifice

    // Constructor fara argumente
    public CombinaFrigorifica() {
        super(); // Apelam constructorul implicit al clasei parinte
        this.numarUsi = 2;
        this.areDispenserApa = false;
        this.sistemRacire = "No Frost";
        this.nivelZgomot = 40.0; // Nivelul de zgomot implicit
        this.culoare = "Alb"; // Culoare implicita
        this.pret = 2000.0; // Pret implicit
    }

    // Constructor cu toate argumentele
    public CombinaFrigorifica(String marca, String model,int garantie, String tipControl, int numarUsi, 
                              boolean areDispenserApa, String sistemRacire, double nivelZgomot, String culoare, double pret) {
        super(marca, model,pret, garantie, tipControl); // Apelam constructorul clasei parinte
        this.numarUsi = numarUsi;
        this.areDispenserApa = areDispenserApa;
        this.sistemRacire = sistemRacire;
        this.nivelZgomot = nivelZgomot;
        this.culoare = culoare;
        this.pret = pret;
    }

    // Constructor de copiere
    public CombinaFrigorifica(CombinaFrigorifica altaCombina) {
        super(altaCombina); // Apelăm constructorul de copiere al clasei părinte
        this.numarUsi = altaCombina.numarUsi;
        this.areDispenserApa = altaCombina.areDispenserApa;
        this.sistemRacire = altaCombina.sistemRacire;
        this.nivelZgomot = altaCombina.nivelZgomot;
        this.culoare = altaCombina.culoare;
        this.pret = altaCombina.pret;
    }

    // Metoda toString rescrisa pentru CombinaFrigorifica
    @Override
    public String toString() {
        return "Combina Frigorifica [Marca: " + marca + ", Model: " + model + 
               "Garantie: " + garantie +"Tip Control"+tipControl+ " kWh, Numar usi: " + numarUsi + 
               ", Are dispenser apa: " + (areDispenserApa ? "Da" : "Nu") + 
               ", Sistem racire: " + sistemRacire + ", Nivel zgomot: " + nivelZgomot + " dB" +
               ", Culoare: " + culoare + ", Pret: " + pret + " RON]";
    }
}
*/

/*public class CombinaFrigorifica extends EchipamentdeBucatarie implements EchipamentInterface {
    int numarUsi;
    boolean areDispenserApa;
    String sistemRacire;
    double nivelZgomot;
    String culoare;
    double pret;

    public CombinaFrigorifica() {
        super();
        this.numarUsi = 2;
        this.areDispenserApa = false;
        this.sistemRacire = "No Frost";
        this.nivelZgomot = 40.0;
        this.culoare = "Alb";
        this.pret = 2000.0;
    }

    public CombinaFrigorifica(String marca, String model, double capacitate, double consumEnergie, int numarUsi,
                              boolean areDispenserApa, String sistemRacire, double nivelZgomot, String culoare, double pret) {
        super(marca, model, capacitate, consumEnergie);
        this.numarUsi = numarUsi;
        this.areDispenserApa = areDispenserApa;
        this.sistemRacire = sistemRacire;
        this.nivelZgomot = nivelZgomot;
        this.culoare = culoare;
        this.pret = pret;
    }

    @Override
    public void displayDetails() {
        System.out.println("Combina Frigorifica - Marca: " + marca + ", Model: " + model + ", Capacitate: " + capacitate + 
                           "L, Consum energie: " + consumEnergie + " kWh, Numar usi: " + numarUsi +
                           ", Are dispenser apa: " + (areDispenserApa ? "Da" : "Nu") + 
                           ", Sistem racire: " + sistemRacire + ", Nivel zgomot: " + nivelZgomot + " dB" +
                           ", Culoare: " + culoare + ", Pret: " + pret + " RON");
    }

    @Override
    public double calculeazaPret() {
        // Exemplu simplu: pretul poate depinde de consumul de energie
        return pret + (consumEnergie * 10); // Adăugăm 10 lei pentru fiecare kWh de consum
    }
}
*/
public abstract class CombinaFrigorifica extends EchipamentdeBucatarie {
    private int numarUsi; // Numarul de usi
    private boolean areDispenserApa; // Daca are dispenser de apa
    private String sistemRacire; // Tipul de sistem de racire (ex: No Frost, clasic)
    private double nivelZgomot; // Nivelul de zgomot (în decibeli)
    private String culoare; // Culoarea combinei frigorifice
     // Pretul combinei frigorifice

    // Constructor fara argumente
    public CombinaFrigorifica() {
        super(); // Apelam constructorul implicit al clasei parinte
        this.numarUsi = 2;
        this.areDispenserApa = false;
        this.sistemRacire = "No Frost";
        this.nivelZgomot = 40.0; // Nivelul de zgomot implicit
        this.culoare = "Alb"; // Culoare implicita
        
    }

    // Constructor cu toate argumentele
    public CombinaFrigorifica(String marca, String model,int garantie, String tipControl, int numarUsi, 
                              boolean areDispenserApa, String sistemRacire, double nivelZgomot, String culoare, double pret) {
        super(marca, model,pret,garantie, tipControl); // Apelam constructorul clasei parinte
        this.numarUsi = numarUsi;
        this.areDispenserApa = areDispenserApa;
        this.sistemRacire = sistemRacire;
        this.nivelZgomot = nivelZgomot;
        this.culoare = culoare;
        
    }

    // Constructor de copiere
    public CombinaFrigorifica(CombinaFrigorifica altaCombina) {
        super(altaCombina); // Apelăm constructorul de copiere al clasei părinte
        this.numarUsi = altaCombina.numarUsi;
        this.areDispenserApa = altaCombina.areDispenserApa;
        this.sistemRacire = altaCombina.sistemRacire;
        this.nivelZgomot = altaCombina.nivelZgomot;
        this.culoare = altaCombina.culoare;
        
    }

    // Metoda toString rescrisa pentru CombinaFrigorifica
    @Override
    public String toString() {
        return "Combina Frigorifica [Marca: " + getMarca() + ", Model: " + getModel() +
               ",Garantie: " + getgarantie() +",Tip Control:"+gettipControl()+ " kWh, Numar usi: " + numarUsi + 
               ", Are dispenser apa: " + (areDispenserApa ? "Da" : "Nu") + 
               ", Sistem racire: " + sistemRacire + ", Nivel zgomot: " + nivelZgomot + " dB" +
               ", Culoare: " + culoare + ", Pret: " + getpret() + " RON]";
    }

    // Metode getter și setter pentru atribute private
    public int getNumarUsi() {
        return numarUsi;
    }

    public void setNumarUsi(int numarUsi) {
        this.numarUsi = numarUsi;
    }

    public boolean isAreDispenserApa() {
        return areDispenserApa;
    }
    public void setAreDispenserApa(boolean areDispenserApa) {
        this.areDispenserApa = areDispenserApa;
    }

    public String getSistemRacire() {
        return sistemRacire;
    }

    public void setSistemRacire(String sistemRacire) {
        this.sistemRacire = sistemRacire;
    }

    public double getNivelZgomot() {
        return nivelZgomot;
    }

    public void setNivelZgomot(double nivelZgomot) {
        this.nivelZgomot = nivelZgomot;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }
    
    private String getpret() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private String getgarantie() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private String gettipControl() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String tipEchipament() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double calculeazaCostTotal(double costLivrare) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
