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
 * @author Markus_Mayr
 */
public class Shooter {
    private int x, y;
    private int speedX;
    private int width, height;
    private Color color;

    public Shooter(int x, int y, int speedX, int width, int height, Color color) {
        this.x = x;
        this.y = y;
        this.speedX = speedX;
        this.width = width;
        this.height = height;
        this.color = color;
    }


    public void move(BallCage cage) {
        this.x += this.speedX; 
        
        if (x < 1) {
            speedX = -speedX; // Reflect along normal
            x = 1;     // Re-position the ball at the edge
        } else if (x > cage.getWidth()-width) {
            speedX = -speedX;
            x = cage.getWidth()-width;
        }
    }

    public void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(x, y, width, height);
    }
}
