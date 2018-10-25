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
public class PizzaMargerita extends Pizza {
    
    private String groesse;

    public void setGroesse(String groesse) {
        groesse.toLowerCase();
        if (groesse.equals("klein") || groesse.equals("mittel") || groesse.equals("groß")) {
            this.groesse = groesse;
        }else
            System.out.println(groesse + " ist kein von uns verwendetes Größenmaß ");   
    }

    @Override
    void setZutaten(String a) {
        zutaten(a);
    }
}
