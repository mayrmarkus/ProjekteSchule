/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tekentante;

import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Markus_Mayr
 */
public class Verkaeufer extends Thread {

    Vector<Kaeufer> queue;
    int num = 0;
    
    public Verkaeufer(Vector v){
		this.queue = v;
	}


    @Override
    public void run() {
        while (true) {
            synchronized (queue) {
                System.out.println("Produced: " + num);
                notify();
            }
            try {
                Thread.sleep((long) (Math.random() * 2000));
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }

    public synchronized void anstellen() {
    	if (num == 99) {
			num = 0;
		}
        num++;
    }
    
    public int getNum(){
    	return num;
    }
    
    public int getQueueSize(){
    	return queue.size();
    }
}
