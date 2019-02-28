/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermarktv2;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Markus_Mayr
 */
public class Verkauferin extends Thread{
    private SupermarktV2 markt;
    
    public Verkauferin(SupermarktV2 m){
        markt = m;
    }
    
    public void run(){
        while (true) {
        markt.serveKunde();
        
        try {
            Thread.sleep((long) (Math.random()*5000+500));
        } catch (InterruptedException ex) {
            Logger.getLogger(Verkauferin.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }
}
