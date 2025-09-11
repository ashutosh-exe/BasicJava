package com.ashutosh;

public class GreatestElement {
    public static void main(String[] args) {
        int[] arr = {1,53,3,64,5};
        int m = max(arr);
        System.out.println(m);

    }
    static int max(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>max){
                max = arr[i];
            }

        }
        return max;
    }
}
