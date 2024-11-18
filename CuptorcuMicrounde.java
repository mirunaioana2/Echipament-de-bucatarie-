/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ro.ugal.aciee.echipamentdebucatarie;

/**
 *
 * @author Amalia
 */
// clasa CuptorcuMicrounde
class CuptorcuMicrounde extends EchipamentdeBucatarie {
    private int putere; 
    private boolean areGrill;

    // constructor fara argumente
    public CuptorcuMicrounde() {
        super();
        this.putere = 0;
        this.areGrill = false;
    }

    // constructor cu toate argumentele
    public CuptorcuMicrounde(String producator, double pret, String culoare, int putere, boolean areGrill) {
        super(producator, pret, culoare);
        this.putere = putere;
        this.areGrill = areGrill;
    }

    // constructor de copiere
    public CuptorcuMicrounde(CuptorcuMicrounde other) {
        super(other);
        this.putere = other.putere;
        this.areGrill = other.areGrill;
    }

    // rescriere metoda toString
    @Override
    public String toString() {
        return "CuptorCuMicrounde{" +
                "producator='" + producator + '\'' +
                ", pret=" + pret +
                ", culoare='" + culoare + '\'' +
                ", putere=" + putere +
                ", areGrill=" + areGrill +
                '}';
    }
}