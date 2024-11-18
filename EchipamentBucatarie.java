/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.echipamentbucatarie;

/**
 *
 * @author Gabriela
 */

public class EchipamentBucatarie {
    public String marca;
    public String model;
    public int capacitateLitri;
    public int consumEnergieKwh;
    public String tipEnergie; 
    public int garantieAni;
    public double pret;
    public String dimensiuni; // LxWxH
    public String culoare;
    public int nivelZgomot;

    // constructor fara argumente
    public EchipamentBucatarie() {}

    // Constructor cu toate argumentele
    public EchipamentBucatarie(String marca, String model, int capacitateLitri, int consumEnergieKwh, 
                               String tipEnergie, int garantieAni, double pret, String dimensiuni, 
                               String culoare, int nivelZgomot) {
        this.marca = marca;
        this.model = model;
        this.capacitateLitri = capacitateLitri;
        this.consumEnergieKwh = consumEnergieKwh;
        this.tipEnergie = tipEnergie;
        this.garantieAni = garantieAni;
        this.pret = pret;
        this.dimensiuni = dimensiuni;
        this.culoare = culoare;
        this.nivelZgomot = nivelZgomot;
    }

    // constructor de copiere
    public EchipamentBucatarie(EchipamentBucatarie alt) {
        this(alt.marca, alt.model, alt.capacitateLitri, alt.consumEnergieKwh, alt.tipEnergie, 
             alt.garantieAni, alt.pret, alt.dimensiuni, alt.culoare, alt.nivelZgomot);
    }

    // afisare (toString)
    @Override
    public String toString() {
        return "EchipamentBucatarie{" +
               "marca='" + marca + '\'' +
               ", model='" + model + '\'' +
               ", capacitateLitri=" + capacitateLitri +
               ", consumEnergieKwh=" + consumEnergieKwh +
               ", tipEnergie='" + tipEnergie + '\'' +
               ", garantieAni=" + garantieAni +
               ", pret=" + pret +
               ", dimensiuni='" + dimensiuni + '\'' +
               ", culoare='" + culoare + '\'' +
               ", nivelZgomot=" + nivelZgomot +
               '}';
    }

    // getteri și setteri
    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public int getCapacitateLitri() { return capacitateLitri; }
    public void setCapacitateLitri(int capacitateLitri) { this.capacitateLitri = capacitateLitri; }

    public int getConsumEnergieKwh() { return consumEnergieKwh; }
    public void setConsumEnergieKwh(int consumEnergieKwh) { this.consumEnergieKwh = consumEnergieKwh; }

    public String getTipEnergie() { return tipEnergie; }
    public void setTipEnergie(String tipEnergie) { this.tipEnergie = tipEnergie; }

    public int getGarantieAni() { return garantieAni; }
    public void setGarantieAni(int garantieAni) { this.garantieAni = garantieAni; }

    public double getPret() { return pret; }
    public void setPret(double pret) { this.pret = pret; }

    public String getDimensiuni() { return dimensiuni; }
    public void setDimensiuni(String dimensiuni) { this.dimensiuni = dimensiuni; }

    public String getCuloare() { return culoare; }
    public void setCuloare(String culoare) { this.culoare = culoare; }

    public int getNivelZgomot() { return nivelZgomot; }
    public void setNivelZgomot(int nivelZgomot) { this.nivelZgomot = nivelZgomot; }
}

