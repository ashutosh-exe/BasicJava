package com.ashutosh;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter you name:");
        String name = in.next();
        String message = myGreet(name);
        System.out.println(message);
    }static String myGreet(String name){
        return("Hello " + name);
        }
}
