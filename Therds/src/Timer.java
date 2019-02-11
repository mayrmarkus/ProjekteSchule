
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
    
    public Timer(TimerGUI tgui){
        gui = tgui;
    }
    
    @Override
    public void run() {
        while (true) { 
            
            if (ms == 999) {
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
                
                gui.setOutput(minuten+"", sekunden+"", ms+"");
            } catch (InterruptedException ex) {
                Logger.getLogger(Timer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public static void main(String[] args){
        TimerGUI gui = new TimerGUI();
        
        Thread th = new Thread(new Timer(gui));
        th.start();
        gui.setVisible(true);
    }
    
}
