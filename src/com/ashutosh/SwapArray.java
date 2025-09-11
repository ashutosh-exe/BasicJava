package com.ashutosh;

import java.util.Arrays;

public class SwapArray {
    public static void main(String[] args) {
        int[] arr = {3, 34, 453, 12, 245};
        swap(arr,0,3);
        System.out.println(Arrays.toString(arr));

    }static void swap(int[] arr,int i1,int i2){
        int temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;

    }
}
