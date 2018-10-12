/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schneckenrennen;

import java.util.ArrayList;

/**
 *
 * @author Markus_Mayr
 */
public class Wettbüro {
    private double quote;
    private ArrayList<Wette> wettenReceived = new ArrayList<Wette>();
    Rennen race = new Rennen();
    
    public void quoteBerechnen(){    
        for (int i = 0; i < race.getTeilnehmerliste().size(); i++) {
            if (race.getTeilnehmerliste().get(i).getName().equals(wettenReceived.get(i).getGewSchnecke().getName())) {
                quote = 10/race.getTeilnehmerliste().get(i).getMaxGesch();
            }
        }
    }
    
    public void wetteAnehmen(String schneckenNamen, double wettEinsatz, String spieler){
        for (int i = 0; i < wettenReceived.size(); i++) {
            wettenReceived.get(i).setBetrag(wettEinsatz);
            wettenReceived.get(i).setGewSchnecke(schneckenNamen);
        }
    }
}
