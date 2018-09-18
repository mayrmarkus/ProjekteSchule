/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package networksimulation;

/**
 *
 * @author Martin
 */
public class TransportLayer{
    public static final int HEADERLENGTH = 4;

    public Segment encapsulate(Data d) {
        Segment s = new Segment();
        s.setRealdata(d.getRealdata()+d.getHeader());
        s.setHeader("01");
        return s;
    }

    public Data decapsulate(Segment s) {
        Data d = new Data();
        s.deleteHeader(s.getFullData());
        return s;
    }
    
}