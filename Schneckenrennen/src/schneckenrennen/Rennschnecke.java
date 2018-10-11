/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schneckenrennen;

import java.util.Random;

/**
 *
 * @author Markus_Mayr
 */
public class Rennschnecke {
    private String name;
    private String rasse;
    private int maxGesch;
    private double wegDone;

    public String getName() {
        return name;
    }

    public double getWegDone() {
        return wegDone;
    }
    
    public Rennschnecke() {
    }

    public Rennschnecke(String name, String rasse, int maxGesch) {
        this.name = name;
        this.rasse = rasse;
        this.maxGesch = maxGesch;
        this.wegDone = 0;
    }
    
    public void krieche(){
         Random rand = new Random();
         wegDone += rand.nextInt(maxGesch);
    }
    
    public String toString(){
        return "Name: " + name + ", Rasse: " + rasse + ", Maximal Geschwindigkeit: " + maxGesch + ", Zurückgelegter Weg: " + wegDone;
    }
}
