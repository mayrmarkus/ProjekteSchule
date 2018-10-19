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
    private double frequency;
    private Band band;

    public void setBand(Band band) {
        this.band = band;
    }
    
    public Radio() {
    }

    public Radio(double frequency) {
        this.frequency = frequency;
    }
    
    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }
    
    public void volumeUp(){
        volume +=1;
    }
    
    public void volumeDown(){
        volume -=1;
    }
    
    public boolean isOn(){
        return isOn;
    }
    
    public void on(){
        isOn = true;
    }
    
    public void off(){
        isOn = false;
    }
    
    public String toString(){
        if(isOn)
            return "Radio an: Freq: " + frequency + ", Volume: " + volume + "\n";
        else
            return "Radio aus";
    }
    
    public static double toFreq(String a){
        switch(a){
            case "BFBS":  return 103.0; 
        }
            return 999999999.999999;
    }
}   
