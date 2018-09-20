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
public class TransportLayer{
    private String realdata;
    private String header;

    public String getFullData(){
        return realdata + header;
    }
    
    public String getRealdata() {
        return realdata;
    }

    public String getHeader() {
        return header;
    }

    public void setRealdata(String realdata) {
        Data d = new Data();
        this.realdata = d.getRealdata();
        System.out.println(d.getRealdata());
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public Segment encapsulate(Data d) {
        Segment s = new Segment();
        s.setRealdata(realdata + header);
        System.out.println(realdata + header);
        return s;
    }

    public Data decapsulate(Segment s) {
        Data d = new Data();
        s.deleteHeader(s.getFullData());
        return s;
    }
    
}