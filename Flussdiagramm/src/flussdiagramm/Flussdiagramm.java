/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flussdiagramm;

import javax.swing.JOptionPane;

/**
 *
 * @author Markus_Mayr
 */
public class Flussdiagramm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Geben sie eine zahl ein!"));
        for(;;){
        if(n>=2)
            System.out.println("2");
        else
            break;    
        }   
    }
    
}
