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
public class Node {
    private int zahl;
    private Node next;

    public Node(int zahl) {
        this.zahl = zahl;
    }

    public int getZahl() {
        return zahl;
    }

    public Node getNext() {
        return next;
    }

    public void setZahl(int zahl) {
        this.zahl = zahl;
    }

    public void setNext(Node next) {
        this.next = next;
    }
    
    
}
