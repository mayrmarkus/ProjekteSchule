/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4gewinnt;

import java.awt.Color;
import javax.swing.JLabel;

/**
 *
 * @author Markus_Mayr
 */
public class VierGewinntLabel extends JLabel{

    private int posX = 0;
    private int posY = 0;
    private boolean isOwned = false;
    
    public void setPlayerColor(boolean p){
        if (p) {
            this.setBackground(Color.red);
        }else
            this.setBackground(Color.green);
    }

    public VierGewinntLabel(int x, int y) {
        this.posX = x;
        this.posY = y;
    }


    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    } 

    public boolean isOwned() {
        return isOwned;
    }

    public void setOwned(boolean isOwned) {
        this.isOwned = isOwned;
    }
}
