/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ro.ugal.aciee.echipamentdebucatarie;

/**
 *
 * @author Amalia
 */

// clasa comuna
public class EchipamentdeBucatarie {
    public String producator;
    public double pret;
    public String culoare;

    // constructor fara argumente
    public EchipamentdeBucatarie() {
        this.producator = "";
        this.pret = 0.0;
        this.culoare = "";
    }

    // constructor cu toate argumentele
    public EchipamentdeBucatarie(String producator, double pret, String culoare) {
        this.producator = producator;
        this.pret = pret;
        this.culoare = culoare;
    }

    // constructor de copiere
    public EchipamentdeBucatarie(EchipamentdeBucatarie other) {
        this.producator = other.producator;
        this.pret = other.pret;
        this.culoare = other.culoare;
    }

    // rescriere metoda toString
    @Override
    public String toString() {
        return "EchipamentDeBucatarie{" +
                "producator='" + producator + '\'' +
                ", pret=" + pret +
                ", culoare='" + culoare + '\'' +
                '}';
    }
}
