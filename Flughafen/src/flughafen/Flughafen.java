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
public class Flughafen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Flugzeug f = new Flugzeug("Hallo", 564, 56, "54") {
            @Override
            public boolean getLooping() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        
        Doppeldecker d = new Doppeldecker("Messerschmitt", 57465415, 5, "564");
        d.getLooping();
        Verkehrsflugzeug v = new Verkehrsflugzeug("Boing", 30000, 0, "747", 0);
    }
    
}
