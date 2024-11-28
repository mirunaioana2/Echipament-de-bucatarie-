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
/*public class Test {
    public static void main(String[] args) {
        // Creare obiect EchipamentdeBucatarie (de exemplu, un frigider generic)
        EchipamentdeBucatarie echipament1 = new Frigider("Samsung", "RT50K6351S8", 2000.0, 24, "Touch", true, -18.0, 8.0, "dreapta", "inox", "argintiu") {};

        // Creare obiect Frigider folosind constructorul cu argumente
        Frigider frigider1 = new Frigider("Samsung", "RT50K6351S8", 2000.0, 24, "Touch", true, -18.0, 8.0, "dreapta", "inox", "argintiu") {};

        // Creare obiect CombinaFrigorifica folosind constructorul cu argumente
        CombinaFrigorifica combina1 = new CombinaFrigorifica("LG", "GBB72MCUFN",24,"Touch",2, true, "No Frost", 36.0, "alb", 2500.0) {
             @Override
    public String tipEchipament() {
        return "Cuptor cu microunde";
    }

    @Override
    public double calculeazaCostTotal(double costLivrare) {
        return getPret() + costLivrare;
    }

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

       
    }
}
*/

/*import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        // Creare array de 10 elemente pentru Frigider cu Object[]
        Object[] frigiderArray = new Object[10];
        
        // Popularea array-ului frigiderArray cu instanțe de Frigider
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                frigiderArray[i] = new Frigider("Samsung", "RT50K6351S8", 2000.0, 24, "Touch", true, -18.0, 8.0, "dreapta", "inox", "argintiu") {};
            } else {
                frigiderArray[i] = new Frigider() {}; // Folosim constructorul fără argumente
            }
        }

        // Creare array de 10 elemente pentru CombinaFrigorifica cu Object[]
        Object[] combinaArray = new Object[10];
        
        // Popularea array-ului combinaArray cu instanțe de CombinaFrigorifica
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                combinaArray[i] = new CombinaFrigorifica("LG", "GBB72MCUFN", 2500.0, 24, "Touch", 2, true, "No Frost", 36.0, "alb", 2500.0) {};
            } else {
                combinaArray[i] = new CombinaFrigorifica() {}; // Folosim constructorul fără argumente
            }
        }

        // Creare ArrayList pentru Frigider
        ArrayList<Object> frigiderList = new ArrayList<>();
        
        // Popularea ArrayList-ului frigiderList cu instanțe de Frigider
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                frigiderList.add(new Frigider("Samsung", "RT50K6351S8", 2000.0, 24, "Touch", true, -18.0, 8.0, "dreapta", "inox", "argintiu") {});
            } else {
                frigiderList.add(new Frigider() {}); // Folosim constructorul fără argumente
            }
        }

        // Creare ArrayList pentru CombinaFrigorifica
        ArrayList<Object> combinaList = new ArrayList<>();
        
        // Popularea ArrayList-ului combinaList cu instanțe de CombinaFrigorifica
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                combinaList.add(new CombinaFrigorifica("LG", "GBB72MCUFN", 2500.0, 24, "Touch", 2, true, "No Frost", 36.0, "alb", 2500.0) {});
            } else {
                combinaList.add(new CombinaFrigorifica() {}); // Folosim constructorul fără argumente
            }
        }

        // Afisare date pentru obiectele din frigiderArray
        System.out.println("Detalii pentru frigiderArray (Object[]):");
        for (Object obj : frigiderArray) {
            System.out.println(((Frigider) obj).toString());
        }

        // Afisare date pentru obiectele din combinaArray
        System.out.println("\nDetalii pentru combinaArray (Object[]):");
        for (Object obj : combinaArray) {
            System.out.println(((CombinaFrigorifica) obj).toString());
        }

        // Afisare date pentru obiectele din frigiderList
        System.out.println("\nDetalii pentru frigiderList (ArrayList<Object>):");
        for (Object obj : frigiderList) {
            System.out.println(((Frigider) obj).toString());
        }

        // Afisare date pentru obiectele din combinaList
        System.out.println("\nDetalii pentru combinaList (ArrayList<Object>):");
        for (Object obj : combinaList) {
            System.out.println(((CombinaFrigorifica) obj).toString());
        }
    }
}
*/

