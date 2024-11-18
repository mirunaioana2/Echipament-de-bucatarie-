/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.echipamentbucatarie;

/**
 *
 * @author Gabriela
 */
public class Congelator extends EchipamentBucatarie  {
    private boolean functieDecongelareAutomata; 

    // constructor fara argumente
    public Congelator() {
        super();
    }

    // constructor cu toate argumentele
    public Congelator(String marca, String model, int capacitateLitri, int consumEnergieKwh, 
                      String tipEnergie, int garantieAni, double pret, String dimensiuni, 
                      String culoare, int nivelZgomot, boolean functieDecongelareAutomata) {
        super(marca, model, capacitateLitri, consumEnergieKwh, tipEnergie, garantieAni, pret, dimensiuni, culoare, nivelZgomot);
        this.functieDecongelareAutomata = functieDecongelareAutomata; //initializeaza atributul specific clasei
    }
    
    public Congelator(Congelator o) {
        functieDecongelareAutomata = o.functieDecongelareAutomata; //de sus
    }
    

    // toString include toate campurile
    @Override
    public String toString() {
        return super.toString() + ", functieDecongelareAutomata=" + functieDecongelareAutomata + '}';
    }

    // getter si setter
    public boolean isFunctieDecongelareAutomata() { return functieDecongelareAutomata; }
    public void setFunctieDecongelareAutomata(boolean functieDecongelareAutomata) { this.functieDecongelareAutomata = functieDecongelareAutomata; }
}
