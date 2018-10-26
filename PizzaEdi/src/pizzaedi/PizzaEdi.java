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
public class PizzaEdi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Pizza> pizzas = new ArrayList<Pizza>();
        
        PizzaMargerita m = new PizzaMargerita("mittel");
        PizzaNapolitana n = new PizzaNapolitana("gross");
        
        pizzas.add(m);
        pizzas.add(n);
        
        bestellung(pizzas);
    }

    private static void bestellung(ArrayList<Pizza> pizzas) {
        for (int i = 0; i < pizzas.size(); i++) {
            System.out.println(pizzas.get(i).toString());
        }
    }
}