
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Markus_Mayr
 */
public class Timer implements Runnable{

    private int ms = 0;
    private int sekunden = 0;
    private int minuten = 0;
    private TimerGUI gui;
    
    private boolean status = false;
    private boolean reset = false;
    
    public Timer(TimerGUI tgui){
        gui = tgui;
    }
    
    public void reset(){
    	ms = 0;
    	sekunden = 0;
    	minuten = 0;
    }

	@Override
	public void run() {

		while (true) {
			status = gui.getStatus();
			reset = gui.setReset();
				
			if (reset) {
				reset();
                                reset = gui.setFReset();
			}else if(status){

				if (ms == 900) {
					ms = 0;
					sekunden++;
				}
				if (sekunden == 59) {
					sekunden = 0;
					minuten++;
				}
								
				try {
					Thread.sleep(1);
					ms++;
					
				} catch (InterruptedException ex) {
					Logger.getLogger(Timer.class.getName()).log(Level.SEVERE, null, ex);
				}
			}
			gui.setOutput(minuten + "", sekunden + "", ms + "");
		}
    }

    public static void main(String[] args){
        TimerGUI gui = new TimerGUI();
        
        Thread th = new Thread(new Timer(gui));
        th.start();
        gui.setVisible(true);
    }
    
}
