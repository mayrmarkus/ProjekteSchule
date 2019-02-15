/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package producerconsumerproblem;

import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Markus_Mayr
 */
public class Parkhaus extends Thread {

    private Vector<Auto> parkplaetze;
    private int verbleibende;

    public int getFreiePlätze(){
        return verbleibende;
    }
    
    public Parkhaus(Vector v, int verbleibende) {
        parkplaetze = v;
        this.verbleibende = verbleibende;
    }

    public void run() {
        while (true) {            
            System.out.println("Es sind noch " + verbleibende + " vorhanden!");
            try {
                Thread.sleep(10000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Parkhaus.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
        
    public void hineinfahren() {
        verbleibende--;
        //notify();
    }

    public void hinausfahren() {
        verbleibende++;
    }
}
