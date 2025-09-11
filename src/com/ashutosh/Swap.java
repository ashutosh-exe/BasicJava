package com.ashutosh;

import java.util.Scanner;

public class Swap {
    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.print(a+" "+b);


    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        swap(a,b);
    }
}
