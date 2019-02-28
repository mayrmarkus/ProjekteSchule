/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermarktv2;

/**
 *
 * @author Markus_Mayr
 */
public class Kunde {
    
    private static int kNr = 1;
    private int nummer;
    
    public Kunde(){
        nummer = kNr;
        kNr++;
    }
    
    public int getNummer(){
        return nummer;
    }
}
