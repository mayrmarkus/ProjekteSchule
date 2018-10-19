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
public enum ziffern{
        I(1),
        V(5),
        X(10),
        L(50),
        C(100),
        D(500),
        M(1000);
    
    
    private int wert;
    
    ziffern(int wert){
        this.wert = wert;
    }
    
    public int wert(){
        return wert;
    }
    
    public static int getWert(char i){
        int zahl = 0; 
        switch (i) {
            case 'I':  return ziffern.I.wert();
            case 'V':  return ziffern.V.wert();
            case 'X':  return ziffern.X.wert();
            case 'L':  return ziffern.L.wert();
            case 'C':  return ziffern.C.wert();
            case 'D':  return ziffern.D.wert();
            case 'M':  return ziffern.M.wert();
            
        }
        return 66666666;
    }
} 
