/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bouncingballadvanced;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import sun.awt.image.ImageAccessException;

/**
 *
 * @author Markus_Mayr
 */
public class Image implements Shape{

    private int x, y;
    private int speedX, speedY;
    BufferedImage img = null;

    public Image(int x, int y, int speedX, int speedY) {
        this.x = x;
        this.y = y;
        this.speedX = speedX;
        this.speedY = speedY;
        
        try {
        img = ImageIO.read(new File("Twitter.png"));
        } catch (IOException e) {
        }   
    }
    
    
    @Override
    public void move(BallCage cage) {
        this.x += this.speedX;
        this.y += this.speedY;   
        
        if (x < 1) {
            speedX = -speedX; // Reflect along normal
            x = 1;     // Re-position the ball at the edge
        } else if (x > cage.getWidth()-img.getWidth()) {
            speedX = -speedX;
            x = cage.getWidth()-img.getWidth();
        }
      // May cross both x and y bounds
        if (y < 1) {
            speedY = -speedY;
            y = 1;
        } else if (y > cage.getHeight()-img.getHeight()-150) {
            speedY = -speedY;
            y = cage.getHeight()-img.getHeight()-150;
        }
    }

    @Override
    public void draw(Graphics g) {
        g.drawImage(img, x, y, null);
    }
    
}
