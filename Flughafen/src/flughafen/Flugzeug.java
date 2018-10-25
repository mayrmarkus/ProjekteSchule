/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flughafen;

/**
 *
 * @author Markus_Mayr
 */
abstract class Flugzeug {

    private String hersteller; // Herstellername
    private int maxSpeed; // Max. Geschwindigkeit
    private String immatNummer; // Immatrikulationsnummer
    private int anzahlFluegel = 1; // Anzahl Flügelpaare

    public Flugzeug(String hersteller, int maxSpeed, int anzahlFluegel, String immatNummer) {
        this.hersteller = hersteller;
        this.maxSpeed = maxSpeed;
        this.anzahlFluegel = anzahlFluegel;
        this.immatNummer = immatNummer;
    }

    public String getImmatNummer() {
        return immatNummer;
    }

    protected void setImmatNummer(String immatNummer) {
        this.immatNummer = immatNummer;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    abstract public boolean getLooping();
// weiter
}