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
public interface Layer {
    
    public Data encapsulate(Data d);
    public Data decapsulate(Data d);
    
}
