/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzaedi;

import java.util.ArrayList;

/**
 *
 * @author Markus_Mayr
 */
abstract class Pizza {
    private ArrayList <String> zutaten = new ArrayList<String>();
    private int standartPreis = 5;
    private double zusatzPreis;
    
    public void zutaten(String b){
        zutaten.add(b);
    }
    abstract void setZutaten(String a);
    
    public String toString(){
        return "Zutaten: " + zutaten;
    }
}
