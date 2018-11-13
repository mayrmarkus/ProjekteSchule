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
    String[] binbytes = new String[4];
    
    public IpAdress(int[] bytes){
        this.dezbytes = bytes;
        convertToBin();
    }
    
    private void convertToBin(){
        String a = "";
        for (int i = 0; i < dezbytes.length; i++) {
            a += Integer.toBinaryString(dezbytes[i]);
        }
        System.out.println(a);
    }  
}
