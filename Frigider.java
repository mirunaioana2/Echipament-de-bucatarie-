/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.echipamentdebucatarie;

/**
 *
 * @author Asus
 */

 /* public class Frigider extends EchipamentdeBucatarie {
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
*/
/*public class Frigider extends EchipamentdeBucatarie {
    boolean areNoFrost; // Tehnologia NoFrost
    double temperaturaMinima; // Temperatura minima de functionare (°C)
    double temperaturaMaxima; // Temperatura maxima de functionare (°C)
    String tipDeschidereUsa; // Tipul de deschidere a ușii (ex: dreapta, stanga)
    String materialUsa; // Materialul ușii (ex: inox, plastic)
    String culoare; // Culoarea frigiderului

    // Constructor fara argumente
    public Frigider() {
        super(); // Apelam constructorul implicit al clasei parinte
        this.areNoFrost = false;
        this.temperaturaMinima = -18.0; // Valoare implicită
        this.temperaturaMaxima = 8.0;  // Valoare implicită
        this.tipDeschidereUsa = "dreapta"; // Valoare implicită
        this.materialUsa = "plastic"; // Valoare implicită
        this.culoare = "alb"; // Valoare implicită
    }

    // Constructor cu toate argumentele
    public Frigider(String marca, String model, double pret, int garantie, String tipControl, boolean areNoFrost,
                     double temperaturaMinima, double temperaturaMaxima, String tipDeschidereUsa, String materialUsa, String culoare) {
        super(marca, model,pret,garantie, tipControl); // Apelăm constructorul clasei părinte
        this.areNoFrost = areNoFrost;
        this.temperaturaMinima = temperaturaMinima;
        this.temperaturaMaxima = temperaturaMaxima;
        this.tipDeschidereUsa = tipDeschidereUsa;
        this.materialUsa = materialUsa;
        this.culoare = culoare;
    }

    // Constructor de copiere
    public Frigider(Frigider altFrigider) {
        super(altFrigider); // Apelăm constructorul de copiere al clasei părinte
        this.areNoFrost = altFrigider.areNoFrost;
        this.temperaturaMinima = altFrigider.temperaturaMinima;
        this.temperaturaMaxima = altFrigider.temperaturaMaxima;
        this.tipDeschidereUsa = altFrigider.tipDeschidereUsa;
        this.materialUsa = altFrigider.materialUsa;
        this.culoare = altFrigider.culoare;
    }

    // Metoda toString rescrisa pentru Frigider
    @Override
    public String toString() {
        return "Frigider [Marca: " + marca + ", Model: " + model + ", Pret: " + pret + 
               ",Garantie: " + garantie + ",Tip Control:" +tipControl+ " kWh, Are NoFrost: " + (areNoFrost ? "Da" : "Nu") +
               ", Temperatura Minima: " + temperaturaMinima + "°C, Temperatura Maxima: " + temperaturaMaxima + "°C" +
               ", Tip Deschidere Usa: " + tipDeschidereUsa + ", Material Usa: " + materialUsa + ", Culoare: " + culoare + "]";
    }
}
*/

/*public class Frigider extends EchipamentdeBucatarie implements EchipamentInterface {
    boolean areNoFrost;
    double temperaturaMinima;
    double temperaturaMaxima;
    String tipDeschidereUsa;
    String materialUsa;
    String culoare;

    public Frigider() {
        super();
        this.areNoFrost = false;
        this.temperaturaMinima = -18.0;
        this.temperaturaMaxima = 8.0;
        this.tipDeschidereUsa = "dreapta";
        this.materialUsa = "plastic";
        this.culoare = "alb";
    }

    public Frigider(String marca, String model, double capacitate, double consumEnergie, boolean areNoFrost,
                     double temperaturaMinima, double temperaturaMaxima, String tipDeschidereUsa, String materialUsa, String culoare) {
        super(marca, model, capacitate, consumEnergie);
        this.areNoFrost = areNoFrost;
        this.temperaturaMinima = temperaturaMinima;
        this.temperaturaMaxima = temperaturaMaxima;
        this.tipDeschidereUsa = tipDeschidereUsa;
        this.materialUsa = materialUsa;
        this.culoare = culoare;
    }

    @Override
    public void displayDetails() {
        System.out.println("Frigider - Marca: " + marca + ", Model: " + model + ", Capacitate: " + capacitate + 
                           "L, Consum energie: " + consumEnergie + " kWh, Are NoFrost: " + (areNoFrost ? "Da" : "Nu") +
                           ", Temperatura Minima: " + temperaturaMinima + "°C, Temperatura Maxima: " + temperaturaMaxima + "°C" +
                           ", Tip Deschidere Usa: " + tipDeschidereUsa + ", Material Usa: " + materialUsa + ", Culoare: " + culoare);
    }

    @Override
    public double calculeazaPret() {
        // Exemplu simplu: pretul poate depinde de consumul de energie
        return consumEnergie * 50; // Adăugăm 50 lei pentru fiecare kWh de consum
    }
}
*/
public class Frigider extends EchipamentdeBucatarie {
    private boolean areNoFrost; // Tehnologia NoFrost
    private double temperaturaMinima; // Temperatura minima de functionare (°C)
    private double temperaturaMaxima; // Temperatura maxima de functionare (°C)
    private String tipDeschidereUsa; // Tipul de deschidere a ușii (ex: dreapta, stanga)
    private String materialUsa; // Materialul ușii (ex: inox, plastic)
    private String culoare; // Culoarea frigiderului

