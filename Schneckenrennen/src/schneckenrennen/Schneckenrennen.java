/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schneckenrennen;

/**
 *
 * @author Markus_Mayr
 */
public class Schneckenrennen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rennschnecke a1 = new Rennschnecke("Hallo", "Schwarz", 10);
        Rennschnecke a2 = new Rennschnecke("HI", "Schwarz", 15);
        Rennschnecke a3 = new Rennschnecke("Morgen", "Weiss", 5);
        Rennen b = new Rennen("Sepp", 20, 2);
        b.addRennschnecke(a1);
        b.addRennschnecke(a2);
        b.addRennschnecke(a3);
        
        System.out.println(b.toString());
        b.durchführen();
    }
}
