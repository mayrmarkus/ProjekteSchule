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
    private int posX = 0;
    private int posY = 0;

    public MinesweeperButton(int z, int x, int y) {
        super();
        zahl = z;
        posX = x;
        posY = y;
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
            if (zahl == 0) {
            this.setText("");
        }else
            this.setText(zahl+"");
    }
    
    public void setBomb(){
        this.bomb = true;
    }
    
    public boolean isBomb(){
        return bomb;
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }
}
