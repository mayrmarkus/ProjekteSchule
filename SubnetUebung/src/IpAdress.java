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
    int[] dezsub;
    
    private String ipAdress;
    private String subnet;
    
    private String c;
    private String cidr;
    
    public IpAdress(String cidr, int[]sub, int[] bytes){
        this.c = cidr;
        this.dezbytes = bytes;
        this.dezsub = sub;
        convertToBin();
        convertToBinSub();
        convertCidr();
        calc();
    }
    
    private void convertCidr(){
        int a = Integer.parseInt(c);
        String b = "";
        for (int i = 0; i < a; i++) {
            b += "1"; 
        }
        cidr = b;
        if (b.length() < 32) {
            for (int i = 0; i < 32-b.length(); i++) {
            cidr += "0";
            }
        }
    }
            
    private void convertToBin(){
        String a = "";
        String b = "";
        String c = "";
        String d = "";
        
        String all = "";
        for (int i = 0; i < 1; i++) {
            a += Integer.toBinaryString(dezbytes[i]);
        }
        for (int i = 1; i < 2; i++) {
            b += Integer.toBinaryString(dezbytes[i]);
        }
        for (int i = 2; i < 3; i++) {
            c += Integer.toBinaryString(dezbytes[i]);
        }
        for (int i = 3; i < 4; i++) {
            d += Integer.toBinaryString(dezbytes[i]);
        }
        if (a.length() < 8 || b.length() < 8 || c.length() < 8 || d.length() < 8) {
            for (int i = 0; i < 8-a.length(); i++) {
                all += "0";
            }
            all += a + "." ;
            for (int i = 0; i < 8-b.length(); i++) {
                all += "0";
            }
            all += b + ".";
            for (int i = 0; i < 8-c.length(); i++) {
                all += "0";
            }
            all += c + ".";
            for (int i = 0; i < 8-d.length(); i++) {
                all += "0";
            }
            all += d;
        }
        ipAdress = all;
    }  
    
    private void convertToBinSub(){
        String a = "";
        String b = "";
        String c = "";
        String d = "";
        
        String all = "";
        for (int i = 0; i < 1; i++) {
            a += Integer.toBinaryString(dezsub[i]);
        }
        for (int i = 1; i < 2; i++) {
            b += Integer.toBinaryString(dezsub[i]);
        }
        for (int i = 2; i < 3; i++) {
            c += Integer.toBinaryString(dezsub[i]);
        }
        for (int i = 3; i < 4; i++) {
            d += Integer.toBinaryString(dezsub[i]);
        }
        if (a.length() < 8 || b.length() < 8 || c.length() < 8 || d.length() < 8) {
            for (int i = 0; i < 8-a.length(); i++) {
                all += "0";
            }
            all += a + "." ;
            for (int i = 0; i < 8-b.length(); i++) {
                all += "0";
            }
            all += b + ".";
            for (int i = 0; i < 8-c.length(); i++) {
                all += "0";
            }
            all += c + ".";
            for (int i = 0; i < 8-d.length(); i++) {
                all += "0";
            }
            all += d;
        }
        subnet = all;
    }
    
    private void calc(){
        String logischBin = "";
        String dez = "";
        for (int i = 0; i < 32; i++) {
            if (ipAdress.charAt(i) == 1 && subnet.charAt(i) == 1) {
                logischBin += "1"; 
            }else
                logischBin += "0";
        }
        int a = Integer.parseInt(logischBin,2);
        System.out.println(a);
    }
    
    public String toString(){
        return "Hilfe";
    }
}
