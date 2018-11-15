/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chukaluck;

/**
 *
 * @author Markus_Mayr
 */
public class Wetten {
    Spielfeld s = new Spielfeld();
    private int[] wuerfel = new int[3];
    Wuerfeln w = new Wuerfeln();
    
    private double konto;
    private double gewinn = 0;
    
    private void setWuerfel(){
        wuerfel = w.getWuerfel();
    }

    public Wetten() {
    
    }
    
    private void wNrGew(){
        int counter = 0;
        for (int i = 0; i < 6; i++){
        }
        if (counter == 3) 
            gewinn += konto*10;
        else
            gewinn += konto*counter;
    }
}
