package com.ashutosh;

import java.util.Scanner;

public class ArmstrongNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        Boolean ans = isArmstrong(n);
//        System.out.println(ans);
        for (int i = 100; i < 1000; i++) {
            if(isArmstrong(i)){

                System.out.println(i);
            }
             
        }
    }
    static Boolean isArmstrong(int n){
        int og = n;
        int sum = 0;
        while (n>0){
            int rem = n%10;
            int cube = rem * rem * rem;
            sum = sum + cube;
            n = n/10;
        }
        return sum == og;
    }
}
