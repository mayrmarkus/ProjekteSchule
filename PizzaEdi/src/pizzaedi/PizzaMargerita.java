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
                break;
            case "mittel": a = Groesse.mittel.wert();
                break;
            case "gross": a = Groesse.gross.wert();
                break;
        }
        return (getStandartPreis() + preis) * a;
    }
    
    public PizzaMargerita(String groesse) {
        setGroesse(groesse);
        setZutaten();
    }

    public void setGroesse(String groesse) {
        groesse.toLowerCase();
        if (groesse.equals("klein") || groesse.equals("mittel") || groesse.equals("gross")) {
            this.groesse = groesse;
        }else
            System.out.println(groesse + " ist kein von uns verwendetes Größenmaß ");   
    }
    
    private void setZutaten() {
        zutaten.add("Tomatensose");
        zutaten.add("Mozzarella");
    }
    
    @Override
    public String toString(){
        String a = "Zutaten: ";
        for (int i = 0; i < zutaten.size(); i++) {
            if (zutaten.size()-1 == i) {
                a += zutaten.get(i) + " ";
            }else
                a += zutaten.get(i) + ", ";
        }
        return  "Margerita: " + a + "Preis: " + getPreis() + "€" + getBackZeit();
    }

    @Override
    String getBackZeit() {
        return "\nMargarita benötigt: 5 Minuten";
    }
}
