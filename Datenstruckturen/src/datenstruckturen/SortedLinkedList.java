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
public class SortedLinkedList extends LinkedList{

    public SortedLinkedList(Node n) {
        super(n);
    }

    @Override
    public void addNode(Node n) {
        
       Node temp = first;
       int j=1;
       while (temp != null && n.getZahl() < temp.getZahl()){
         temp = temp.getNext();
         j++;
       }
         addNodePlace(j, n);
       // super.addNode(n);
//        sort();
    }

}
