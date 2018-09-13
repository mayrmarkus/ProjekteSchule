/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package network;

/**
 *
 * @author Markus_Mayr
 */
public class TransportLayer implements Layer{

    @Override
    public Data encapsulate(Data d) {
        return new Packet();
    }

    @Override
    public Data decapsulate(Data d) {
        return null;
    }
    
}
