/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minesweeper;

import javax.swing.JButton;

/**
 *
 * @author Markus_Mayr
 */
public class MinesweeperButton extends JButton{
 
    private int zahl = 0;
    private boolean bomb = false;

    public MinesweeperButton(int z) {
        super();
        zahl = z;
    }

    
    public int getZahl() {
        return zahl;
    }

    public void setZahl(int zahl) {
        this.zahl += zahl;
    }
    
    public void showZahl(){
        if (bomb) {
            this.setText("B");
        }else
            this.setText(zahl+"");
    }
    
    public void setBomb(){
        this.bomb = true;
    }
    
    public boolean isBomb(){
        return bomb;
    }
}
