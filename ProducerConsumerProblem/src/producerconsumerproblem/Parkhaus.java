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
public class Parkhaus extends Thread{
    
    Vector parkplaetze;
    private int verbleibende;
    
    public Parkhaus(Vector v){
        
    }
    
    public void run(){
        
    }
    
    public void hineinfahren(){
        verbleibende--;
    }
    
    public void hinausfahren(){
        verbleibende++;
    }
}
