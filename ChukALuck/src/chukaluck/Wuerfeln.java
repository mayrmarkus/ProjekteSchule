/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chukaluck;

import java.util.Random;

/**
 *
 * @author Markus_Mayr
 */
public class Wuerfeln {
     
    private int[] wuerfel = new int[3];
    private int summe;
    
    public int[] getWuerfel() {
        return wuerfel;
    }

    public int getSumme() {
        return wuerfel[0] + wuerfel[1] + wuerfel[2];
    }
    
    public void wuerfeln(){
        Random rand = new Random();
        for (int i = 0; i < 3; i++) {
            wuerfel[i] = rand.nextInt(6) + 1;
        }
    }
}
