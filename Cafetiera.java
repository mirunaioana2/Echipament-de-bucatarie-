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
    private int numarCesti; 
    private boolean areFiltruPermanent;

//constructor implicit
    public Cafetiera() {
        super(); //apelează constructorul implicit al clasei părinte echipamentdebucatarie
        numarCesti = 0;
        areFiltruPermanent = false;
    }

//constructor cu parametri
    public Cafetiera(String marca, double pret, double greutate, int numarCesti, boolean areFiltruPermanent) {
        super(marca, pret, greutate); //apelează constructorul clasei părinte
        this.numarCesti = numarCesti;
        this.areFiltruPermanent = areFiltruPermanent;
    }

//metodă pentru afișare
    @Override
    public String toString() {
        return "Cafetiera: marca=" + marca + ", pret=" + pret + ", greutate=" + greutate + ", numarCesti=" + numarCesti + ", filtruPermanent=" + (areFiltruPermanent ? "Da" : "Nu");
    }
}
