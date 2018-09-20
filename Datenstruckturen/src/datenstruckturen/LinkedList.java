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
            System.out.print(temp.getZahl());
            System.out.print(", ");
            temp = temp.getNext();
        }
        System.out.println("");
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
    
    public void deleteNodePlace(int a){
        if(a == 0){
            first = first.getNext();
        }else{
            
        Node temp = first;
        Node previous = null;
        for(int i = 1; i<=a; i++){
            previous = temp;
            temp = temp.getNext();
        }
        previous.setNext(temp.getNext());
        }
    }
    
    public void addNodePlace(int a, Node n){
        
        Node temp = first;
        Node previous = null;
        if(a>nodeSize())
            addNode(n);
        else{
            if(a == 1)
                addBeginning(n);
            else{
                for (int i = 1; i < a; i++) {
                    previous = temp;
                    temp = temp.getNext();
                }
            previous.setNext(n);
            n.setNext(temp);    
            }
        }
    }
        
    public int nodeSize(){
        int length = 0;
        Node temp = first;
        while(temp != null){
            temp = temp.getNext();
            length++;
        }
        return length;
    }
    
    public Node stelleX(int a){
        Node temp = first;
        int count = 0;
        while(temp != null){
            if(count == a)
                return temp;
            temp = temp.getNext();
        }
        return temp;
    }
    
    public void sort(){
        for(int i=nodeSize() -1; i>0; i--){
            for(int j=0; j<nodeSize()-1; j++ ){
                if(stelleX(j)>stelleX(j+1)){
                    int temp = stelleX(j+1);
                    stelleX(j+1) = stelleX(j);
                    stelleX(j) = temp;
                }
            
            }
        
        }
    }
            

    public static void main(String[]args){
        Node strat = new Node(888);
        Node m1 = new Node(666);
        Node m2 = new Node(444);
        Node m3 = new Node(222);
        Node m4 = new Node(100);
        Node m5 = new Node(5555);
        
        LinkedList ll = new LinkedList(strat);
        ll.addNode(m1);
        ll.addNode(m2);
        ll.addNode(m3);
        ll.addNode(m4);
        
        ll.addNodePlace(20, m5);
        //ll.deleteNodePlace(0);
        ll.printLinkedList();
        
        System.out.println(ll.nodeSize());
    }
    
}

