package com.sample;

public class BitOperations {
    public static void main() {

    }
    //get the 2nd bit (position=1) of the number n (n=0101)
    public static void getBitAtPosition(int number,  int position) {
        //1. Bit mask 1<<position
        //2.Operation: AND
        //Create a bitmask for thr input number
        // Perform an operation with number and bitmask expecting a value at specific position
        // Positioning starts from 0
        /*
        *Create a bitmask by shifting 1 by position parameter e.g. if we are looking for a bit at
        * 2nd position then left shift 1 by 2 i.e. 0001 >> 2 becomes 0100. simply add 0 position times
        * toward left side.
        * */

        // Explanation of left shift here -> https://www.youtube.com/watch?v=BKzB6gdRyIM
        // bit mask of 0101 << 2 is 0100 --
        // Now 0101 AND 0100 = 0100 >> so the final output is non-zero that means the number at 2 position was 1
        //if the final output after AND was zero then it was 0.
        int bitMask = 1 << position;
        if((bitMask & number)==0){
            System.out.println("bit was zero");
        }else{
            System.out.println("bit was one");
        }

        //For different problems different kind of bit mask is created. In this example we created a mask
        // using left shift of 1 by number of positions.

    }

    //set the 2nd bit (position=1) of the number n (n=0101)
    public static void setBitAtPosition(int number,  int position){
        //1. Bit mask 1<<position
        //2.Operation: OR

        //Create a bitmask for thr input number
        // Perform an operation with number and bitmask expecting a value at specific position
        // Positioning starts from 0
        /*
         *Create a bitmask by shifting 1 by position parameter e.g. if we are looking for a bit at
         * 2nd position then left shift 1 by 2 i.e. 0001 >> 2 becomes 0100. simply add 0 position times
         * toward left side.
         * */

        // Explanation of left shift here -> https://www.youtube.com/watch?v=BKzB6gdRyIM
        // bit mask of 0101 << 2 is 0100 --
        // Now 0101 AND 0100 = 0100 >> so the final output is non-zero that means the number at 2 position was 1
        //if the final output after AND was zero then it was 0.
        int bitMask = 1 << position;
        int newNumber = number | bitMask;
        System.out.println(newNumber);

        //For different problems different kind of bit mask is created. In this example we created a mask
        // using left shift of 1 by number of positions.

    }
}
