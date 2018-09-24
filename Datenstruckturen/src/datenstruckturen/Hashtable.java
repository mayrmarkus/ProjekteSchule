/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datenstruckturen;

/**
 *
 * @author Markus_Mayr
 */
public class Hashtable {
    
    LinkedList[] tabelle = new LinkedList[15];
    
    public void addValue(int wert){
        int h = wert%15;
        Node n = new Node(wert);
        
        if(tabelle[h] == null)
            tabelle[h] = new LinkedList(n);
        else
            tabelle[h].addNode(n);
    }
        
    public void printHashTable(){
        for (int i = 0; i < 15; i++) {
            LinkedList ll = tabelle[i];
            System.out.print(i+"\t");
            if(ll != null)
                ll.printLinkedList();
            else
                System.out.println("");
        }
        
    }
}
