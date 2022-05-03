package com.sample;

public class PatternAdvance {
    /*
    @Pattern:butterflyPattern
    *     *
    **   **
    *** ***
    *******
    *******
    *** ***
    **   **
    *     *

     */
    public static void butterflyPattern() {
        int n = 5;
        //upper half
        for (int i = 1; i <= n; i++) {
            //1st part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            int spaces = 2 * (n - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }


            //2nd part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


        //lower half
        for (int i = n; i >= 1; i--) {
            //1st part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            int spaces = 2 * (n - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }


            //2nd part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }


    /*
     @Pattern:rhombusPattern
         *****
        *****
       *****
      *****
     *****
     */
    public static void rhombusPattern() {
        int n = 6;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // TODO: Empty Rhombus
    /**
     *      *****
     *     *   *
     *    *   *
     *   *   *
     *  *****
     *
     */

    /**
     * @Pattern:numberPyramid
     *     1
     *    2 2
     *   3 3 3
     *  4 4 4 4
     * 5 5 5 5 5
     *
     */
    public static void numberPyramid(){
        int n = 5;

        for (int i=1;i<=5;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1; j <= i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
