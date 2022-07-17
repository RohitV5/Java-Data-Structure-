package com.sample;

import java.util.Properties;

public class LinkedList {

    class Node {
        int data;
        Node next;         //Node class has next as its own type so that it points to its own type

        Node (int data){
            this.data = data;
            this.next = null;   //for new node the next is always null
            size++;
        }
    }

    //Head is a must to track the node elements
    Node head;

    //Size to track the size of a linked list
    private int size;

    //Java utils class has a built-in linked list type

    LinkedList(){
        this.size = 0;
    }

    public Node get(int index) {
        Node currNode = head;
        for(int i=1;i<index;i++){
            currNode = currNode.next;
        }
        return currNode;
    }

    public int search(int data) {
        Node currNode = head;
        int position = 1;
        if(currNode.data == data){
            return position;
        }

        for(int i=1;i<size;i++){
            currNode = currNode.next;
            position++;
            if(currNode.data == data){
                return position;
            }
        }

        return 0;
    }







    //ArrayList   Insert O(n)   Search O(1)
    //LinkedList  Insert 0(1)   Search O(n)

    /*Linked list Properties
     *Variable Size
     *Non-contigous strcuture
     *Insert in O(1)
     * Search in O(n)
     * Made up of nodes
     * Each node has address of next node and data
     * First node is called HEAD
     * Last node is TAIL
     */
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        //Start the current node from head, this value is used to store the current last node
        Node currNode = head;


        //run loop till we find the last element. The next of last element is always null
        while(currNode.next != null){
            currNode = currNode.next;
        }

        //Once you get the last node just assign the last node next to point to new Node
        currNode.next = newNode;
    }


    public int getSize() {
        return size;
    }


    public void printList() {
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.print("NULL");
    }


    //deleting first element from list
    public void deleteFirst(){
        if(head == null){
            System.out.println("The list is empty");
            return;
        }
        size--;
        head = head.next;

    }

    //deleting last element from list
    public void deleteLast(){
        if(head == null){
            System.out.println("The list is empty");
            return;
        }
        size--;
        if(head.next == null){
            head = null;
            return;
        }

        //if list has more than one element;
        Node secondlast = head;
        Node lastNode = head.next;
        while (lastNode.next != null){
            lastNode = lastNode.next;
            secondlast = secondlast.next;
        }

        //deleting last here
        secondlast.next = null;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFirst(21);
        list.addLast(22);
        list.addFirst(20);
        list.deleteFirst();
        list.printList();
        list.getSize();


        //iterating over custom linked list
        for (int i = 1; i <= list.getSize();i++){
            System.out.println(list.get(i).data +"");
        }

        System.out.println("Found at position"+ list.search(21));

    }




}


// https://www.youtube.com/watch?v=oAja8-Ulz6o&t=1438s&ab_channel=ApnaCollege

