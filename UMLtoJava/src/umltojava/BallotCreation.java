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
public class BallotCreation {
    private String ballotName;
    private String[] candidates;

    public String getBallotName() {
        return ballotName;
    }

    public String[] getCandidates() {
        return candidates;
    }

    public void setBallotName(String ballotName) {
        this.ballotName = ballotName;
    }

    public void setCandidates(String[] candidates) {
        this.candidates = candidates;
    }
    
    public void displayBallot(){
        
    }
    
    public void createBallot(){
        candidates = new String[] {"Team Köllensberger", "Süd-tiroler Freiheit", "Die Freiheitlichen",
            "Bürgerunion für Südtirol", "Forza Italia", "SVP Südtiroler Volkspartei", "NOI PER L'ALTO ADIGE - FÜR SÜDTIROL",
            "VERDI - GRÜNE - VERC", "VEREINTE LINKE SINISTRA UNITA", "L'ALTO ADIGE NEL CUORE FRATELLI D'ITALIA UNITI", 
            "LEGA NORD", "PD PARTITO DEMOCRATICO - DEMOKRATISCHE PARTEI", "CASAPOUND ITALIA", "MOVIMENTO 5 STELLE"};
    }
    
    public toString(){
        
    }
}
