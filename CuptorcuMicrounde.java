/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ro.ugal.aciee.echipamentdebucatarie;

/**
 *
 * @author Amalia
 */
public class CuptorcuMicrounde extends echipamentdebucatarie {
    private int putere;
    private int capacitate;
    private boolean grill;
    private String culoare;

    // constructor fara argumente
    public CuptorcuMicrounde() {
        super();
        this.putere = 0;
        this.capacitate = 0;
        this.grill = false;
        this.culoare = "";    
    }

    // constructor cu toti parametrii
    public CuptorcuMicrounde(String marca, String model, double pret, int garantie,
                             String tipControl, int putere, int capacitate, boolean grill, String culoare) {
        super(marca, model, pret, garantie, tipControl);
        this.putere = putere;
        this.capacitate = capacitate;
        this.grill = grill;
        this.culoare = culoare;
    }

    // constructor de copiere
    public CuptorcuMicrounde(CuptorcuMicrounde altCuptor) {
        super(altCuptor);
        this.putere = altCuptor.putere;
        this.capacitate = altCuptor.capacitate;
        this.grill = altCuptor.grill;
        this.culoare = altCuptor.culoare;
    }

    
    public int getPutere() {
        return putere;
    }

    public void setPutere(int putere) {
        this.putere = putere;
    }

    public int getCapacitate() {
        return capacitate;
    }

    public void setCapacitate(int capacitate) {
        this.capacitate = capacitate;
    }

    public boolean isGrill() {
        return grill;
    }

    public void setGrill(boolean grill) {
        this.grill = grill;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }
    
    
    // implementarea metodei abstracte
    @Override
    public String tipEchipament() {
        return "Cuptor cu microunde";
    }

    @Override
    public double calculeazaCostTotal(double costLivrare) {
        return getPret() + costLivrare;
    }

     // suprascrierea metodei toString
    @Override
    public String toString() {
        return super.toString() + ", Putere: " + putere + "W, Capacitate: " + capacitate + "L, Grill: " + grill + ", Culoare: " + culoare;
    }

}
