package com.ashutosh;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Boolean ans = isPrime(n);
        System.out.println(ans);
    }
    static boolean isPrime(int n){
        if (n<=1){
            return false;

        }
        int i = 2;
        while (i * i <= n){
            if (n%i==0){
                return false;
            }
            i++;

        }
        return i*i>n;
    }
}