/*import java.util.ArrayList;
public class Test {
    public static void main(String[] args) {
        // Creare ArrayList pentru Frigider
        ArrayList<Frigider> frigiderList = new ArrayList<>();
        
        // Popularea ArrayList-ului frigiderList cu 10 instanțe de Frigider
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                // Constructor cu parametri
                frigiderList.add(new Frigider("Samsung", "RT50K6351S8", 2000.0, 24, "Touch", true, -18.0, 8.0, "dreapta", "inox", "argintiu") {});
            } else {
                // Constructor fără parametri
                frigiderList.add(new Frigider() {});
            }
        }

        // Creare ArrayList pentru CombinaFrigorifica
        ArrayList<CombinaFrigorifica> combinaList = new ArrayList<>();
        
        // Popularea ArrayList-ului combinaList cu 10 instanțe de CombinaFrigorifica
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                // Constructor cu parametri
                combinaList.add(new CombinaFrigorifica("LG", "GBB72MCUFN", 2500.0, 24, "Touch", 2, true, "No Frost", 36.0, "alb", 2500.0) {});
            } else {
                // Constructor fără parametri
                combinaList.add(new CombinaFrigorifica() {});
            }
        }

        // Afisare date pentru Frigidere
        System.out.println("Detalii pentru Frigidere:");
        for (Frigider frigider : frigiderList) {
            System.out.println(frigider.toString());
        }

        // Afisare date pentru Combine Frigorifice
        System.out.println("\nDetalii pentru Combine Frigorifice:");
        for (CombinaFrigorifica combina : combinaList) {
            System.out.println(combina.toString());
        }
    }
}
*/
/*import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Frigider> frigiderList = new ArrayList<>();
        ArrayList<CombinaFrigorifica> combinaList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            frigiderList.add(i % 2 == 0 ? new Frigider("Samsung", "RT50K6351S8", 2000.0, 24, "Touch", true, -18.0, 8.0, "dreapta", "inox", "argintiu") {} : new Frigider() {});
            combinaList.add(i % 2 == 0 ? new CombinaFrigorifica("LG", "GBB72MCUFN", 2500.0, 24, "Touch", 2, true, "No Frost", 36.0, "alb", 2500.0) {} : new CombinaFrigorifica() {});
        }

        System.out.println("Detalii pentru Frigidere:");
        for (Frigider frigider : frigiderList) System.out.println(frigider.toString());

        System.out.println("\nDetalii pentru Combine Frigorifice:");
        for (CombinaFrigorifica combina : combinaList) System.out.println(combina.toString());
    }
}
*/
public class Test {
    public static void main(String[] args) {
        // Creare obiect EchipamentdeBucatarie (Frigider) folosind constructorul fara argumente
        Frigider frigider1 = new Frigider() {};
        // Creare obiect EchipamentdeBucatarie (Frigider) folosind constructorul cu toti parametrii
        Frigider frigider2 = new Frigider("Samsung", "RT50K6351S8", 2000.0, 24, "Touch", true, -18.0, 8.0, "dreapta", "inox", "argintiu") {};
        // Creare obiect EchipamentdeBucatarie (Frigider) folosind constructorul de copiere
        Frigider frigider3 = new Frigider((Frigider) frigider2) {};

        // Creare obiect CombinaFrigorifica folosind constructorul fara argumente
        CombinaFrigorifica combina1 = new CombinaFrigorifica() {};
        // Creare obiect CombinaFrigorifica folosind constructorul cu toti parametrii
        CombinaFrigorifica combina2 = new CombinaFrigorifica("LG", "GBB72MCUFN", 24, "Touch", 2, true, "No Frost", 36.0, "alb", 2500.0) {};
        // Creare obiect CombinaFrigorifica folosind constructorul de copiere
        CombinaFrigorifica combina3 = new CombinaFrigorifica(combina2) {};
        
        System.out.println("Frigider 1: " + frigider1.toString());
        System.out.println("Frigider 2: " + frigider2.toString());
        System.out.println("Frigider 3 (copiat): " + frigider3.toString());
        System.out.println();

        // afisarea datelor pentru CuptorIncorporabil
        System.out.println("CombinaFrigorifica 1: " + combina1.toString());
        System.out.println("CombinaFrigorifica 2: " + combina2.toString());
        System.out.println("CombinaFrigorifica 3 (copiat): " + combina3.toString());
        System.out.println();

        Frigider[] frigidere = new Frigider[10];
        for (int i = 0; i < frigidere.length; i++) {
            frigidere[i] = new Frigider( "Brand" + i,"Model" + i,500 + i * 50,24 + i,"Touch",i % 2 == 0,20 + i,i % 2 == 0 ? 8.0 : 5.0,i % 2 == 0 ? "Dreapta" : "Stanga",i % 2 == 0 ? "Inox" : "Plastic",i % 2 == 0 ? "Alb" : "Argintiu") {} ;
        }
        
        System.out.println("Instante din clasa Frigider:");
        for (Frigider frigider : frigidere) {
            System.out.println(frigider);
        }
        
        CombinaFrigorifica[] combineFrigorifice = new CombinaFrigorifica[10];
        for (int i = 0; i < combineFrigorifice.length; i++) {
            combineFrigorifice[i] = new CombinaFrigorifica("Brand" + i,"Model" + i,24 + i,"Touch",2 + (i % 2),i % 2 == 0,i % 2 == 0 ? "No Frost" : "Clasic",35.0 + (i % 3) * 2,i % 2 == 0 ? "Alb" : "Negru",1500.0 + (i * 100)) {};
            if(combineFrigorifice[i].getAreDispensardeApa)
            {
                combineFrigorifice[i].setAreDispensardeApa
            }
        }

        // Afisarea instantelor pentru CuptorIncorporat
        System.out.println("Instante din clasa CombinaFrigorifica:");
        for (CombinaFrigorifica combina : combineFrigorifice) {
            System.out.println(combina);
        }
        
    }
       
}
