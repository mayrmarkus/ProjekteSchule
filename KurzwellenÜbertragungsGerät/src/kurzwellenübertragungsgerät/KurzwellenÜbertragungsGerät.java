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
public class KurzwellenÜbertragungsGerät {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Radio r = new Radio();
        r.setFrequency(200);
        r.on();
        r.volumeUp();
        System.out.println(r.toString());
        
        System.out.println(Radio.toFreq("BFBS"));
    }
    
}
