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
public class Producer extends Thread{
    
    Vector products;
    
    public Producer(Vector v){
        products = v;
    }
    
    public void run(){
        String s;
        while(true){
            synchronized(products){
            s = "Wert " + Math.random()*1000;
            System.out.println("Produced: " + s);
            products.add(s);
            notify();
            }
            try {
                Thread.sleep((long) (Math.random()*2000));
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
        
    }
}
