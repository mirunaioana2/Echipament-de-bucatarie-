/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ro.ugal.aciee.echipamentdebucatarie;

/**
 *
 * @author Amalia
 */

public class CuptorIncorporat extends echipamentdebucatarie {
    private int putereMaxima;
    private int volum;
    private int numarFunctii;
    private String material;
    private boolean iluminare;

    // constructor fara argumente
    public CuptorIncorporat() {
        super();
        this.putereMaxima = 0;
        this.volum = 0;
        this.numarFunctii = 0;
        this.material = "";
        this.iluminare = false;
    }

    // constructor cu toti parametrii
    public CuptorIncorporat(String marca, String model, double pret, int garantie,
                              String tipControl, int putereMaxima, int volum, int numarFunctii,
                              String material, boolean iluminare) {
        super(marca, model, pret, garantie, tipControl);
        this.putereMaxima = putereMaxima;
        this.volum = volum;
        this.numarFunctii = numarFunctii;
        this.material = material;
        this.iluminare = iluminare;
    }

    // constructor de copiere
    public CuptorIncorporat(CuptorIncorporat altCuptor) {
        super(altCuptor);
        this.putereMaxima = altCuptor.putereMaxima;
        this.volum = altCuptor.volum;
        this.numarFunctii = altCuptor.numarFunctii;
        this.material = altCuptor.material;
        this.iluminare = altCuptor.iluminare;
    }
    
    public int getPutereMaxima() {
        return putereMaxima;
    }

    public void setPutereMaxima(int putereMaxima) {
        this.putereMaxima = putereMaxima;
    }

    public int getVolum() {
        return volum;
    }

    public void setVolum(int volum) {
        this.volum = volum;
    }

    public int getNumarFunctii() {
        return numarFunctii;
    }

    public void setNumarFunctii(int numarFunctii) {
        this.numarFunctii = numarFunctii;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public boolean isIluminare() {
        return iluminare;
    }

    public void setIluminare(boolean iluminare) {
        this.iluminare = iluminare;
    }

    
    
    // implementarea metodei abstracte
    @Override
    public String tipEchipament() {
        return "Cuptor incorporabil";
    }

    @Override
    public double calculeazaCostTotal(double costLivrare) {
        return getPret() + costLivrare;
    }

    // suprascrierea metodei toString
  @Override
    public String toString() {
        return super.toString() + ", Putere maxima: " + putereMaxima + "W, Volum: " + volum + "L, Nr. Functii: " + numarFunctii + ", Material: " + material + ", Iluminare: " + iluminare;
    }
}
