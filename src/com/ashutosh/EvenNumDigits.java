package com.ashutosh;

public class EvenNumDigits {
    public static void main(String[] args) {
        int[] nums = {12,345,45,89,456};
        System.out.println(digits(nums));
    }
    static int digits(int[] nums){
        int count = 0;
        for(int num:nums){

            if(evenCount(num) % 2 == 0){
                count++;
            }
        }return count;
    }
    static int evenCount(int num){
        if(num<0){
            num = num * -1;
        }
      //  return (int)(Math.log10(num)+1);
        int count = 0;
        while (num>0){
            num = num/10;
            count++;

        }
        return count;
    }
}
