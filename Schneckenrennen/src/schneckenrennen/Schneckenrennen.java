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
        
        Rennen r = new Rennen("Sepp", 200, 2);
        r.addRennschnecke(a1);
        r.addRennschnecke(a2);

        
        Wettbüro w = new Wettbüro();
        w.wetteAnnehmen(a2, 20, "Tutzer");

        
        
        System.out.println(r.toString());
        System.out.println(w.toString());
        
        r.durchführen();
        System.out.println(r.ermittleGewinner());
    }
}
