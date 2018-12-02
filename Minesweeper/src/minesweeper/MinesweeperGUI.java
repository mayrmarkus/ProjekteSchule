/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minesweeper;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Markus_Mayr
 */
public class MinesweeperGUI extends JFrame{
    private JPanel rootPanel;
    private MinesweeperButton[][] buttons;
    
    public MinesweeperGUI(){
        buttons = new MinesweeperButton[10][10];
        initialize();
        placeBombs();
        value();
        showAll();
    }
    
    private void value(){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (buttons[i][j].isBomb()) {
                    
                    if (i - 1 >= 0) {
                        
                        if (j - 1 >= 0) {
                            buttons[i-1][j-1].setZahl(1);
                        }
                        if (j + 1 < 10) {
                            buttons[i-1][j+1].setZahl(1);
                        }
                        if (j + 1 < 10) {
                            buttons[i-1][j].setZahl(1);
                        }
                    }
                    
                    if (i + 1 <= 10) {
                        
                         if (j - 1 >= 0) {
                            buttons[i][j-1].setZahl(1);
                        }
                        if (j + 1 < 10) {
                            buttons[i][j+1].setZahl(1);
                        }
                        
                        if (j -1 >= 0) {
                            buttons[i+1][j-1].setZahl(1);
                        }
                        if (j -1 <= 10) {
                            buttons[i+1][j].setZahl(1);
                        }
                        if (j -1 <= 10) {
                            buttons[i+1][j+1].setZahl(1);
                        }
                    }
                }
            }
        }
    }
    
    private void showAll(){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                buttons[i][j].showZahl();
                if (buttons[i][j].isBomb()) {
                    buttons[i][j].setBackground(Color.red);
                }
            }
        }
    }
    
    private void initialize(){
         this.setSize(1000, 1000);
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
         rootPanel = new JPanel();
         rootPanel.setLayout(new GridBagLayout());
         this.setContentPane(rootPanel);
         
         for (int i = 0; i < 10; i++) {
             for (int j = 0; j < 10; j++) {
                 buttons[i][j] = new MinesweeperButton(0);
                 buttons[i][j].setSize(50, 50);
                 GridBagConstraints con = new GridBagConstraints();
                 con.gridx = i;
                 con.gridy = j;
                 con.fill = GridBagConstraints.BOTH;
                 con.weightx = 1;
                 con.weighty = 1;
                 rootPanel.add(buttons[i][j], con);
             }
        }
    }
    
    private void placeBombs(){
        
        Random rand = new Random();
        
        for (int i = 0; i < 10; i++) {
            int x = rand.nextInt(10);
            int y = rand.nextInt(10);
            if (!buttons[x][y].isBomb()) {
                buttons[x][y].setBomb();
            }else
                i--;
        }
    }
    
}
