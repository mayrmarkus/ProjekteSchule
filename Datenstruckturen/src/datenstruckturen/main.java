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
public class main {
    public static void main(String[]args){
        Node start = new Node(888);
        Node m1 = new Node(666);
        Node m2 = new Node(444);
        Node m3 = new Node(222);
        Node m4 = new Node(100);
        Node m5 = new Node(5555);
 
       LinkedList ll = new LinkedList(start);
//        ll.addNode(m1);
//        ll.addNode(m2);
//        ll.addNode(m3);
//        ll.addNode(m4);
        
//        ll.addNodePlace(20, m5);
//        //ll.deleteNodePlace(0);
//        ll.printLinkedList();
//        ll.sort();
//        ll.printLinkedList();
//        System.out.println(ll.nodeSize());
        Hashtable aa = new Hashtable();
        aa.addValue(8);
        aa.addValue(18);
        aa.addValue(88);
        aa.addValue(99);
        aa.addValue(30);
        aa.addValue(79);
        aa.addValue(45);
        
        aa.printHashTable();
        
        
        
    }
}
