/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.echipamentdebucatarie;

/**
 *
 * @author Asus
 */
/*public class Test {
    public static void main(String[] args) {
        // Crearea unui obiect EchipamentdeBucatarie
        EchipamentdeBucatarie echipament = new EchipamentdeBucatarie("Samsung", "X123", 300, 1.2);
        System.out.println(echipament); // Afișează informațiile despre echipament

        // Crearea unui obiect Frigider
        Frigider frigider = new Frigider("Bosch", "FreshX", 500, 1.5, true);
        System.out.println(frigider); // Afișează informațiile despre frigider

        // Crearea unui obiect CombinaFrigorifica
        CombinaFrigorifica combina = new CombinaFrigorifica("Whirlpool", "ComboX", 600, 1.8, 2, true);
        System.out.println(combina); // Afișează informațiile despre combina frigorifica
    }
}
*/
/*public class Test {
    public static void main(String[] args) {
        // Crearea unui obiect EchipamentdeBucatarie
        EchipamentdeBucatarie echipament = new EchipamentdeBucatarie("Samsung", "X123", 300, 1.2);
        System.out.println(echipament); // Afișează informațiile despre echipament
        echipament.displayDetails();

        // Calculăm și afișăm prețul echipamentului
        double pret = echipament.calculeazaPret();
        System.out.println("Prețul echipamentului este: " + pret + " RON");

        // Crearea unui obiect Frigider cu toate atributele
        Frigider frigider = new Frigider("Bosch","FreshX", 500, 1.5, true, -18.0, 8.0,"dreapta","inox","argintiu");
        // Afișarea detaliilor frigiderului
        System.out.println(frigider);

        // Crearea unui obiect CombinaFrigorifica (presupunem că aceasta există deja)
         CombinaFrigorifica combina = new CombinaFrigorifica("Samsung", "RT38K5532SL", 375, 300, 2, true, "No Frost", 38.0, "Argintiu", 3500);
         // Afișarea detaliilor combinei frigorifice
       System.out.println(combina);
    }
}
*/
public class Test {
    public static void main(String[] args) {
        // Creare obiect EchipamentdeBucatarie (de exemplu, un frigider generic)
        EchipamentdeBucatarie echipament1 = new Frigider("Samsung", "RT50K6351S8", 2000.0, 24, "Touch", true, -18.0, 8.0, "dreapta", "inox", "argintiu") {};

        // Creare obiect Frigider folosind constructorul cu argumente
        Frigider frigider1 = new Frigider("Samsung", "RT50K6351S8", 2000.0, 24, "Touch", true, -18.0, 8.0, "dreapta", "inox", "argintiu") {};

        // Creare obiect CombinaFrigorifica folosind constructorul cu argumente
        CombinaFrigorifica combina1 = new CombinaFrigorifica("LG", "GBB72MCUFN",24,"Touch",2, true, "No Frost", 36.0, "alb", 2500.0) {
            @Override
            public String tipEchipament() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public double calculeazaCostTotal(double costLivrare) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        };

        // Afișare detalii pentru Echipament (care este un Frigider)
        System.out.println("Detalii Echipament 1 (Frigider):");
        System.out.println(echipament1.toString());

        // Afișare detalii pentru Frigider
        System.out.println("\nDetalii Frigider 1:");
        System.out.println(frigider1.toString());

        // Afișare detalii pentru Combina Frigorifica
        System.out.println("\nDetalii Combina Frigorifica 1:");
        System.out.println(combina1.toString());

        // Modificare detalii pentru Frigider
        frigider1.setTemperaturaMinima(-20.0);
        frigider1.setTemperaturaMaxima(10.0);
        frigider1.setCuloare("negru");

        // Afișare detalii actualizate pentru Frigider
        System.out.println("\nDetalii actualizate Frigider 1:");
        System.out.println(frigider1.toString());

        // Modificare detalii pentru Combina Frigorifica
        combina1.setNumarUsi(3);
        combina1.setAreDispenserApa(false);

        // Afișare detalii actualizate pentru Combina Frigorifica
        System.out.println("\nDetalii actualizate Combina Frigorifica 1:");
        System.out.println(combina1.toString());

        // Apelare metoda calculează reducere pentru Frigider
        double reducereFrigider = frigider1.calculeazaReducere(10); // reducere 10%
        System.out.println("\nFrigider 1 cu reducere de 10%: " + reducereFrigider + " RON");

        // Apelare metoda calculează reducere pentru Combina Frigorifica
        double reducereCombina = combina1.calculeazaReducere(15); // reducere 15%
        System.out.println("Combina Frigorifica 1 cu reducere de 15%: " + reducereCombina + " RON");
    }
}

