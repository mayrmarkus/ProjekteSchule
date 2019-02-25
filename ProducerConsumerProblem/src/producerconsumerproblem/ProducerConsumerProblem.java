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
public class ProducerConsumerProblem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        Vector v = new Vector();
//        Producer p = new Producer(v);
//        Consumer c = new Consumer(v);
//        
//        p.start();
//        c.start();
        
        Vector<Auto> parkplaetze = new Vector();
        Parkhaus pa = new Parkhaus(parkplaetze, 5);
        ParkplatzZaehler z = new ParkplatzZaehler(pa);
        
        for (int i = 0; i < 50; i++) {
            Auto a = new Auto(parkplaetze, pa);
            a.start();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ProducerConsumerProblem.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
