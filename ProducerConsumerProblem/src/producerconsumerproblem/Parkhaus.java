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
public class Parkhaus {

    private Vector<Auto> parkplaetze;
    private int verbleibende;

    public int getFreiePlätze(){
        return verbleibende;
    }
    
    public Parkhaus(Vector v, int verbleibende) {
        parkplaetze = v;
        this.verbleibende = verbleibende;
    }

    public synchronized void ausgabeFreiePlätze(){
        System.out.println("Es sind noch " + verbleibende + " vorhanden!");
    }
        
    public synchronized void hineinfahren(int nr) {
        if (verbleibende == 0) {
            System.out.println("Auto " + nr + " muss warten");
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Parkhaus.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else
        verbleibende--;
    }

    public synchronized void hinausfahren(int nr) {
        verbleibende++;
        System.out.println("Auto " + nr + " ist rausgefahren");
        notify();
        }
    }