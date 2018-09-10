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
        int t = 1;
        int p = 3;
        if(n>=2)
            System.out.println("2");

            while(!(p>n)){
                t+=2;
                if(p%t==0 || t*t>p){
                    if(t*t>p)
                        System.out.println(p);
                    
                        p+=2;
                        t=1;
                }
        }      
    }
}
