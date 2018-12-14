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
public class FierGewinntButton extends JButton{

    private int posX = 0;

    public int getPosX() {
        return posX;
    }

    public FierGewinntButton(int x) {
        this.posX = x;
    }
}
