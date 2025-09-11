package com.ashutosh;

import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        int[] arr = {9, 45, 46, 25, 16};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void change(int[] nums) {
        nums[0] = 99;
    }
}