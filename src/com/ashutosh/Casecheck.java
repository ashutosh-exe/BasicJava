package com.ashutosh;

import java.util.Scanner;

public class Casecheck {
    public static void main(String[] args) {
        System.out.print("Enter the letter:");
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0);
        if (ch >= 'a' && ch <= 'z'){
            System.out.println("Lowercase");

        }
        else {
            System.out.println("Uppercase");
        }
    }
}
