/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kurzwellenübertragungsgerät;

/**
 *
 * @author Markus_Mayr
 */
public enum Band {    
    FM(1),
    AM(2);
    
    private double wert;
    
    Band(double wert){
        this.wert = wert;
    }

    public double getWert() {
        return wert;
    }
    
}
