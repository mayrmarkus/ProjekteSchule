/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzaedi;

/**
 *
 * @author Markus_Mayr
 */
public enum Groesse {
    klein(0.8),
    mittel(1),
    gross(1.5);
    
    
    private double wert;
    
    Groesse(double wert){
        this.wert = wert;
    }
    
    public double wert(){
        return wert;
    }
}
