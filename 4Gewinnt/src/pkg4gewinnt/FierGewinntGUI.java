/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4gewinnt;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Markus_Mayr
 */
public class FierGewinntGUI extends JFrame implements MouseListener{

    private boolean player = false;
    private JPanel rootPanel;
    private FierGewinntLabel[][] label;
    private FierGewinntButton[] button;
    private boolean spieler = true;
    
    private String winColor = "";

    public FierGewinntGUI() {
        label = new FierGewinntLabel[6][7];
        button = new FierGewinntButton[7];
        initialize();
    }

    private void initialize() {
        this.setSize(500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        rootPanel = new JPanel();
        rootPanel.setLayout(new GridBagLayout());
        this.setContentPane(rootPanel);

        for (int i = 0; i < 7; i++) {
            button[i] = new FierGewinntButton(i);
            button[i].setSize(50, 50);
            GridBagConstraints con = new GridBagConstraints();
            con.gridx = i;
            con.gridy = 0;
            con.fill = GridBagConstraints.BOTH;
            con.weightx = 1;
            con.weighty = 1;
            rootPanel.add(button[i], con);
            
            button[i].addMouseListener(this);
        }

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                label[i][j] = new FierGewinntLabel(i, j);
                label[i][j].setSize(50, 50);
                GridBagConstraints con = new GridBagConstraints();
                con.gridx = j;
                con.gridy = i+1;
                con.fill = GridBagConstraints.BOTH;
                con.weightx = 1;
                con.weighty = 1;
                rootPanel.add(label[i][j], con);
                label[i][j].setText("");
            }
        }
    }

    private void setWinColor(Color a) {
        if (a == Color.green) {
            winColor = "Grün";
        } else if (a == Color.red) {
            winColor = "Rot";
        }
    }

    public void ueberprueffen() {

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                if (label[i][j].isOwned()) {
                    //Horizontal
                    if (j + 3 < 7) {
                        if (label[i][j].getBackground() == label[i][j+1].getBackground() &&
                                label[i][j].getBackground() == label[i][j+2].getBackground() &&
                                label[i][j].getBackground() == label[i][j+3].getBackground()) {
                            setWinColor(label[i][j].getBackground());
                            
                        }
                    }
                    
                    //Vertikal
                    if (i + 3 < 6) {
                        if (label[i][j].getBackground() == label[i+1][j].getBackground() &&
                                label[i][j].getBackground() == label[i+2][j].getBackground() &&
                                label[i][j].getBackground() == label[i+3][j].getBackground()) {
                            setWinColor(label[i][j].getBackground());
                        }
                    }
                    
                    //Schreg1
                    if (i + 3 < 6 && j + 3 < 7) {
                        if (label[i][j].getBackground() == label[i+1][j+1].getBackground() &&
                                label[i][j].getBackground() == label[i+2][j+2].getBackground() &&
                                label[i][j].getBackground() == label[i+3][j+3].getBackground()) {
                            setWinColor(label[i][j].getBackground());
                        }
                    }
                    
                    //Schreg2
                    if (i - 3 < 6 && j - 3 < 7) {
                        if (label[i][j].getBackground() == label[i-1][j-1].getBackground() &&
                                label[i][j].getBackground() == label[i-2][j-2].getBackground() &&
                                label[i][j].getBackground() == label[i-3][j-3].getBackground()) {
                            setWinColor(label[i][j].getBackground());
                        }
                    }
                }
            }
        }
    }
    
    @Override
    public void mouseClicked(MouseEvent me) { 
    }

    @Override
    public void mousePressed(MouseEvent me) {
        FierGewinntButton b = (FierGewinntButton)me.getSource();
        int x = b.getPosX();
        
        for (int i = 5; i >= 0; i--) {
            if (!label[i][x].isOwned()) {
                label[i][x].setOpaque(true);
                label[i][x].setOwned(true);
                label[i][x].setPlayerColor(player);
                player = !player;
                if (i == 0) {
                    button[x].setEnabled(false);
                }
                break;
            }
        }
        ueberprueffen();
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
