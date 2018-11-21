/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chukaluck;

import javax.swing.JOptionPane;

/**
 *
 * @author Markus_Mayr
 */
public class Spieler {
    
    private String vName;
    private String nName;
    private double konto;


    
    public Spieler() {
        vName = JOptionPane.showInputDialog("Vorname");
        nName = JOptionPane.showInputDialog("Nachname");
        konto = Double.parseDouble(JOptionPane.showInputDialog("Konto"));
    }
    
    public boolean kontoPos(double k){
        if (konto - k >= 0) {
            return true;
        }else
            return false;
    }
    
    public String getvName() {
        return vName;
    }

    public String getnName() {
        return nName;
    }

    public double getKonto() {
        return konto;
    }

    public void setvName(String vName) {
        this.vName = vName;
    }

    public void setnName(String nName) {
        this.nName = nName;
    }

    public void setKonto(double konto) {
        this.konto = konto;
    }
    
    public void setNewKonto(double konto){
        kontoPos(konto);
        this.konto -= konto;
    }
    
}
