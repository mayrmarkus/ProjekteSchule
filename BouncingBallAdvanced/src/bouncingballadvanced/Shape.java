/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bouncingballadvanced;

import java.awt.Graphics;

/**
 *
 * @author Markus_Mayr
 */
public interface Shape {
    public void move(BallCage cage);
    public void draw(Graphics g);
}
