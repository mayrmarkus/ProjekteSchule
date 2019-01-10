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
    
    private ArrayList<Shape> shapes;
    private BallCage cage;
    
    public DrawPanel(int w, int h, BallCage cage){
    
        panelHeight = h;
        panelWidth = w;
        this.cage = cage;
        shapes = new ArrayList();
    }
    
    public void addShape(Shape b){
    
        shapes.add(b);
    }
    
    public void removeBall(Shape i){
        shapes.remove(i);
    }
    
    @Override
    public void paintComponent(Graphics g) {
         super.paintComponent(g);    // Paint background
         // Draw the box and the ball
         cage.draw(g);
         for(int i=0;i<shapes.size();i++){
             shapes.get(i).draw(g);
         }
    }
  
      /** Called back to get the preferred size of the component. */
    @Override
    public Dimension getPreferredSize() {
         return (new Dimension(panelWidth, panelHeight));
    }
}
