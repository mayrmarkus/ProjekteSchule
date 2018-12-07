/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minesweeper;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Markus_Mayr
 */
public class MinesweeperGUI extends JFrame implements MouseListener{
    private JPanel rootPanel;
    private MinesweeperButton[][] buttons;
    private ArrayList<MinesweeperButton> buttonsList = new ArrayList<MinesweeperButton>();
    
    public MinesweeperGUI(){
        buttons = new MinesweeperButton[10][10];
        initialize();
        placeBombs();
        value();
        //showAll();
    }
    
    private void value(){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (buttons[i][j].isBomb()) {

                    if (i - 1 >= 0) {

                        if (j - 1 >= 0) {
                            buttons[i - 1][j - 1].setZahl(1);
                        }
                        if (j + 1 < 10) {
                            buttons[i - 1][j + 1].setZahl(1);
                        }
                        buttons[i - 1][j].setZahl(1);
                    }

                    if (i + 1 < 10) {

                        if (j - 1 >= 0) {
                            buttons[i + 1][j - 1].setZahl(1);
                        }
                        if (j + 1 < 10) {
                            buttons[i + 1][j + 1].setZahl(1);
                        }
                        buttons[i + 1][j].setZahl(1);
                    }

                    if (j + 1 < 10) {
                        buttons[i][j + 1].setZahl(1);
                    }
                    if (j - 1 >= 0) {
                        buttons[i][j - 1].setZahl(1);
                    }
                }
            }
        }
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (buttons[i][j].isBomb()) {
                    buttons[i][j].setZahl(80);
                }
                if (buttons[i][j].getZahl() == 1) {
                    buttons[i][j].setForeground(Color.blue);
                }else if (buttons[i][j].getZahl() == 2) {
                    buttons[i][j].setForeground(Color.decode("#006400"));
                }else if (buttons[i][j].getZahl() == 3) {
                    buttons[i][j].setForeground(Color.red);
                }else if (buttons[i][j].getZahl() == 4) {
                    buttons[i][j].setForeground(Color.MAGENTA);
                }else if (buttons[i][j].getZahl() == 5) {
                    buttons[i][j].setForeground(Color.decode("#8B0000"));
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
                 buttons[i][j] = new MinesweeperButton(0,i,j);
                 buttons[i][j].setSize(50, 50);
                 GridBagConstraints con = new GridBagConstraints();
                 con.gridx = i;
                 con.gridy = j;
                 con.fill = GridBagConstraints.BOTH;
                 con.weightx = 1;
                 con.weighty = 1;
                 rootPanel.add(buttons[i][j], con);
                 buttons[i][j].addMouseListener(this);
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

    @Override
    public void mouseClicked(MouseEvent me) {
        MinesweeperButton a = (MinesweeperButton)me.getSource();
        int x = a.getX();
        int y = a.getY();
        buttonsList.add(a);
        while(!buttonsList.isEmpty()){
            buttonsList.remove(0);
            if (a.getZahl() > 0 && a.getZahl() < 70) {
                a.showZahl();
                a.setEnabled(false);
            }else if (a.getZahl() == 0) {
                a.setEnabled(false);
                if (x-1 >= 1 && y-1 >= 0 && buttons[x-1][y-1].isEnabled()) {
                    buttonsList.add(buttons[x-1][y-1]);
                }
                if (x-1 >= 1 && y-1 >= 0 && buttons[x-1][y].isEnabled()) {
                    buttonsList.add(buttons[x-1][y]);
                }
                if (x-1 >= 1 && y-1 >= 0 && buttons[x][y-1].isEnabled()) {
                    buttonsList.add(buttons[x][y-1]);
                }
                if (x-1 >= 1 && y-1 >= 0 && buttons[x+1][y+1].isEnabled()) {
                    buttonsList.add(buttons[x+1][y+1]);
                }
                if (x-1 >= 1 && y-1 >= 0 && buttons[x+1][y].isEnabled()) {
                    buttonsList.add(buttons[x+1][y]);
                }
                if (x-1 >= 1 && y-1 >= 0 && buttons[x][y+1].isEnabled()) {
                    buttonsList.add(buttons[x][y+1]);
                }
            }else if (a.getZahl() > 70) {
                showAll(); 
            }
        }
    }

    @Override
    public void mousePressed(MouseEvent me) {
        
    }

    @Override
    public void mouseReleased(MouseEvent me) {
        
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        
    }

    @Override
    public void mouseExited(MouseEvent me) {
        
    }
}