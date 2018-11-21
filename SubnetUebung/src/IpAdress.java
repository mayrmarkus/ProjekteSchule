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
    private String cidr = "";
    private int cd = 0;
    
    private String ber;
    private String broad = "";
    
    private String berDez;
    private String broadDez;
    
    private int host;
    private int sub;

    public int getHost() {
        return host;
    }

    public int getSub() {
        return sub;
    }
    
    public int getCd() {
        return cd;
    }
    
    public String getBerDez() {
        return berDez;
    }

    public String getBroadDez() {
        return broadDez;
    }
    
    public String getBer() {
        return ber;
    }

    public String getBroad() {
        return broad;
    }
    
    public int[] getDezbytes() {
        return dezbytes;
    }

    public int[] getDezsub() {
        return dezsub;
    }

    public String getIpAdress() {
        return ipAdress;
    }

    public String getSubnet() {
        return subnet;
    }

    public String getC() {
        return c;
    }

    public String getCidr() {
        return cidr;
    }

    public void toDez(){
        String b = "";
        String b1 = "";
        String b2 = "";
        String b3 = "";
        String finber = "";
        for (int i = 0; i < 32; i++) {
            if (i < 8) {
                b += "" + ber.charAt(i);
                if (i == 7) {
                    finber += Long.parseLong(b,2) + ".";
                }
            }
            if (i > 7 && i < 16) {
                b1 += "" + ber.charAt(i);
                if (i == 15) {
                    finber += Long.parseLong(b1,2) + ".";
                }
            }
            if(i > 15 && i < 24){
                b2 += "" + ber.charAt(i);
                if (i == 23) {
                    finber += Long.parseLong(b2,2) + ".";
                }
            }
            if (i > 23 && i < 32) {
                b3 += "" + ber.charAt(i);
                if (i == 31) {
                    finber += Long.parseLong(b3,2) + "";
                }
            }
        }
        berDez = finber;
        String a = "";
        String a1 = "";
        String a2 = "";
        String a3 = "";
        
        String finbroad = "";
        for (int i = 0; i < 32; i++) {
            if (i < 8) {
                a += "" + broad.charAt(i);
                if (i == 7) {
                    finbroad += Long.parseLong(a,2) + ".";
                }
            }
            if (i > 7 && i < 16) {
                a1 += "" + broad.charAt(i);
                if (i == 15) {
                    finbroad += Long.parseLong(a1,2) + ".";
                }
            }
            if(i > 15 && i < 24){
                a2 += "" + broad.charAt(i);
                if (i == 23) {
                    finbroad += Long.parseLong(a2,2) + ".";
                }
            }
            if (i > 23 && i < 32) {
                a3 += "" + broad.charAt(i);
                 if (i == 31) {
                    finbroad += Long.parseLong(a3,2) + "";
                }
            }
        }
        broadDez = finbroad;
    }
    
    public IpAdress(String cidr, int[] bytes) {
        this.c = cidr;
        this.dezbytes = bytes;
        convertToBin();
        convertCidr();
        calc();
    }

    public IpAdress(int[] sub, int[] bytes) {
        this.dezsub = sub;
        this.dezbytes = bytes;
        convertToBin();
        convertToBinSub();
        makeCidr();
        calc();
    }

    private void makeCidr() {
        for (int i = 0; i < 32; i++) {
            if (subnet.charAt(i) == 49) {
                cd += 1;
            } else {
                cd += 0;
            }
        }
    }

    private void convertCidr() {
        int a = Integer.parseInt(c);
        String b = "";
        for (int i = 0; i < a; i++) {
            b += "1";
        }
        cidr = b;
        if (b.length() < 32) {
            for (int i = 0; i < 32 - b.length(); i++) {
                cidr += "0";
            }
        }
        subnet = cidr;
    }

    private void convertToBin() {
        String a = "";
        String b = "";
        String c = "";
        String d = "";

        String all = "";

        a += Integer.toBinaryString(dezbytes[0]);
        b += Integer.toBinaryString(dezbytes[1]);
        c += Integer.toBinaryString(dezbytes[2]);
        d += Integer.toBinaryString(dezbytes[3]);

        if (a.length() < 8 || b.length() < 8 || c.length() < 8 || d.length() < 8) {
            for (int i = 0; i < 8 - a.length(); i++) {
                all += "0";
            }
            all += a + "";
            for (int i = 0; i < 8 - b.length(); i++) {
                all += "0";
            }
            all += b + "";
            for (int i = 0; i < 8 - c.length(); i++) {
                all += "0";
            }
            all += c + "";
            for (int i = 0; i < 8 - d.length(); i++) {
                all += "0";
            }
            all += d;
        }
        ipAdress = all;
    }

    private void convertToBinSub() {
        String a = "";
        String b = "";
        String c = "";
        String d = "";

        String all = "";

        a += Integer.toBinaryString(dezsub[0]);
        b += Integer.toBinaryString(dezsub[1]);
        c += Integer.toBinaryString(dezsub[2]);
        d += Integer.toBinaryString(dezsub[3]);

        if (a.length() < 8 || b.length() < 8 || c.length() < 8 || d.length() < 8) {
            for (int i = 0; i < 8 - a.length(); i++) {
                all += "0";
            }
            all += a + "";
            for (int i = 0; i < 8 - b.length(); i++) {
                all += "0";
            }
            all += b + "";
            for (int i = 0; i < 8 - c.length(); i++) {
                all += "0";
            }
            all += c + "";
            for (int i = 0; i < 8 - d.length(); i++) {
                all += "0";
            }
            all += d;
        }
        subnet = all;
    }

    private void calc() {
        String logischBin = "";

        for (int i = 0; i < 32; i++) {
            if (ipAdress.charAt(i) == 49 && subnet.charAt(i) == 49) {
                logischBin += "1";
            } else {
                logischBin += "0";
            }
        }

        ber = logischBin;
        calcBroad();
    }

    private void calcBroad() {
        if (!"0".equals(c)) {
            cd=Integer.parseInt(c);
        }
        for (int i = 0; i < cd; i++) {
            broad += ber.charAt(i);
        }
        for (int i = cd; i < 32; i++) {
            broad += "1";
        }
    }
    
    public void calcHost(){
        if (!"0".equals(c)) {
            cd=Integer.parseInt(c);
        }
        host = (int) Math.pow(2, (32 - cd))- 2;
    }
    
    public void calcSub(){
        sub = (int) Math.pow(2, cd) -2;
    }
}