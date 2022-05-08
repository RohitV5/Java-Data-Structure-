package com.sample;

import java.util.Scanner;

public class TwoDArrays {

    public static void main() {

    }

    /*
    2D arrays are same as matrix except the matrix starts at (0,0) instead of (1,1)
     */
    public static void twoDimArray() {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int userArray[][] = new int[rows][cols];

        //input
        for(int i = 0; i < rows; i++){  //loop for rows
            for(int j = 0; j < cols; j++){ //loop for column
                userArray[i][j] = sc.nextInt();
            }
        }

        //output
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                System.out.print(userArray[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static void twoDimArraySearch() {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int userArray[][] = new int[rows][cols];

        //input
        for(int i = 0; i < rows; i++){  //loop for rows
            for(int j = 0; j < cols; j++){ //loop for column
                userArray[i][j] = sc.nextInt();
            }
        }

        System.out.println("Input the number to search for");
        int numSearch = sc.nextInt();
        boolean isFound = false;

        //output
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(numSearch == userArray[i][j]){
                    isFound = true;
                    System.out.print("Number found at row "+i+" and column "+ j );

                }
            }

        }

        if(!isFound){
            System.out.println("Number not found");
        }
    }
}
