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
public class Consumer extends Thread {

    Vector products;

    public Consumer(Vector v) {
        products = v;
    }

    public void run() {

        while (true) {
            synchronized (products) {
                if (products.size() > 0) {
                    String s = (String) products.remove(0);
                    System.out.println("Consumed: " + s + " Verbleibend: " + products.size());
                    try {
                        Thread.sleep((long) (Math.random() * 5000));
                    } catch (InterruptedException ex) {
                        
                    }
                } else {
                    try {
                        wait();
                    } catch (InterruptedException ex) {
                        
                    }
                }
            }
        }
    }
}
