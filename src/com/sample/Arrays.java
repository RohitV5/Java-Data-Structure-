package com.sample;

import java.util.Scanner;

public class Arrays {
    //type[]  arrayName = new type[size];

    public static void main(String[] args) {

    }

    public static void marks() {
        int marks[] = new int[10];  //memory allocated for 40 byte because we defined the type of array as int which takes 4 byte and default value is 0 for each element
        marks[0] = 23;
        marks[1] = 65;
        marks[2] = 34;
        for(int i = 0; i < 10;i++){
            System.out.println(marks[i]);
        }
    }

    public static void marks2() {
        int marks[] = {95,95,34};
        for(int i = 0; i < 3;i++){
            System.out.println(marks[i]);
        }
    }


    public static void marksInput() {
        Scanner sc = new Scanner(System.in)  ;
        int size = sc.nextInt();
        int numbers[] = new int[size];

        for(int i = 0; i < size;i++){
            numbers[i] = sc.nextInt();
        }

        //size of array can be fetched from => numbers.length

        for(int i=0; i < size;i++){
            System.out.println(numbers[i]);
        }
    }
}
