/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schneckenrennen;

import java.util.ArrayList;


/**
 *
 * @author Markus_Mayr
 */
public class Rennen {
    private String name;
    private int teilnehmer;
    private ArrayList<Rennschnecke> teilnehmerliste = new ArrayList<Rennschnecke>();
    private double strecke;

    public double getStrecke() {
        return strecke;
    }

    public ArrayList<Rennschnecke> getTeilnehmerliste() {
        return teilnehmerliste;
    }
    
    public Rennen() {
    }

    public Rennen(String name, double Strecke, int teilnehmer) {
        this.name = name;
        this.teilnehmer = teilnehmer;
        this.strecke = Strecke;
    }
    
    public void addRennschnecke(Rennschnecke neueSchnecke){
        teilnehmerliste.add(neueSchnecke); 
    }
    
    public void removeRennschnecke(String name){
        for (int i = 0; i < teilnehmerliste.size()-1; i++) {
            if(teilnehmerliste.get(i).getName().equals(name))
                teilnehmerliste.remove(i);
        }
    }
    
    @Override
    public String toString(){
        String temp = "Rennen: " + name + ", Strecke: " + strecke + "\n" ;
        for (int i = 0; i < teilnehmerliste.size(); i++) {
            temp += teilnehmerliste.get(i).toString() + "\n";
        }
        return temp +"\n";
    }
    
    public boolean ermittleGewinner(){
        for (int i = 0; i < teilnehmerliste.size(); i++) {
            if(teilnehmerliste.get(i).getWegDone() >= strecke){
                System.out.println("Der Gewinner ist: " + teilnehmerliste.get(i).getName());
                return true;
            }
        }
        return false;
    }
    
    public void lasseKriechen(){
        for (int i = 0; i < teilnehmerliste.size(); i++) {
            teilnehmerliste.get(i).krieche();
        }
    }
    
    public boolean durchführen(){
        do{
            lasseKriechen();
        }while(!ermittleGewinner());
        return true;
    }
}
