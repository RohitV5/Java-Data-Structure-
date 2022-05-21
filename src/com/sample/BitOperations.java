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

    public static void clearBitAtPosition(int number,  int position) {
        //Bit mask 1 << position
        //Operation: AND with NOT Bit mask
        int bitMask = 1 << position;
        int notBitMask = ~(bitMask);

        int newNumber = notBitMask & number;
        System.out.println(newNumber);

    }


    //Update the number at position with an updateKey(0 or 1)
    public static void updateBitAtPosition(int number,  int position, int updateKey) {
        //Bit mask 1 << position
        //For zero Operation: AND with NOT Bit mask --> zero operation
        //For one Operation: OR  --> clear operation


        if(updateKey == 1){
            setBitAtPosition(number, position);
        }else{
            clearBitAtPosition(number, position);
        }

    }


    //LOGIC: why create a bitmask which is shifted position times -> because we only want to manipulate the bit at specific position
    //so we have to move 1 to somewhere like 100 and that can be done by shifting. this creates a bitmask.

    // To set 1 to 1 and set 0 to 1 we need final result as 1 which can be done using OR
    // To clear 1 or 0 to zero we need to perform an AND operation with 0 so output will always be zero. so we create a bitmask like -> 1000 (perform NOT after shifting) --> 0111 for clearing 4th position

    //WOW this logic was fun! And I got the concept!
}
