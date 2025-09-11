package com.ashutosh;

import java.util.Scanner;

public class Greatest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number:");
        int a = in.nextInt();
        System.out.print("Enter the second number:");
        int b = in.nextInt();
        System.out.print(("Enter the third number:"));
        int c = in.nextInt();

        if(b>a){
            System.out.println(b + "is maximum");
        } else if (c>a) {
            System.out.println(c + "is maximum");

        }else {
            System.out.println(a+" is maximum");
        }
    }
}
