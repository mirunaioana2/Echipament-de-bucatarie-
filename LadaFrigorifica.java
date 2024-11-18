/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.echipamentbucatarie;

/**
 *
 * @author Butza
 */
public class LadaFrigorifica extends EchipamentBucatarie {
    private boolean portabil;

    // constructor fara argumente
    public LadaFrigorifica() {
        super();
    }
    
    public LadaFrigorifica(LadaFrigorifica o) { //copiat de sus
    }

    // constructor cu toate argumentele
    public LadaFrigorifica(String marca, String model, int capacitateLitri, int consumEnergieKwh, 
                           String tipEnergie, int garantieAni, double pret, String dimensiuni, 
                           String culoare, int nivelZgomot, boolean portabil) {
        super(marca, model, capacitateLitri, consumEnergieKwh, tipEnergie, garantieAni, pret, dimensiuni, culoare, nivelZgomot);
        this.portabil = portabil;
    }

    // metoda toString 
    @Override
    public String toString() {
        return super.toString() + ", portabil=" + portabil + '}';
    }

    // getter si setter 
    public boolean isPortabil() { return portabil; }
    public void setPortabil(boolean portabil) { this.portabil = portabil; }
}
