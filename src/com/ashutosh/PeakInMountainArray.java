package com.ashutosh;

public class PeakInMountainArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,1};
        int target = 6;
        int peak = peakElement(arr);
        int ans = binarySearch(arr,0,peak,target);
        if(ans != -1){
            System.out.println(ans);;
        }
        else {
            System.out.println(binarySearch(arr,peak+1, arr.length-1,target));
        }

        }
        static int peakElement(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int mid = start + (end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end = mid;
            }
            else{
                start = mid+1;
            }
        }
        return start;
        }
        static int binarySearch(int[] arr,int start,int end,int target){
        boolean isAsc = start<end;
            while(start<=end){
                int mid = start + (end - start)/2;
                    if(arr[mid]==target){
                        return mid;
                    }
                    if(isAsc){
                        if(arr[mid]<target){
                            start = mid+1;

                        }else {
                            end = mid-1;
                        }
                    }else {
                        if (arr[mid]<target){
                            end = mid-1;
                        }
                        else {
                            start = mid+1;
                        }
                    }
            }
            return -1;
        }
    }
