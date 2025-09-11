package com.ashutosh;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.print("Enter number of terms:");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int num1 = 0;
        int num2 = 1;
        int sum = 0;
        System.out.print("Series:");
        if (num == 1) {
            System.out.println(0);
        } else if (num == 2) {
            System.out.println(num1+" "+num2);

        } else {
            for (int i = 1; i <= num; i++) {
                System.out.print(sum + " ");

                sum = num1 + num2;
                num1 = num2;
                num2 = sum;


            }
        }
    }
}
