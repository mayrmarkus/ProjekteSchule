/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tekentante;

import java.util.Vector;

/**
 *
 * @author Markus_Mayr
 */
public class Tekentante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GUI gui = new GUI();
        gui.setVisible(true);
        
        Vector<Kaeufer> queue;
    	queue = new Vector<>();
    	
    	Verkaeufer v = new Verkaeufer(queue);
        v.start();

        for(int i = 10; i > 0; i++){
        	Kaeufer k = new Kaeufer(queue);
            k.start();
            try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
        }
    }

}
