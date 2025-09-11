package com.ashutosh;

import java.util.Scanner;

//public class Reverse {
//
////    public static void main(String[] args) {
////        System.out.print("Enter a number:");
////        Scanner in = new Scanner(System.in);
////        int num = in.nextInt();
////        while(num>0){
////            int a = num%10;
////            num = num / 10;
////            System.out.print(a);
////        }
////
////    }
//}
public class Reverse{
    public static void main(String[] args) {
        System.out.print("Enter a number:");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int sum = 0;
        while(num>0){
            int rem = num % 10;
            sum = sum * 10 + rem;
            num = num/10;
        }
        System.out.println(sum);
    }
}