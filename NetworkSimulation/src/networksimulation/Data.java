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
public abstract class Data {
    protected String realdata;
    protected String header;

    public String getFullData() {
        return header + realdata;
    }
    
    
}
