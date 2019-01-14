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
    private int currentDirection = 1;

    public Shooter(int x, int y, int speedX, int width, int height, Color color) {
        this.x = x;
        this.y = y;
        this.speedX = speedX;
        this.width = width;
        this.height = height;
        this.color = color;
    }


    public void move(BallCage cage, int direction) {
        if(direction != currentDirection){
            speedX = -speedX;
            currentDirection = direction;
        }
        this.x += this.speedX;
        
        if (x < 1) {
            x = 1;
        } else if (x > cage.getWidth()-width) {
            x = cage.getWidth()-width;
        }
    }

    public void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(x, y, width, height);
    }

    void shoot(BallWorld a) {
        
    }
}
