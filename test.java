/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ro.ugal.aciee.echipamentdebucatarie;

/**
 *
 * @author Amalia
 */


public class Test {
    public static void main(String[] args) {
        // crearea instantelor pentru CuptorCuMicrounde
        CuptorcuMicrounde cuptor1 = new CuptorcuMicrounde();
        CuptorcuMicrounde cuptor2 = new CuptorcuMicrounde("Samsung", "MG23K3575AS", 599.99, 24, "Digital", 800, 23, true, "Argintiu");
        CuptorcuMicrounde cuptor3 = new CuptorcuMicrounde(cuptor2); // constructor de copiere

        // crearea instantelor pentru CuptorIncorporabil
        CuptorIncorporat cuptorIncor1 = new CuptorIncorporat();
        CuptorIncorporat cuptorIncor2 = new CuptorIncorporat("Bosch", "HBG634BB1", 1699.99, 36, "Rotativ", 3500, 71, 9, "Otel inoxidabil", true);
        CuptorIncorporat cuptorIncor3 = new CuptorIncorporat(cuptorIncor2); // constructor de copiere

        // afisarea datelor pentru CuptorCuMicrounde
        System.out.println("Cuptor cu microunde 1: " + cuptor1.toString());
        System.out.println("Cuptor cu microunde 2: " + cuptor2.toString());
        System.out.println("Cuptor cu microunde 3 (copiat): " + cuptor3.toString());
        System.out.println();

        // afisarea datelor pentru CuptorIncorporabil
        System.out.println("Cuptor incorporabil 1: " + cuptorIncor1.toString());
        System.out.println("Cuptor incorporabil 2: " + cuptorIncor2.toString());
        System.out.println("Cuptor incorporabil 3 (copiat): " + cuptorIncor3.toString());
        System.out.println();
        
        // crearea unui vector cu 10 instant pentru CuptorcuMicrounde
        CuptorcuMicrounde[] cuptoareMicrounde = new CuptorcuMicrounde[10];
        for (int i = 0; i < cuptoareMicrounde.length; i++) {
            cuptoareMicrounde[i] = new CuptorcuMicrounde(
                "Brand" + i, 
                "Model" + i, 
                500 + i * 50, 
                24 + i, 
                "Digital", 
                800 + i * 10, 
                20 + i, 
                i % 2 == 0, 
                i % 2 == 0 ? "Alb" : "Negru"
            );
        }

        // afisarea instantelor pentru CuptorcuMicrounde
        System.out.println("Instante din clasa CuptorcuMicrounde:");
        for (CuptorcuMicrounde cuptor : cuptoareMicrounde) {
            System.out.println(cuptor);
        }
        System.out.println();

        // Crearea unui vector cu 10 instanțe pentru CuptorIncorporat
        CuptorIncorporat[] cuptoareIncorporate = new CuptorIncorporat[10];
        for (int i = 0; i < cuptoareIncorporate.length; i++) {
            cuptoareIncorporate[i] = new CuptorIncorporat(
                "Brand" + i, 
                "Model" + (10 + i), 
                1500 + i * 100, 
                36 - i, 
                "Mecanic", 
                3000 + i * 50, 
                50 + i, 
                5 + i, 
                i % 2 == 0 ? "Otel inoxidabil" : "Email", 
                i % 2 != 0
            );
        }

        // Afisarea instantelor pentru CuptorIncorporat
        System.out.println("Instante din clasa CuptorIncorporat:");
        for (CuptorIncorporat cuptor : cuptoareIncorporate) {
            System.out.println(cuptor);
        }

        
        // aplicarea conditiilor și afișarea pentru CuptorcuMicrounde
        System.out.println("Cuptoare cu microunde care respecta conditiile (putere > 850 si grill == true):");
        for (CuptorcuMicrounde cuptor : cuptoareMicrounde) {
            if (cuptor.getPutere() > 850 && cuptor.isGrill()) {
                System.out.println(cuptor);
            }
        }
        

        // aplicarea conditiilor si afisarea pentru CuptorIncorporat
        System.out.println("Cuptoare incorporate care respecta conditiile (volum > 60 si iluminare == true):");
        for (CuptorIncorporat cuptor : cuptoareIncorporate) {
            if (cuptor.getVolum() > 55 && cuptor.isIluminare()) {
                System.out.println(cuptor);
            }
        }
        
        
    }
}
