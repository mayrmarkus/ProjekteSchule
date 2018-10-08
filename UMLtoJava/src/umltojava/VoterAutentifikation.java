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
public class VoterAutentifikation {
    private voterPersonalInformation voterPersonalInfo;
    private String voterID;
    private securePW voterPassword;

    public voterPersonalInformation getVoterPersonalInfo() {
        return voterPersonalInfo;
    }

    public String getVoterID() {
        return voterID;
    }

    public securePW getVoterPassword() {
        return voterPassword;
    }

    public void setVoterPersonalInfo(voterPersonalInformation voterPersonalInfo) {
        this.voterPersonalInfo = voterPersonalInfo;
    }

    public void setVoterID(String voterID) {
        this.voterID = voterID;
    }

    public void setVoterPassword(securePW voterPassword) {
        this.voterPassword = voterPassword;
    }
}
