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
        String rom = "LX";
        calculusRomanus(rom);
    }
    
    public static void calculusRomanus(String rom){
        int zahl = 0;
        char[] array = rom.toUpperCase().toCharArray();
        for (int i = 0; i < array.length; i++) {
        switch (array[i]) {
            case 'I':  zahl += ziffern.I.wert();
                     break;
            case 'V':  zahl += ziffern.V.wert();
                     break;
            case 'X':  zahl += ziffern.X.wert();
                     break;
            case 'L':  zahl += ziffern.L.wert();
                     break;
            case 'C':  zahl += ziffern.C.wert();
                     break;
            case 'D':  zahl += ziffern.D.wert();
                     break;
            case 'M':  zahl += ziffern.M.wert();
                     break;
            }
        }
        System.out.println(zahl);
    }
}
