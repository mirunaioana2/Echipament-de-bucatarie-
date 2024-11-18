/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ro.ugal.aciee.echipamentdebucatarie;

/**
 *
 * @author Amalia
 */

// clasa CuptorIncorporabil
class CuptorIncorporabil extends EchipamentdeBucatarie {
    private int capacitate; 
    private boolean areVentilator;

    // constructor fara argumente
    public CuptorIncorporabil() {
        super();
        this.capacitate = 0;
        this.areVentilator = false;
    }

    // constructor cu toate argumentele
    public CuptorIncorporabil(String producator, double pret, String culoare, int capacitate, boolean areVentilator) {
        super(producator, pret, culoare);
        this.capacitate = capacitate;
        this.areVentilator = areVentilator;
    }

    // constructor de copiere
    public CuptorIncorporabil(CuptorIncorporabil other) {
        super(other);
        this.capacitate = other.capacitate;
        this.areVentilator = other.areVentilator;
    }

    // rescriere metoda toString
    @Override
    public String toString() {
        return "CuptorIncorporabil{" +
                "producator='" + producator + '\'' +
                ", pret=" + pret +
                ", culoare='" + culoare + '\'' +
                ", capacitate=" + capacitate +
                ", areVentilator=" + areVentilator +
                '}';
    }
}
