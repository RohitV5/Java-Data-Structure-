package com.sample;

public class Recursion {

    //A function that calls itself is called recursive function.
    //In memory recursive calls happen in a stack mode
    //Normally Each function automatically returns if it is void type, so no need to write explicitly. Java identifies that all steps in function got executed and returns void

    public static void printNumberDesc(int n) {
        if(n==0){
            return;
        }
        System.out.println("n = " + n);
        printNumberDesc(n-1);

    }

    public static void printNumberAsc(int from,int to) {
        if(from > to){
            return;
        }
        System.out.println("n = " + from);
        printNumberAsc(from+1,to);

    }


    public static void printSum(int i,int n,int sum) {
        if(i==n){
            sum += i;
            System.out.println(sum);
            return;
        }
        sum += i;
        printSum(i+1,n,sum);

    }

    public static int sum(int n) {
        if(n==1){
            return(1);
        }
        return(n+sum(n-1));

    }
}
