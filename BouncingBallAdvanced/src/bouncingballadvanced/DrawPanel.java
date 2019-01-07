/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bouncingballadvanced;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author Administrator
 */
public class DrawPanel extends JPanel{
    private int panelWidth;
    private int panelHeight;
    
    private ArrayList<Ball> baelle;
    private BallCage cage;
    
    public DrawPanel(int w, int h, BallCage cage){
    
        panelHeight = h;
        panelWidth = w;
        this.cage = cage;
        baelle = new ArrayList();
    }
    
    public void addBall(Ball b){
    
        baelle.add(b);
    }
    
    @Override
    public void paintComponent(Graphics g) {
         super.paintComponent(g);    // Paint background
         // Draw the box and the ball
         cage.draw(g);
         for(int i=0;i<baelle.size();i++){
             baelle.get(i).draw(g);
         }
    }
  
      /** Called back to get the preferred size of the component. */
    @Override
    public Dimension getPreferredSize() {
         return (new Dimension(panelWidth, panelHeight));
    }
}
