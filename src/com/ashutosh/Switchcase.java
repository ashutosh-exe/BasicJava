package com.ashutosh;

import java.util.Scanner;

public class Switchcase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();
        switch (fruit){
            case "Mango":
                System.out.println("King of Fruits");
                break;
            case "Apple":
                System.out.println("Sweet red fruit");
                break;
            case "Orange":
                System.out.println("Small and round fruit");
                break;
            case "Banana":
                System.out.println("Yellow fruit");
                break;
            default:
                System.out.println("Enter a valid fruit");
        }
    }
}
//switch (fruit) {
//        case "Mango" -> System.out.println("King of Fruits");
//            case "Apple" -> System.out.println("Sweet red fruit");
//            case "Orange" -> System.out.println("Small and round fruit");
//            case "Banana" -> System.out.println("Yellow fruit");
//default -> System.out.println("Enter a valid fruit");