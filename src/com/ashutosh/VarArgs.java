package com.ashutosh;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(2,9,8,4,3,4,56,8,564);

    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
