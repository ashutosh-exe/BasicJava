package com.ashutosh;

import java.util.Scanner;

public class CountNums {
    public static void main(String[] args) {
        System.out.print("Enter a number:");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = 0;
        while(n>0){
            if(n%10==3){
                count++;

            }
        n = n/10;


        }
        System.out.println(count);
    }
}
