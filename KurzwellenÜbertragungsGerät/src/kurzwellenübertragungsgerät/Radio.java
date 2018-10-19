/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kurzwellenübertragungsgerät;

/**
 *
 * @author Markus_Mayr
 */
public class Radio {
    private boolean isOn;
    private int volume;
    
    public void volumeUp(){
        volume +=1;
    }
    
    public void volumeDown(){
        volume -=1;
    }
    
    public void isOn(){
        if(isOn)
            System.out.println("Der Radio ist eingeschalten");
        else
            System.out.println("Der Radio ist ausgeschalten");
    }
    
    public void on(){
        isOn = true;
    }
    
    public void off(){
        isOn = false;
    }
}
