package com.sample;

import java.util.Scanner;

public class Strings {
    public static void main() {

    }

    //Strings are immutable - once created they can't be changed in memory
    // if you assign it a new value then it will point to a new memory.
    //Hence using string builder we can solve this problem

    public static void stringCompare() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string");
        String str1 = sc.nextLine();
        System.out.println("Enter second string");
        String str2 = sc.nextLine();

        //1 s1 > s2 : +ve value
        //2 s1 == s2 : 0
        //3 s1 < s2 : -ve value

        //First character which is dissimilar is compared and the bigger character wins

        //correct way to compare
        if(str1.compareTo(str2) == 0){
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }


        //this fails sometimes
        if(str1 == str2){
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }


    }


    public static void stringBuilder() {

        StringBuilder b = new StringBuilder("Tony");
        b.setCharAt(0,'P');
        b.insert(2,"n");
        b.delete(2,4);
        b.append("l");
        System.out.println(b);

    }


    public static void reverseString() {

        StringBuilder sb = new StringBuilder("hello");

        for(int i=0;i < sb.length()/2;i++){
            int front = i;
            int  back = sb.length() - 1-i;

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front,backChar);
            sb.setCharAt(back,frontChar);

        }

        System.out.println(sb);

    }
}
