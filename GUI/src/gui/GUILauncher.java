/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

/**
 *
 * @author Markus_Mayr
 */
public class GUILauncher {
    
    public static void main(String args[]){
        FirstWindow fw = new FirstWindow();
        fw.setVisible(true);
        while(fw.isIsPass()){
            fw.setVisible(false);
        }
        
    }
}
