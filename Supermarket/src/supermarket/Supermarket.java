/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermarket;

import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Markus_Mayr
 */
public class Supermarket {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vector<Kunde> warteschlange = new Vector<>();
        Verkauferin v1 = new Verkauferin(warteschlange);
        Verkauferin v2 = new Verkauferin(warteschlange);
        v1.start();
        v2.start();
        
        for (int i = 0; i < 50; i++) {
            Kunde k = new Kunde();
            synchronized(warteschlange){
                warteschlange.add(k);
                warteschlange.notify();
                System.out.println("Kunde " + k.getNummer() + " zieht Nummer!");
            }
            try {
                Thread.sleep((long) (Math.random()*1000+500));
            } catch (InterruptedException ex) {
                Logger.getLogger(Supermarket.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
