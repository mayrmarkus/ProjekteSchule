/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package producerconsumerproblem;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Markus_Mayr
 */
public class ParkplatzZaehler extends Thread{
    private Parkhaus parkhaus;
    
    public ParkplatzZaehler(Parkhaus parkhaus){
        this.parkhaus = parkhaus;
        start();
    }
    
    public void run(){
        while (true) {            
            try {
                Thread.sleep((int) (2000));
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            parkhaus.ausgabeFreiePlätze();
        }
    }
}
