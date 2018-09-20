/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package networksimulation;

/**
 *
 * @author Markus
 */
public class Segment extends Data{
    private String realdata;
    private String header;
    private String fullData;

    public void setFullData(String fullData) {
        this.fullData = fullData;
    }
    

    public String getFullData() {
        return realdata + header;
    }

    public String getRealdata() {
        return realdata;
    }

    public String getHeader() {
        return header;
    }

    public void setRealdata(String realdata) {
        this.realdata = realdata;
    }

    public void setHeader(String header) {
        this.header = header;
    }
    public String deleteHeader(String s){
    char[] toString = s.toCharArray();
    String z="";
        for (int i = 0; i < toString.length-2; i++) {
            z+=toString[i];
        }
        return z;
    }
    
     public Packet encapsulate(TransportLayer t) {
        Packet p = new Packet();
        p.setRealdata(realdata+header);
        return p;
    }

    public Packet decapsulate(Packet p) {
        p.deleteHeader(p.getFullData());
        return p;
    }

}
