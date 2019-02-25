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
public class Kaeufer extends Thread {

    Vector<Kaeufer> queue;
    int num = 0;

    @Override
    public void run() {
        while (true) {
            synchronized (queue) {
                if (queue.size() > 0) {
                    queue.add(this);
                    System.out.println("Consumed: " + num + " Warten: " + queue.size());
                    try {
                        Thread.sleep((long) (Math.random() * 5000));
                    } catch (InterruptedException ex) {

                    }
                } else {
                    try {
                        wait();
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Kaeufer.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
    }
}
