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
            if (race.getTeilnehmerliste().get(i).getName().equals(wettenReceived.get(i).getGewettetSchnecke().getName())) {
                quote = 10/race.getTeilnehmerliste().get(i).getMaxGesch();
            }
        }
    }
    
    public void wetteAnehmen(Rennschnecke schneckenNamen, double wettEinsatz, String spieler){
        Wette w = new Wette();
        w.setBetrag(wettEinsatz);
        w.setGewettetSchnecke(schneckenNamen);
        w.setSpieler(spieler);
        wettenReceived.add(w);
    }
    
    @Override
    public String toString(){
        String temp = "";
        for (int i = 0; i < wettenReceived.size(); i++) {
            temp += "Spieler: " + wettenReceived.get(i).getSpieler() + ", Schneckennamen: " + 
                    wettenReceived.get(i).getGewettetSchnecke().getName() + ", Wetteinsatz: " + 
                    wettenReceived.get(i).getBetrag() + "€";
        }
        return temp + "\n";
    }
    
    public void rennenDurchfueren(){
        
    }
}
