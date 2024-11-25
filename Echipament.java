/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ro.ugal.aciee.echipamentdebucatarie;

/**
 *
 * @author Amalia
 */
public interface Echipament {
    // metode pentru obtinerea valorilor campurilor
    String getMarca();
    String getModel();
    double getPret();
    int getGarantie();

    // metode pentru setarea valorilor campurilor
    void setMarca(String marca);
    void setModel(String model);
    void setPret(double pret);
    void setGarantie(int garantie);

    // metoda pentru a obtine o descriere a echipamentului
    String descriereEchipament();
    
    // metoda pentru a calcula reducerea
    double calculeazaReducere(double procent);
}

