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
public final class Doppeldecker extends Flugzeug {

    final private int anzahlFluegel = 2;
    private int loopingspeed = 320;
    private boolean offenescockpit;

    public boolean isOffenescockpit() {
        return offenescockpit;
    }

    public Doppeldecker(boolean offenescockpit, String hersteller, int maxSpeed, int anzahlFluegel, String immatNummer) {
        super(hersteller, maxSpeed, anzahlFluegel, immatNummer);
        this.offenescockpit = offenescockpit;
    }
    
    public Doppeldecker(String hersteller, int maxSpeed, int anzahlFluegel, String immatNummer) {
        super(hersteller, maxSpeed, anzahlFluegel, immatNummer);
        this.offenescockpit = true;
    }

    @Override
    public boolean getLooping() {
        return getMaxSpeed() > loopingspeed;
    }
}
