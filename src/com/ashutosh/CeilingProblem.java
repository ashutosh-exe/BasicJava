package com.ashutosh;

public class CeilingProblem {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 4;
        System.out.println(ceiling(arr,target));

    }
    static int ceiling(int[] arr,int target){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            /*    if(arr[mid+1]>target){
                    return mid+1;
                }

             */


            }else{
                end = mid - 1;
             /*   if(arr[mid-1]>target){
                        return mid-1;
                    }

              */

                }
            }
        return start;
        }

    }

