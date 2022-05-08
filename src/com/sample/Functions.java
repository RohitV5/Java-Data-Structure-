package com.sample;

import java.util.Arrays;
import java.util.Scanner;

public class Functions {

    public static void main(){

    }

    public static void printMyName() {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("Hello "+name);
    }

    public static void addTwoNumbers() {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(calculateSum(num1, num2));

    }

    public static int calculateSum(int a, int b){
        int sum = a + b;
        return sum;
    }

    public static void multiplyTwoNumbers() {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(calculateProduct(num1, num2));

    }

    public static int calculateProduct(int a, int b){
        return a * b;

    }

    public static int getFactorial() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n < 0){
            System.out.println("Invalid NUmber");
            return 0;
        }
        int factorial = 1;

        for(int i=1;i <= n; i++){
            factorial = factorial * i;
        }
        return factorial;

    }






}
