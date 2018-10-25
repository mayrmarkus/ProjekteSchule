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
public class Verkehrsflugzeug extends Flugzeug {

    private int anzahlFluegel = 1;
    private int passagiere;
    
    public Verkehrsflugzeug(String hersteller, int maxSpeed, int anzahlFluegel, String immatnummer, int passagiere) {
        super(hersteller, maxSpeed, anzahlFluegel, immatnummer);
        this.passagiere = passagiere;
    }

    @Override
    public boolean getLooping() {
        return false;
    }
    
}
