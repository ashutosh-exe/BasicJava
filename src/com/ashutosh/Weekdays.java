package com.ashutosh;

import java.util.Scanner;

public class Weekdays {
    public static void main(String[] args) {
        System.out.print("Enter the day of the week:");
        Scanner in = new Scanner(System.in);
        int day = in.nextInt();
        switch (day){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekday");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("There are only 7 days in a week");
        }
    }
}

//public class Weekdays {
//    public static void main(String[] args) {
//        System.out.print("Enter the day of the week:");
//        Scanner in = new Scanner(System.in);
//        int day = in.nextInt();
//
//        switch (day) {
//            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
//            case 6, 7 -> System.out.println("Weekend");
//            default -> System.out.println("There are only 7 days in a week");
//        }
//    }
//}
