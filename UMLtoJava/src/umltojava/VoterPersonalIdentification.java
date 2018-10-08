/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umltojava;

/**
 *
 * @author Markus_Mayr
 */
public class VoterPersonalIdentification {
    private String voterLastName;
    private String voterFirstName;
    private String voterMiddleName;
    private String voterSSN;
    private String voterAdress1;
    private String voterAdress2;
    private String voterCity;
    private String voterState;
    private String voterZIP;

    public String getVoterLastName() {
        return voterLastName;
    }

    public String getVoterFirstName() {
        return voterFirstName;
    }

    public String getVoterMiddleName() {
        return voterMiddleName;
    }

    public String getVoterSSN() {
        return voterSSN;
    }

    public String getVoterAdress1() {
        return voterAdress1;
    }

    public String getVoterAdress2() {
        return voterAdress2;
    }

    public String getVoterCity() {
        return voterCity;
    }

    public String getVoterState() {
        return voterState;
    }

    public String getVoterZIP() {
        return voterZIP;
    }

    public void setVoterLastName(String voterLastName) {
        this.voterLastName = voterLastName;
    }

    public void setVoterFirstName(String voterFirstName) {
        this.voterFirstName = voterFirstName;
    }

    public void setVoterMiddleName(String voterMiddleName) {
        this.voterMiddleName = voterMiddleName;
    }

    public void setVoterSSN(String voterSSN) {
        this.voterSSN = voterSSN;
    }

    public void setVoterAdress1(String voterAdress1) {
        this.voterAdress1 = voterAdress1;
    }

    public void setVoterAdress2(String voterAdress2) {
        this.voterAdress2 = voterAdress2;
    }

    public void setVoterCity(String voterCity) {
        this.voterCity = voterCity;
    }

    public void setVoterState(String voterState) {
        this.voterState = voterState;
    }

    public void setVoterZIP(String voterZIP) {
        this.voterZIP = voterZIP;
    }
    
    
    public String validateZipCode(String voterZIP){
        //to do
        return "";
    }
    
    public String validateState(String parameter0VoterState){
        //to do
        return "";
    }
}
