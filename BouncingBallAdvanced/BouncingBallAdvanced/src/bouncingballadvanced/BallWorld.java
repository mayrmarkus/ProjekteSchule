/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bouncingballadvanced;

import java.awt.BorderLayout;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JFrame;

/**
 *
 * @author Administrator
 */
public class BallWorld extends JFrame{
    
    
    private BallCage cage;
    private DrawPanel panel;
    private ArrayList<Ball> baelle;
    
    public BallWorld(int h, int w){
        
        this.setSize(h,w);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        cage = new BallCage(h, w, Color.BLACK, Color.orange);
        panel = new DrawPanel(w, h, cage);
        
        this.setLayout(new BorderLayout());
        this.add(panel, BorderLayout.CENTER);
        
        Ball b1 = new Ball(5, 5, 5, 5, 5, Color.yellow);
        baelle.add(b1);
        panel.addBall(b1);
        
        Ball b2 = new Ball(50, 5, 5, 5, 8, Color.blue);
        baelle.add(b2);
        panel.addBall(b2);
        
        Ball b3 = new Ball(75, 75, 5, 5, 7, Color.orange);
        baelle.add(b3);
        panel.addBall(b3);
    
    }
    
    
    public void gameStart() {
        Thread gamethread = new Thread(){
        
        public void run() {
            while(true){
                gameUpdate();
                
                repaint();
                
                try{
                    Thread.sleep(1000/50);
                } catch(InterruptedException ex) {
                    
                }
            }
        }
        };
        
        gamethread.start();

    }
                
                
    public void gameUpdate() {
    
        for(int i=0;i<baelle.size();i++){
             baelle.get(i).move(cage);
         }
    
    }
}
