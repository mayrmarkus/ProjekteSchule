/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bouncingballadvanced;

/**
 *
 * @author Administrator
 */
public class BouncingBallAdvanced {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    	BallWorld bw = new BallWorld(1000,1000);
    	bw.pack();
    	bw.setVisible(true);
    	bw.gameStart();
    	
    }
    
}
