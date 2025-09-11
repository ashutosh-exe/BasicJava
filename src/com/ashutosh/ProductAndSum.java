package com.ashutosh;

public class ProductAndSum {
    public static void main(String[] args) {
        int n = 234;
        System.out.println(subtractProductAndSum(n));

    }
    static int subtractProductAndSum(int n) {

        int sum = 0;
        int product = 1;

        while(n>0){
            sum = sum+n%10;
            product=product*(n%10);
            n = n/10;
        }
        return product-sum;


    }
}
