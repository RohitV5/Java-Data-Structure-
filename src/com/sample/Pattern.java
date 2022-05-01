package com.sample;

public class Pattern {

    /**
     * @Pattern:star_pattern
     * ****
     * ****
     * ****
     **/
    public static void solidPattern() {
        int n = 4;
        int m = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    /**
     * @Pattern:hollow_star_pattern
     * ****
     * *__*
     * *__*
     * ****
     **/
    //only starting and finishing index has a star
    public static void hollowPattern() {
        int n = 4;
        int m = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (i == 1 || i == n || j == 1 || j == m) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }

    /**
     * @Pattern:triangle_star_pattern
     * *
     * **
     * ***
     * ****
     **/
    public static void trianglePattern() {
        int n = 4;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");


            }
            System.out.println();
        }
    }

    /**
     * @Pattern:invert_triangle_star_pattern
     * ****
     * ***
     * **
     * *
     **/
    public static void invertTrianglePattern() {
        int n = 4;

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");


            }
            System.out.println();
        }
    }

    /**
     * @Pattern:invert_triangle_star_pattern_two
     *     *
     *    **
     *   ***
     *  ****
     * *****
     **/
    public static void invertTrianglePatternTwo() {
        int n = 4;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=n-i ; j++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    /**
     * @Pattern:half_pyramid_with_number_pattern
     * 1
     * 12
     * 123
     * 1234
     * 12345
     **/
    // HInt: n-i space and i star in each row
    public static void halfPyramidWithNumberPattern() {
        int n = 4;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);


            }
            System.out.println();
        }
    }

    /**
     * @Pattern:inverted_half_pyramid_with_number_pattern
     * 12345
     * 1234
     * 123
     * 12
     * 1
     **/
    public static void invertedHalfPyramidWithNumberPattern() {
        int n = 4;

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);


            }
            System.out.println();
        }
    }


    /**
     * @Pattern:Floyd's Triangle
     * 1
     * 2 3
     * 4 5 6
     * 7 8 9 1 0
     * 11 12 13 14 15
     **/
    public static void floyds_triangle_Pattern() {
        int n = 5;
        int number = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number++ + " ");
            }
            System.out.println();
        }
    }


    /**
     * 0-1 Triangle
     * 1
     * 0 1
     * 1 0 1
     * 0 1 0 1
     * 1 0 1 0 1
     **/
    //Hint in matrix format if sum of cell i +j is even then print 1 if odd then print 0
    public static void zero_one_triangle_Pattern() {
        int n = 5;
        int number = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((i+j) %2 + " ");
            }
            System.out.println();
        }
    }



}
