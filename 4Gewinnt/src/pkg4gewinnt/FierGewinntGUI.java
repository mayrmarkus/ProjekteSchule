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
public class FierGewinntGUI extends JFrame implements MouseListener {

    private JPanel rootPanel;
    private FierGewinntLabel[][] label;
    private FierGewinntButton[] button;
    private boolean spieler = true;

    public FierGewinntGUI() {
        label = new FierGewinntLabel[6][7];
        button = new FierGewinntButton[7];
        initialize();
        spielen();
    }

    private void initialize() {
        this.setSize(500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        rootPanel = new JPanel();
        rootPanel.setLayout(new GridBagLayout());
        this.setContentPane(rootPanel);

        for (int i = 0; i < 7; i++) {
            button[i] = new FierGewinntButton();
            button[i].setSize(50, 50);
            GridBagConstraints con = new GridBagConstraints();
            con.gridx = i;
            con.gridy = 0;
            con.fill = GridBagConstraints.BOTH;
            con.weightx = 1;
            con.weighty = 1;
            rootPanel.add(button[i], con);
        }

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                label[i][j] = new FierGewinntLabel(i, j);
                label[i][j].setSize(50, 50);
                GridBagConstraints con = new GridBagConstraints();
                con.gridx = j;
                con.gridy = i;
                con.fill = GridBagConstraints.BOTH;
                con.weightx = 1;
                con.weighty = 1;
                rootPanel.add(label[i][j], con);
                label[i][j].setText("Hilfe");
            }
        }
    }

    private void spielen() {
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mousePressed(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        FierGewinntButton gew = (FierGewinntButton) e.getSource();
        gew.getpo
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
