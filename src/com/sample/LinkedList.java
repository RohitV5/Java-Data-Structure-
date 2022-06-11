package com.sample;

import java.util.Properties;

public class LinkedList {

    class Node<T> {
        T data;
        //Node class has next as its own type so that it points to its own type
        Node next;

        Node (T data){
            this.data = data;
            this.next = null;
        }
    }

    Node head;


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
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data){
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


    public void PrintList() {
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
        head = head.next;

    }

    //deleting last element from list
    public void deleteLast(){
        if(head == null){
            System.out.println("The list is empty");
            return;
        }
        if(head.next == null){
            head = null;
            return;
        }
        Node secondlast = head;
        Node lastNode = head.next;
        while (lastNode.next != null){
            lastNode = lastNode.next;
            secondlast = secondlast.next;
        }

        //deleting last here
        secondlast.next = null;
    }





}


