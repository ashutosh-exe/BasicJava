package com.ashutosh;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        System.out.print("Enter a number:");

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        for(int i = 1;i <= n; i++){
            System.out.println("Hello World!");
        }
    }
}
