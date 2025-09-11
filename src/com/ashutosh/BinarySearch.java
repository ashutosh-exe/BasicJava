package com.ashutosh;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {12,14,15,16,20,45,65,99};
        int target = 99;
        System.out.println(binarySearch(arr,target));
    }
    static int binarySearch(int[] arr,int target){
        int start = 0;
        int end = arr.length - 1;

        while(start<=end){
            int mid = start + (end-start)/2;
            if(target<arr[mid]){
                end = mid - 1;
            } else if (target>arr[mid]) {
                start = mid+1;
            }else{
                return mid;
            }
        }return -1;
    }
}
