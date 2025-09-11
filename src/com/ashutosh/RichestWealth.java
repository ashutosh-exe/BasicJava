package com.ashutosh;

public class RichestWealth {
    public static void main(String[] args) {
        int[][] acc = {
                {1,2,3},
                {3,2,1}
        };
        System.out.println(maximumWealth(acc));
    }
    static int maximumWealth(int[][] acc){
        int maxValue = 0;

        for (int i = 0; i < acc.length; i++) {
            int sum = 0;
            for (int j = 0; j < acc[i].length; j++) {

                sum = sum + acc[i][j];
            }
            if(sum>maxValue){
                maxValue = sum;
            }
        }
        return maxValue;
    }
}
