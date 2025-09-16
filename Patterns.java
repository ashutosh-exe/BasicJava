package com.ashutosh;

public class Patterns {
    public static void main(String[] args) {
        pattern1(4);
        pattern2(5);
        pattern3(5);
        pattern4(4);
        pattern5(4);
        pattern6(4);
        pattern7(5);
    }
    static void pattern1(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        /*

         *
         * *
         * * *
         * * * *

         */
    }
    static void pattern2(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        /*

         * * * * *
         * * * * *
         * * * * *
         * * * * *

         */
    }
    static void pattern3(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n-row+1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        /*

         * * * * *
         * * * *
         * * *
         * *
         *

         */
    }
    static void pattern4(int n){
        for (int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
        /*
        1
        1 2
        1 2 3
        1 2 3 4
         */
    }
    static void pattern5(int n){
        for(int row=0;row<2*n;row++){
            int actualCol = row > n ? 2*n-row:row;
            for (int col = 0; col < actualCol; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        /*

         *
         * *
         * * *
         * * * *
         * * *
         * *
         *

         */
    }
    static void pattern6(int n){
        for (int row = 1;row <= 2*n-1; row++) {
            int actualCol = row > n ? 2*n-row:row;
            int noOfSpace = n-actualCol;
            for (int space = 1; space <= noOfSpace; space++) {
                System.out.print(" ");
            }
            for (int col = 1;col<=actualCol;col++){
                System.out.print("* ");
            }
            System.out.println();

        }
        /*
           *
          * *
         * * *
        * * * *
         * * *
          * *
           *

         */

    }
    static void pattern7(int n){
        for (int row = 1; row <= n; row++) {
            for(int space=0;space < n-row;space++){
                System.out.print("  ");
            }
            for (int col = row; col >= 1; col--) {
                System.out.print(col+" ");
            }
            for(int col = 2;col<=row;col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
        /*
        1       1
      2 1 2
    3 2 1 2 3
  4 3 2 1 2 3 4
5 4 3 2 1 2 3 4 5
         */
    }
}
