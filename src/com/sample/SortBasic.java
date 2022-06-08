package com.sample;

public class SortBasic {

    //BUBBLE SORT
    //the largest element bubble up in each iteration
    //each element compared with the next one and switch position if required
    //Time complexity = O(n^2) - Not good for sorting
    //swapping happens a lot here
    public static void bubbleSort() {
        int arr [] = {7,8,3,1,2};

        //bubble sort
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j < arr.length-i-1;j++){
                if(arr[j] > arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        printArray(arr);
    }

    //SELECTION SORT
    //get the smallest over an iteration and swap it with the iteration position - 1 ie [0] first time
    //Time complexity = O(n^2) - Not good for sorting
    //swapping happens at the end of inner loop gets over
    public static void selectionSort() {
        int arr [] = {7,8,3,1,2};

        //bubble sort
        for(int i=0;i<arr.length-1;i++){
            int smallest = i;
            for(int j = i+1 ; j < arr.length ; j++){
                if(arr[smallest] > arr[j]){
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        printArray(arr);
    }

    //INSERTION SORT
    //divide the array in two part sorted part and unsorted path
    //sorted part gets bigger and unsorted part gets smaller eventually unsorted part is zero
    //sorted part starts with one element
    //Time complexity = O(n^2) - Not good for sorting
    public static void insertionSort() {
        int arr [] = {2,8,3,1,7,9};

        //insertion sort
        for(int i=1;i < arr.length;i++){
            int current = arr[i]; //starts from 2nd element
            int j = i - 1;  //j start frm 1st element index
            // using j to track sorted part so starts from first element in first loop
            while(j >= 0 && current < arr[j]){   //we get out of while loop if condition becomes false
                //current start from 2nd element and goes one up very loop
                //place in sorted part
                //if current is less than biggest in sorted part we create space and move index in sorted part
                arr[j+1] = arr[j];  // moving element to upper index
                j--;  // updated index where to place the current element
            }

            //j always run till zero
            //placement
            System.out.println(j);
            arr[j+1] = current;  // j becomes

        }

        printArray(arr);


    }






    public static void printArray(int[] arr) {
        for(int i= 0; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
