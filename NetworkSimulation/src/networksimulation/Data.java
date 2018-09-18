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
public class Data {
    private String realdata;
    private String header;

    public String getFullData() {
        return realdata+header;
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
    
}
