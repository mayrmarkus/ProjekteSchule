/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermarktv2;

import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Markus_Mayr
 */
public class SupermarktV2 {

    /**
     * @param args the command line arguments
     */
    
    private Vector<Kunde> warteschlange;
    
    public SupermarktV2(){
        warteschlange = new Vector<>();
    }
    
    public synchronized void addKunde(Kunde k){
        warteschlange.add(k);
        System.out.println("Kunde " + k.getNummer() + " zieht Nummer!");
        notify();
    }
    
    public synchronized void serveKunde(){
        while(warteschlange.size() == 0){
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(SupermarktV2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        Kunde k = warteschlange.remove(0);
        System.out.println("Kunde " + k.getNummer() + " wird bedient!");
    }
            
    public static void main(String[] args) {
        SupermarktV2 markt = new SupermarktV2();
        
        Vector<Kunde> warteschlange = new Vector<>();
        Verkauferin v1 = new Verkauferin(markt);
        Verkauferin v2 = new Verkauferin(markt);
        v1.start();
        v2.start();
        
        for (int i = 0; i < 50; i++) {
            Kunde k = new Kunde();
            markt.addKunde(k);
            try {
                Thread.sleep((long) (Math.random()*1000+500));
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
        }
    }
