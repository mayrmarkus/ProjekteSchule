/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4gewinnt;

import java.awt.Color;
import javax.swing.JButton;

/**
 *
 * @author Markus_Mayr
 */
public class VierGewinntButton extends JButton{

    private int posX = 0;

    public int getPosX() {
        return posX;
    }

    public VierGewinntButton(int x) {
        this.posX = x;
    }
    
    public void setPlayerColor(boolean p){
        if (p) {
            this.setBackground(Color.red);
        }else
            this.setBackground(Color.green);
    }
}
