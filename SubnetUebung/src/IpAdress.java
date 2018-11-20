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
    
    private String ber;
    private String broad = "";
    
    private String berDez = "" + Integer.parseInt(ber,2);
    private String broadDez = "" + Integer.parseInt(broad,2);

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

    
    public IpAdress(String cidr, int[] bytes) {
        this.c = cidr;
        this.dezbytes = bytes;
        convertToBin();
        convertCidr();
        calc();
    }

    public IpAdress(int[] sub, int[] bytes) {
        this.dezsub = sub;
        convertToBin();
        convertToBinSub();
        makeCidr();
        calc();
    }

    private void makeCidr() {
        for (int i = 0; i < 32; i++) {
            if (subnet.charAt(i) == 1) {
                cidr += 1;
            } else {
                cidr += 0;
            }
            System.out.println(cidr);
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
        for (int i = 0; i < 24; i++) {
            broad += ber.charAt(i);
        }
        broad += "11111111";
    }
}
