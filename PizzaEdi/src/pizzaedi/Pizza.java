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
    protected ArrayList <String> zutaten = new ArrayList<String>();
    private int standartPreis = 5;
    
    abstract String getBackZeit();

    public int getStandartPreis() {
        return standartPreis;
    }
    
    public String toString(){
        String a = "";
        for (int i = 0; i < zutaten.size(); i++) {
            a = "Zutaten: " + zutaten.get(i);
        }
        return a;
    }
}
