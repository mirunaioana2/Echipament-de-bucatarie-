/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.echipamentdebucatarie
/**
 *
 * @author Gigabyte
 */
//clasa parinte
public class EchipamentdeBucatarie {
    protected String marca;
    protected float pret;
    protected double greutate;

//constructor implicit
    public EchipamentdeBucatarie() {
        this.marca = "Necunoscuta";
        this.pret = 0.0f;
        this.greutate = 0.0;
    }

//constructor cu parametri
    public EchipamentdeBucatarie(String marca, double pret, double greutate) {
        this.marca = marca;
        this.pret = (float) pret;
        this.greutate = greutate;
    }

//metoda toString
    @Override
    public String toString() {
        return "EchipamentdeBucatarie{" +
               "marca='" + marca + '\'' +
               ", pret=" + pret +
               ", greutate=" + greutate +
               '}';
    }
}

