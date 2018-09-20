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
public class NetworkSimulation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Data d = new Data();
        TransportLayer t = new TransportLayer();
        Segment s = new Segment();
        Packet p = new Packet();
        
        d.setRealdata("Data");
        
        t.setHeader("00");
        s.setHeader("01");
        p.setHeader("02");
        //t.encapsulate(d);
        System.out.println(t.getFullData());
        
        System.out.println(s.getFullData());
    }
    
}