    // Constructor fara argumente
    public Frigider() {
        super(); // Apelam constructorul implicit al clasei parinte
        this.areNoFrost = false;
        this.temperaturaMinima = -18.0; // Valoare implicită
        this.temperaturaMaxima = 8.0;  // Valoare implicită
        this.tipDeschidereUsa = "dreapta"; // Valoare implicită
        this.materialUsa = "plastic"; // Valoare implicită
        this.culoare = "alb"; // Valoare implicită
    }

    // Constructor cu toate argumentele
    public Frigider(String marca, String model, double pret, int garantie, String tipControl, boolean areNoFrost,
                     double temperaturaMinima, double temperaturaMaxima, String tipDeschidereUsa, String materialUsa, String culoare) {
        super(marca, model, pret, garantie, tipControl); // Apelăm constructorul clasei părinte
        this.areNoFrost = areNoFrost;
        this.temperaturaMinima = temperaturaMinima;
        this.temperaturaMaxima = temperaturaMaxima;
        this.tipDeschidereUsa = tipDeschidereUsa;
        this.materialUsa = materialUsa;
        this.culoare = culoare;
    }

    // Constructor de copiere
    public Frigider(Frigider altFrigider) {
        super(altFrigider); // Apelăm constructorul de copiere al clasei părinte
        this.areNoFrost = altFrigider.areNoFrost;
        this.temperaturaMinima = altFrigider.temperaturaMinima;
        this.temperaturaMaxima = altFrigider.temperaturaMaxima;
        this.tipDeschidereUsa = altFrigider.tipDeschidereUsa;
        this.materialUsa = altFrigider.materialUsa;
        this.culoare = altFrigider.culoare;
    }

    // Metode getter și setter pentru atribute private
    public boolean isAreNoFrost() {
        return areNoFrost;
    }

    public void setAreNoFrost(boolean areNoFrost) {
        this.areNoFrost = areNoFrost;
    }

    public double getTemperaturaMinima() {
        return temperaturaMinima;
    }

    public void setTemperaturaMinima(double temperaturaMinima) {
        this.temperaturaMinima = temperaturaMinima;
    }

    public double getTemperaturaMaxima() {
        return temperaturaMaxima;
    }

    public void setTemperaturaMaxima(double temperaturaMaxima) {
        this.temperaturaMaxima = temperaturaMaxima;
    }

    public String getTipDeschidereUsa() {
        return tipDeschidereUsa;
    }

    public void setTipDeschidereUsa(String tipDeschidereUsa) {
        this.tipDeschidereUsa = tipDeschidereUsa;
    }

    public String getMaterialUsa() {
        return materialUsa;
    }

    public void setMaterialUsa(String materialUsa) {
        this.materialUsa = materialUsa;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

     //implementarea metodei abstracte
    @Override
    public String tipEchipament() {
        return "Frigider:";
    }

    @Override
    public double calculeazaCostTotal(double costLivrare) {
        return getPret() + costLivrare;
    }
    // Metoda toString rescrisa pentru Frigider
     @Override
    public String toString() {
        return "Frigider : ["+ ", Are NoFrost: " + (areNoFrost ? "Da" : "Nu") +
               ", Temperatura Minima: " + temperaturaMinima + "°C, Temperatura Maxima: " + temperaturaMaxima + "°C" +
               ", Tip Deschidere Usa: " + tipDeschidereUsa + ", Material Usa: " + materialUsa + ", Culoare: " + culoare + "]";
    }
}