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
public class TransportLayer implements Layer{

    @Override
    public Data encapsulate(Data d) {
        Packet p = new Packet();
        p.realdata = d.getFullData();
        p.header = "IP-Adress";
        return p;
    }

    @Override
    public Data decapsulate(Data d) {
       return null;
    }
    
}