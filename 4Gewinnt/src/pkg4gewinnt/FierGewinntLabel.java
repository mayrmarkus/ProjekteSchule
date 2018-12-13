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
public class FierGewinntLabel extends JLabel{
    
    private boolean istSet = false;
    private int posX = 0;
    private int posY = 0;
    
    public void setColor(boolean spieler){
        if (spieler) {
            this.setBackground(Color.red);
        }else
            this.setBackground(Color.pink);
    }

    public FierGewinntLabel(int x, int y) {
        super();
        this.posX = x;
        this.posY = y;
    }
    
    public boolean isIstSet() {
        return istSet;
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setIstSet(boolean istSet) {
        this.istSet = istSet;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }
    
    
}
