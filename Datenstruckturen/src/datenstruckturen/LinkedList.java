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
public class LinkedList {
    
    private Node first;
    
    public LinkedList(Node n) {
        first = n;
    }
    
    public void addNode(Node n){
        Node temp = first;
        while(temp.getNext() != null){
            temp = temp.getNext();
        }
        temp.setNext(n);
    }
    
    public void printLinkedList(){
        Node temp = first;
        while(temp != null){
            System.out.println(temp.getZahl());
            temp = temp.getNext();
        }
    }
    
    public void deleteNode(Node n){
        Node temp = first;
        Node previous = null;
        while(temp != null){
            if(n.getZahl() == temp.getZahl()){
                previous.setNext(temp.getNext());
            }
            previous = temp;
            temp = temp.getNext();
        }
    }
    
    public void addBeginning(Node n){
        n.setNext(first);
        first = n;
    }
    
    public void deleteNodePlace(int a, Node n){
        Node temp = first;
        Node previous = null;
        for(int i = 1; i<=a; i++){
            previous = temp;
            temp = temp.getNext();
        }
        previous.setNext(temp.getNext());
    }
    
    public void addNodePlace(int a, Node n){
        Node temp = first;
        Node previous = null;
        for (int i = 1; i <=a; i++) {
            previous = temp;
            temp = temp.getNext();
        }
        temp.setNext(n);    
        }
        

    public static void main(String[]args){
        Node strat = new Node(888);
        Node m1 = new Node(666);
        Node m2 = new Node(444);
        Node m3 = new Node(222);
        Node m4 = new Node(000);
        
        LinkedList ll = new LinkedList(strat);
        ll.addNode(m1);
        ll.addNode(m2);
        ll.addNode(m3);
        ll.addNode(m4);
        
        ll.deleteNode(m1);
        
        ll.printLinkedList();
    }
    
}

