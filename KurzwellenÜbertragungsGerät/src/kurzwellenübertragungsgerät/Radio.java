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
    private String radio;
    private int volume;
    private double frequency;
    private Band band;

    public void setBand(Band band) {
        this.band = band;
    }

    public Radio(String a, Band band) {
        this.frequency = toFreq(a);
        this.radio = a;
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
            if (band != null) {
                if (radio != null) 
                    return "Radio an: Freq: " + frequency + " " + band + ", Volume: " + volume + ", Radio: " + radio +"\n";
                else
                    return "Radio an: Freq: " + frequency + " " + band + ", Volume: " + volume + ", Radio: Unbekannt\n";
            }else
                if (radio != null) 
                    return "Radio an: Freq: " + frequency +  " FM, Volume: " + volume + ", Radio: " + radio +"\n";
                else
                    return "Radio an: Freq: " + frequency + " FM, Volume: " + volume + ", Radio: Unbekannt\n";
            
            
        else
            return "Radio aus";
    }
    
    public static double toFreq(String a){
        switch(a){
            case "BFBS":  return 103.0;
            case "Radio Maria": return 107.9;
            case "Radio Gherdëina": return 95.1;
        }
            return 999999999.999999;
    }
}   
