/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package producerconsumerproblem;

import java.util.Vector;

/**
 *
 * @author Markus_Mayr
 */
public class ProducerConsumerProblem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Vector v = new Vector();
        Producer p = new Producer(v);
        Consumer c = new Consumer(v);
        
        p.start();
        c.start();
    }
    
}
