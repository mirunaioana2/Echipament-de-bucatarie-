/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ro.ugal.aciee.echipamentdebucatarie;

/**
 *
 * @author Amalia
 */

public abstract class echipamentdebucatarie implements Echipament {
    private String marca;
    private String model;
    private double pret;
    private int garantie;
    private String tipControl;  // exemplu de atribut suplimentar

    // constructor fara argumente
    public echipamentdebucatarie() {
        this.marca = "";
        this.model = "";
        this.pret = 0.0;
        this.garantie = 0;
        this.tipControl = "";
    }

    // constructor cu toti parametrii
    public echipamentdebucatarie(String marca, String model, double pret, int garantie, String tipControl) {
        this.marca = marca;
        this.model = model;
        this.pret = pret;
        this.garantie = garantie;
        this.tipControl = tipControl;
    }

    // constructor de copiere
    public echipamentdebucatarie(echipamentdebucatarie altEchipament) {
        this.marca = altEchipament.marca;
        this.model = altEchipament.model;
        this.pret = altEchipament.pret;
        this.garantie = altEchipament.garantie;
        this.tipControl = altEchipament.tipControl;
    }

    // implementarea metodelor din interfata Echipament
    @Override
    public String getMarca() {
        return marca;
    }

    @Override
    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public double getPret() {
        return pret;
    }

    @Override
    public void setPret(double pret) {
        this.pret = pret;
    }

    @Override
    public int getGarantie() {
        return garantie;
    }

    @Override
    public void setGarantie(int garantie) {
        this.garantie = garantie;
    }

    // metoda abstracta care trebuie implementata in clasele derivate
    public abstract String tipEchipament();

    // metoda abstracta care trebuie implementata în clasele derivate
    public abstract double calculeazaCostTotal(double costLivrare);

    @Override
    public String descriereEchipament() {
        return "Marca: " + marca + ", Model: " + model + ", Pret: " + pret + ", Garantie: " + garantie + " luni";
    }

    @Override
    public double calculeazaReducere(double procent) {
        return pret - (pret * procent / 100);
    }

    // suprascrierea metodei toString
    @Override
    public String toString() {
        return "EchipamentDeBucatarie [marca=" + marca + ", model=" + model + ", pret=" + pret + ", garantie=" + garantie + "]";
    }
}
