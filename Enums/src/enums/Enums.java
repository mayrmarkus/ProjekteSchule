/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enums;

/**
 *
 * @author Markus_Mayr
 */
public class Enums {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {  
        String rom = "XIX";
        calculusRomanus(rom);
    }
    
    public static void calculusRomanus(String rom){
        int zahl = 0;
        char[] array = rom.toUpperCase().toCharArray();
        
        for (int i = 0; i < array.length; i++) {
        if (i+1 < array.length && ziffern.getWert(array[i]) < ziffern.getWert(array[i+1])) {
                zahl -= ziffern.getWert(array[i]);
        }else
         zahl += ziffern.getWert(array[i]);
        }
        System.out.println(zahl);
    }
}
