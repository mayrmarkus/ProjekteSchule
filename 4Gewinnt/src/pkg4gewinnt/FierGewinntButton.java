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
    
    private boolean istSet = false;
    
    public void setColor(boolean spieler){
        if (spieler) {
            this.setBackground(Color.red);
        }else
            this.setBackground(Color.pink);
    }

    public FierGewinntButton() {
        super();
    }
    
    public boolean isIstSet() {
        return istSet;
    }
    public void setIstSet(boolean istSet) {
        this.istSet = istSet;
    }
}
