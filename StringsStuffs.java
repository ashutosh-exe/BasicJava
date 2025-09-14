package com.ashutosh;

import java.util.Arrays;

public class StringsStuffs {
    //just a class inside java which is immutable
    public static void main(String[] args) {
//        String name1 = "Ashutosh";
//        String name2 = "Ashutosh";
//        System.out.println(name1.equals(name2));
//        //this returns true
        String name1 = new String("Ashutosh");
        String name2 = new String("Ashutosh");
        System.out.println(name1);
        System.out.println(name1 == name2); //here '==' comparator checks if both name 1 and name 2 is pointing to same objects
        //this simply returns false
        System.out.println(name1.equals(name2)); //here '.equals' method check if the two objects are same
        //returns true
        System.out.println(name1.length());
        //gives the length of the string
        System.out.println(name1.toString());
        //here using toString method is pointless to use because it is used by default by the java libraries while printing any data type
        System.out.println(name1.charAt(4));
        //prints the character at the index number 4 in the string
        System.out.println(name1.toLowerCase());
        //prints the string in lower case
        System.out.println(name1.toUpperCase());
        //prints in upper case
        System.out.println(name1.indexOf("to"));
        //gives me the index where this 'to' string begins
        System.out.println(name1.lastIndexOf('h'));
        //gives the index of last appearance of the character 'h' in the string
        System.out.println((char)('t'+3));
        //this gives me 'w' but if not typecasted it returns the ascii value of w which is 119
        System.out.println(Arrays.toString(name1.split("")));
        //makes the array of the given string
        System.out.println(name1.strip());
        //removes the empty spaces before or after the string
        System.out.println(name1.replaceAll("s","v"));
        //replaces all 's' character in the string with 'v'
        System.out.println(name1.trim());
        //looks like strip and trim work in same way
        System.out.println(name1.subSequence(0,3));
        //gives substring of elements from index 0 to 3 in the string
        System.out.println(Arrays.toString(name1.getBytes()));
        //gives me an array of ascii values of the characters in the string


        //these are some basic string methods there are many more better explore them
    }

}
