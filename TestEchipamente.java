/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.echipamentbucatarie;


/**
 *
 * @author Gabriela
 */
public class TestEchipamente {
    public static void main(String[] args) {
        // instante pentru congelator
        Congelator congelator1 = new Congelator(); // constructor fara argumente
        Congelator congelator2 = new Congelator("Arctic", "C1000", 200, 150, "Electric", 2, 1500.0, "60x60x120", "Alb", 42, true); // constructor cu argumente
        Congelator congelator3 = new Congelator(congelator2); // constructor de copiere

        // instante pentru ladafrigorifica
        LadaFrigorifica lada1 = new LadaFrigorifica(); // constructor fara argumente
        LadaFrigorifica lada2 = new LadaFrigorifica("Samsung", "L300", 300, 180, "Electric", 3, 2000.0, "70x70x140", "Argintiu", 50, false); // constructor cu argumente
        LadaFrigorifica lada3 = new LadaFrigorifica(lada2); // constructor de copiere

        // afisare date congelator
        System.out.println("Instante Congelator:");
        System.out.println(congelator1);
        System.out.println(congelator2);
        System.out.println(congelator3);

        // afisare date ladafrigorifica
        System.out.println("\nInstante Lada Frigorifica:");
        System.out.println(lada1);
        System.out.println(lada2);
        System.out.println(lada3);
        
        //  vector pentru Congelator
        Object[] congelatoare = new Object[10];
        for (int i = 0; i < congelatoare.length; i++) {
            congelatoare[i] = new Congelator("Brand" + i, "Model" + i, 200 + i * 10, 150 + i * 5, "Electric", 2 + i, 
                                             1500.0 + i * 100, "60x60x" + (120 + i), "Alb", 42 + i, true);
        }

        // lista pentru LadaFrigorifica
        ArrayList<Object> laziFrigorifice = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            laziFrigorifice.add(new LadaFrigorifica("BrandLada" + i, "ModelLada" + i, 300 + i * 20, 180 + i * 10, "Electric", 3 + i, 
                                                    2000.0 + i * 150, "70x70x" + (140 + i), "Argintiu", 50 + i, false));
        }

        // afisare elemente din vectorul de congelatoare
        System.out.println("\nVector Congelatoare:");
        for (Object obj : congelatoare) {
            System.out.println(obj);
        }

        // afisare elemente din lista de lazi frigorifice
        System.out.println("\nLista Lazi Frigorifice:");
        for (Object obj : laziFrigorifice) {
            System.out.println(obj);
        }
    }
}
    

