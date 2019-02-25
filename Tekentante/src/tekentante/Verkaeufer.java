/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tekentante;

import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Markus_Mayr
 */
public class Verkaeufer extends Thread {

    Vector<Kaeufer> queue;
    int num = 0;

    @Override
    public void run() {
        while (true) {
            synchronized (queue) {
                System.out.println("Produced: " + num);
                notify();
            }
            try {
                Thread.sleep((long) (Math.random() * 2000));
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }

    public synchronized void hineinfahren() {
        num++;
        System.out.println("Käufer " + num + " muss warten");
        try {
            wait();
        } catch (InterruptedException ex) {
            Logger.getLogger(Verkaeufer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
