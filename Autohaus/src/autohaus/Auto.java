/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autohaus;

/**
 *
 * @author Markus_Mayr
 */
public class Auto {
    private String hersteller;
    private long laufleistung;
    private double preis;
    private String farbe;
    private boolean unfallwagen;
    private String kraftstoff;
    private double leistung;

    public double getPreis() {
        return preis;
    }
    
    public Auto(String hersteller, long laufleistung, double preis, String farbe, boolean unfallwagen, String kraftstoff, double leistung) {
        this.hersteller = hersteller;
        this.laufleistung = laufleistung;
        this.preis = preis;
        this.farbe = farbe;
        this.unfallwagen = unfallwagen;
        this.kraftstoff = kraftstoff;
        this.leistung = leistung;
    }

    public Auto() {
    }
    
    @Override
    public String toString(){
        if(unfallwagen)
            return "Hersteller: " + hersteller +"\nPreis: " + preis + " EUR\nMotor: " + 
               leistung + "PS (" + kraftstoff + ")\nKM-Stand: " + laufleistung + " km\nFarbe: " +
                farbe + "\n";
        else
            return "Hersteller: " + hersteller +"\nPreis: " + preis + " EUR\nMotor: " + 
               leistung + "PS (" + kraftstoff + ")\nKM-Stand: " + laufleistung + " km\nFarbe: " +
                farbe + "\nUnfallfrei\n";
    }
}
