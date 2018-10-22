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
    FM("Frequenzmodulation"),
    AM("Amplitudemodulation");
    
    private String wert;
    
    Band(String wert){
        this.wert = wert;
    }

    public String getWert() {
        return wert;
    }
    
}
