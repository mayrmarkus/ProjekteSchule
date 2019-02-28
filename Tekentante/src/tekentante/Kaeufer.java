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
public class Kaeufer extends Thread {

	Vector<Kaeufer> queue;
	Verkaeufer ver;
	int num = 0;
	
	public Kaeufer(Vector v){
		this.queue = v;
	}

	@Override
	public void run() {
		while (true) {
				if (queue.size() >= 0) {
					ver.anstellen();
					queue.add(this);
					System.out.println("Nummer: " + num + " Warten: " + queue.size());
					try {
						Thread.sleep((long) (Math.random() * 5000));
					} catch (InterruptedException ex) {
					}
				} else {
					try {
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				
			}
		}
	}
}
