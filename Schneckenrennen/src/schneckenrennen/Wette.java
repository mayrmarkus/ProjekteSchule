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
    private Rennschnecke gewettetSchnecke;

    public void setSpieler(String spieler) {
        this.spieler = spieler;
    }

    public void setBetrag(double betrag) {
        this.betrag = betrag;
    }

    public void setGewettetSchnecke(Rennschnecke gewSchnecke) {
        this.gewettetSchnecke = gewSchnecke;
    }
    
    public Rennschnecke getGewettetSchnecke() {
        return gewettetSchnecke;
    }

    public String getSpieler() {
        return spieler;
    }

    public double getBetrag() {
        return betrag;
    }
}
