/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bouncingballadvanced;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Administrator
 */
public class BallCage {
    
    
   int width, height; 
   private Color colorFilled;   
   private Color colorBorder;   

    public BallCage(int width, int height, Color colorFilled, Color colorBorder) {
        this.width = width;
        this.height = height;
        this.colorFilled = colorFilled;
        this.colorBorder = colorBorder;
    }
   
   public void draw(Graphics g) {
      g.setColor(colorFilled);
      g.fillRect(1, 1, width-1, height-1);
      
      g.setColor(colorBorder);
      g.drawRect(1, 1, width-1, height-1);
      
   }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
   
   
}
