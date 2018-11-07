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
    char[] temp = new char[8];
    String[] binfin = new String[4];
    
    public IpAdress(int[] bytes){
        this.dezbytes = bytes;
        convertToBin();
    }
    
    private void convertToBin(){
        for (int i = 0; i < dezbytes.length; i++) {
            binbytes[i] = (Integer.toBinaryString(dezbytes[i]));
        }
        for (int i = 0; i < 4; i++) {
            for (int j = temp.length-1; j > 0; j--) {
                for (int k = binbytes[i].length(); k > 0; k--) {
                    temp[j] = binbytes[i].charAt(k);
                }
            }
            for (int j = 0; j < temp.length; j++) {
                binfin[i] = temp[j] + ""; 
            }
        }
        for (int i = 0; i < 4; i++) {
            System.out.println(binfin[i]);
        }
    }  
}
