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
public class Verkauferin extends Thread{
    
    private Vector<Kunde> warteschlange;
    
    public Verkauferin(Vector<Kunde> v){
        this.warteschlange = v;
        
    }
    
    public void run(){
        while (true) {            
            synchronized(warteschlange){
                while(warteschlange.size() == 0){
                    try {
                        warteschlange.wait();
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                }
                Kunde k = warteschlange.remove(0);
                System.out.println("Kunde " + k.getNummer() + " wird bedient!");
            }
            try {
                Thread.sleep((long) (Math.random()*5000+500));
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}
