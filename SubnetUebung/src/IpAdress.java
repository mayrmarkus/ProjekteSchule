/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Markus_Mayr
 */
public class IpAdress {
    
    int[] dezbytes;
    int[] binbytes;
    
    public IpAdress(int[]bytes){
        this.dezbytes = bytes;
        convertToBin();
    }
    
    private void convertToBin(){
        for (int i = 0; i < dezbytes.length; i++) {
            binbytes[i] = Integer.parseInt(Integer.toBinaryString(dezbytes[i]));
        }
        for (int i = 0; i < binbytes.length; i++) {
            System.out.println(binbytes[i]);
        }
    }  
}
