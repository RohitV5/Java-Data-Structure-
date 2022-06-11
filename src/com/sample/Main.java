package com.sample;

import java.util.Arrays;

import static com.sample.Pattern.*;
import static com.sample.PatternAdvance.*;
import static com.sample.Functions.*;
import static com.sample.Arrays.*;
import static com.sample.TwoDArrays.*;
import static com.sample.Strings.*;
import static  com.sample.BitOperations.*;
import static  com.sample.SortBasic.*;
import static com.sample.Recursion.*;



//All code is written inside classes and class name is same as file name
public class Main {


    //main function is the entry point
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFirst(21);
        list.addLast(22);
        list.addFirst(20);
        //list.deleteFirst();
        //list.printList();
        //list.getSize();


        //iterating over custom linked list
        //for (int i = 1; i <= list.getSize();i++){
        //System.out.println(list.get(i).data +"");
        //
        //}
        System.out.println("Found at position"+ list.search(24));


    }







}
