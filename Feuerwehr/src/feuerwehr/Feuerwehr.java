/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feuerwehr;

/**
 *
 * @author Markus
 */
public class Feuerwehr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Notsignalgeber n = new Notsignalgeber(30, 10);
        n.ticking();
    }
    
}
