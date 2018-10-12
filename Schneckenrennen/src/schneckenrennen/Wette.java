/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schneckenrennen;

/**
 *
 * @author Markus_Mayr
 */
public class Wette {
    private String spieler;
    private double betrag;
    private Rennschnecke gewSchnecke;

    public void setSpieler(String spieler) {
        this.spieler = spieler;
    }

    public void setBetrag(double betrag) {
        this.betrag = betrag;
    }

    public void setGewSchnecke(Rennschnecke gewSchnecke) {
        this.gewSchnecke = gewSchnecke;
    }
    
    public Rennschnecke getGewSchnecke() {
        return gewSchnecke;
    }
}
