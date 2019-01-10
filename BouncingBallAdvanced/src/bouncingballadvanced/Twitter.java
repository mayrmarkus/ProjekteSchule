/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bouncingballadvanced;

import java.awt.Color;
import java.awt.Graphics;
import javax.imageio.ImageIO;

/**
 *
 * @author Markus_Mayr
 */
public class Twitter implements Shape{

    private int x, y;
    private int speedX, speedY;

    public Twitter(int x, int y, int speedX, int speedY) {
        this.x = x;
        this.y = y;
        this.speedX = speedX;
        this.speedY = speedY;
    }
    
    
    @Override
    public void move(BallCage cage) {
        this.x += this.speedX;
        this.y += this.speedY;   
        
        if (x < 1) {
            speedX = -speedX; // Reflect along normal
            x = 1;     // Re-position the ball at the edge
        } else if (x > cage.getWidth()-width) {
            speedX = -speedX;
            x = cage.getWidth()-width;
        }
      // May cross both x and y bounds
        if (y < 1) {
            speedY = -speedY;
            y = 1;
        } else if (y > cage.getHeight()-height) {
            speedY = -speedY;
            y = cage.getHeight()-height;
        }
    }

    @Override
    public void draw(Graphics g) {
        
        
        img = new img(ImageIO.read(https://cdn1.iconfinder.com/data/icons/ninja-things-1/1772/ninja-simple-512.png));
        g.drawImage(img, x, y, null);
    }
    
}
