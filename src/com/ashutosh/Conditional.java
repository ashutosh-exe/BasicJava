package com.ashutosh;

import java.util.Scanner;

public class Conditional {
    public static void main(String[] args){
        System.out.print("Enter you current salary:");
        Scanner in = new Scanner(System.in);
        int salary = in.nextInt();
        if (salary > 10000 && salary < 20000) {
            salary += 1000;
        } else if (salary > 20000){
            salary += 2000;
        } else {
            salary += 500;
        }
        System.out.println("New salary:"+salary);


    }
}
