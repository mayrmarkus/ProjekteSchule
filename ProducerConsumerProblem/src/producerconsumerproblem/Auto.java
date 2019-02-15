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
public class Auto extends Thread {

    private static int nr = 0;

    private Vector<Auto> parklaetze;
    private Parkhaus garage;
    private int meineNr = 0;
    private boolean rausgefahren = false;

    public Auto(Vector<Auto> parkplaetze, Parkhaus garage) {
        this.parklaetze = parkplaetze;
        this.garage = garage;

        nr++;
        meineNr = nr;
    }

    public void run() {
        while (!rausgefahren) {
            if (garage.getFreiePlätze() > 0) {
                garage.hineinfahren();
                parklaetze.add(this);
                System.out.println("Auto " + meineNr + " ist eingefahren");
                boolean geparkt = true;
                while (geparkt) {
                    try {
                        Thread.sleep((long) (Math.random() * 20000 + 2000));
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Auto.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    geparkt = false;
                }
                parklaetze.remove(this);
                garage.hinausfahren();
                System.out.println("Auto " + meineNr + " ist rausgefahren");
                rausgefahren = true;
            } else {
                try {
                    //            try {
//                wait();
//            } catch (InterruptedException ex) {
//                Logger.getLogger(Auto.class.getName()).log(Level.SEVERE, null, ex);
//            }
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Auto.class.getName()).log(Level.SEVERE, null, ex);
                }
                System.out.println("Auto " + meineNr + " wartet");
            }
        }
    }
}
