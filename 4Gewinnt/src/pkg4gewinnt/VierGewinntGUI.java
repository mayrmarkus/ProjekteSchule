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
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Markus_Mayr
 */
public class VierGewinntGUI extends JFrame implements MouseListener {

    private boolean player = false;
    private JPanel rootPanel;
    private VierGewinntLabel[][] label;
    private VierGewinntButton[] button;
    private boolean spieler = true;

    public VierGewinntGUI() {
        label = new VierGewinntLabel[6][7];
        button = new VierGewinntButton[7];
        initialize();
    }

    private void initialize() {
        this.setSize(500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        rootPanel = new JPanel();
        rootPanel.setLayout(new GridBagLayout());
        this.setContentPane(rootPanel);

        for (int i = 0; i < 7; i++) {
            button[i] = new VierGewinntButton(i);
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
                label[i][j] = new VierGewinntLabel(i, j);
                label[i][j].setSize(50, 50);
                GridBagConstraints con = new GridBagConstraints();
                con.gridx = j;
                con.gridy = i + 1;
                con.fill = GridBagConstraints.BOTH;
                con.weightx = 1;
                con.weighty = 1;
                rootPanel.add(label[i][j], con);
                label[i][j].setText("");
            }
        }
        for (int j = 0; j < 7; j++) {
                button[j].setPlayerColor(player);
        }
    }

    private void setWin(Color a) {
        if (a == Color.green) {
            if (JOptionPane.showConfirmDialog(null, "Grün hat gewonnen!") == 0) {
                dispose();
                VierGewinntGUI fier = new VierGewinntGUI();
                fier.setVisible(true);
            } else {
                dispose();
            }
        } else if (a == Color.red) {
            if (JOptionPane.showConfirmDialog(null, "Rot hat gewonnen!") == 0) {
                dispose();
                VierGewinntGUI fier = new VierGewinntGUI();
                fier.setVisible(true);
            } else {
                dispose();
            }
        }
    }

    public void ueberprueffen() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                if (label[i][j].isOwned()) {
                    //Horizontal
                    if (j + 3 < 7) {
                        if (label[i][j].getBackground() == label[i][j + 1].getBackground()
                                && label[i][j].getBackground() == label[i][j + 2].getBackground()
                                && label[i][j].getBackground() == label[i][j + 3].getBackground()) {
                            setWin(label[i][j].getBackground());

                        }
                    }

                    //Vertical
                    if (i + 3 < 6) {
                        if (label[i][j].getBackground() == label[i + 1][j].getBackground()
                                && label[i][j].getBackground() == label[i + 2][j].getBackground()
                                && label[i][j].getBackground() == label[i + 3][j].getBackground()) {
                            setWin(label[i][j].getBackground());
                        }
                    }

                    //Schreg Aufwerts
                    if (i + 3 < 6 && j + 3 < 7) {
                        if (label[i][j].getBackground() == label[i + 1][j + 1].getBackground()
                                && label[i][j].getBackground() == label[i + 2][j + 2].getBackground()
                                && label[i][j].getBackground() == label[i + 3][j + 3].getBackground()) {
                            setWin(label[i][j].getBackground());
                        }
                    }

                    //Schreg Abwerts
                    if (i - 3 >= 0 && j + 3 < 7) {
                        if (label[i][j].getBackground() == label[i - 1][j + 1].getBackground()
                                && label[i][j].getBackground() == label[i - 2][j + 2].getBackground()
                                && label[i][j].getBackground() == label[i - 3][j + 3].getBackground()) {
                            setWin(label[i][j].getBackground());
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
        VierGewinntButton b = (VierGewinntButton) me.getSource();
        int x = b.getPosX();

        for (int i = 5; i >= 0; i--) {
            if (!label[i][x].isOwned()) {
                label[i][x].setOpaque(true);
                label[i][x].setOwned(true);
                label[i][x].setPlayerColor(player);
                for (int j = 0; j < 7; j++) {
                    if (button[j].isEnabled())
                        button[j].setPlayerColor(!player);
                }
                player = !player;
                if (i == 0) {
                    button[x].setEnabled(false);
                    for (int j = 0; j < 7; j++) {
                    if (!button[j].isEnabled())
                        button[j].setBackground(null);
                }
                }
                break;
            }
        }
        ueberprueffen();
    }

    public void mousePressed(MouseEvent me, int x) {
        for (int i = 5; i >= 0; i--) {
            if (!label[i][x].isOwned()) {
                label[i][x].setOpaque(true);
                label[i][x].setOwned(true);
                label[i][x].setPlayerColor(player);
                for (int j = 0; j < 7; j++) {
                    if (button[j].isEnabled())
                        button[j].setPlayerColor(!player);
                }
                player = !player;
                if (i == 0) {
                    button[x].setEnabled(false);
                    for (int j = 0; j < 7; j++) {
                    if (!button[j].isEnabled())
                        button[j].setBackground(null);
                }
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
    
    private void ki(){
        int place = 0;
        Random ran = new Random();
        place = ran.nextInt(7);
        mousePressed(null, place);
    }
    
     public VierGewinntLabel ueberprueffenKI() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                if (label[i][j].isOwned()) {
                    //Horizontal
                    if (j + 3 < 7) {
                        if (label[i][j].getBackground() == label[i][j + 1].getBackground()
                                && label[i][j].getBackground() == label[i][j + 2].getBackground()
                                && !label[i][j].isOwned()) {
                            return label[i][j];
                        }
                    }

                    //Vertical
                    if (i + 3 < 6) {
                        if (label[i][j].getBackground() == label[i + 1][j].getBackground()
                                && label[i][j].getBackground() == label[i + 2][j].getBackground()
                                && !label[i][j].isOwned()) {
                            return label[i][j];
                        }
                    }

                    //Schreg Aufwerts
                    if (i + 3 < 6 && j + 3 < 7) {
                        if (label[i][j].getBackground() == label[i + 1][j + 1].getBackground()
                                && label[i][j].getBackground() == label[i + 2][j + 2].getBackground()
                                && !label[i][j].isOwned()) {
                            return label[i][j];
                        }
                    }

                    //Schreg Abwerts
                    if (i - 3 >= 0 && j + 3 < 7) {
                        if (label[i][j].getBackground() == label[i - 1][j + 1].getBackground()
                                && label[i][j].getBackground() == label[i - 2][j + 2].getBackground()
                                && !label[i - 3][j + 3].isOwned()) {
                            return label[i][j];
                        }
                    }
                }
            }
        }
        return null;
    }
}
