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
    private double preis = 1;
    
    public double getPreis(){
        double a = 0;
        switch(groesse){
            case "klein": a = Groesse.klein.wert();
            case "mittel": a = Groesse.mittel.wert();
            case "gross": a = Groesse.gross.wert();
        }
        return (getStandartPreis() + preis) * a;
    }
    
    public PizzaMargerita(String groesse) {
        this.groesse = groesse;
        setZutaten();
    }

    public void setGroesse(String groesse) {
        groesse.toLowerCase();
        if (groesse.equals("klein") || groesse.equals("mittel") || groesse.equals("groß")) {
            this.groesse = groesse;
        }else
            System.out.println(groesse + " ist kein von uns verwendetes Größenmaß ");   
    }
    
    private void setZutaten() {
        zutaten.add("Tomatensose");
        zutaten.add("Mozzarella");
    }
}
