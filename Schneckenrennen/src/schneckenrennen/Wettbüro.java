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

    public double quoteBerechnen() {
        for (int i = 0; i < race.getTeilnehmerliste().size(); i++) {
            if (race.getTeilnehmerliste().get(i).getName().equals(wettenReceived.get(i).getGewettetSchnecke().getName())) {
                quote = 10 / race.getTeilnehmerliste().get(i).getMaxGesch();
                quote += wettenReceived.get(i).getBetrag();
            }
        }
        return quote;
    }

    public void wetteAnnehmen(Rennschnecke schneckenNamen, double wettEinsatz, String spieler) {
        Wette w = new Wette();
        w.setBetrag(wettEinsatz);
        w.setGewettetSchnecke(schneckenNamen);
        w.setSpieler(spieler);
        wettenReceived.add(w);
    }

    @Override
    public String toString() {
        String temp = "";
        for (int i = 0; i < wettenReceived.size(); i++) {
            temp += "Spieler: " + wettenReceived.get(i).getSpieler() + ", Schneckennamen: "
                    + wettenReceived.get(i).getGewettetSchnecke().getName() + ", Wetteinsatz: "
                    + wettenReceived.get(i).getBetrag() + "€\n";
        }
        return temp + "\n";
    }
    
    
    
    public void rennenDurchfuehren() {
        if (race.durchführen()) {
            for (int i = 0; i <= race.getTeilnehmerliste().size(); i++) {
                if (race.getTeilnehmerliste().get(i) == race.getGewinner()) {
                    for (int j = 0; j <= wettenReceived.size(); j++) {
                        if (wettenReceived.get(i).getGewettetSchnecke().getName() == race.getGewinner().getName() ) {
                            quoteBerechnen(wettenReceived.get(i).getBetrag());
                        }
                    }
//                    }
//                    System.out.println(wettenReceived.get(i).getBetrag());
//                }
            }                
            }
        }
    }
}
