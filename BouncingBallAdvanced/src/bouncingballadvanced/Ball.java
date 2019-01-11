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
public class Ball implements Shape{
 
    
   int x, y;           // Ball's center x and y (package access)
   int speedX, speedY; // Ball's speed per step in x and y (package access)
   int radius;         // Ball's radius (package access)
   private Color color; 

    public Ball(int x, int y, int speedX, int speedY, int radius, Color color) {
        this.x = x;
        this.y = y;
        this.speedX = speedX;
        this.speedY = speedY;
        this.radius = radius;
        this.color = color;
    }
    
    @Override
    public void draw(Graphics g) {
      g.setColor(color);
      g.fillOval((x - radius), (y - radius), (2 * radius), (2 * radius));
    }
   
    @Override
    public void move(BallCage cage){
    
        this.x += this.speedX;
        this.y += this.speedY;   
        
        if (x < radius) {
            speedX = -speedX; // Reflect along normal
            x = radius;     // Re-position the ball at the edge
        } else if (x > cage.getWidth()-radius) {
            speedX = -speedX;
            x = cage.getWidth()-radius;
        }
      // May cross both x and y bounds
        if (y < radius) {
            speedY = -speedY;
            y = radius;
        } else if (y > cage.getHeight()-radius-150) {
            speedY = -speedY;
            y = cage.getHeight()-radius-150;
        }
    
    }
    
}
