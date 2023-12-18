package LeetCode;

import java.util.Arrays;

public class MultiArray {
    public static int maximumWealth(int[][] accounts) {
        int sum = 0;
        int maxWealth = 0;

        for(int i=0; i<accounts.length; i++){
            for (int j= 0; j<accounts[i].length; j++){
                sum = sum + accounts[i][j];
            }
            int temp = sum;
            sum=0;

            if(temp >= maxWealth){
                maxWealth = temp;
            }
        }
        System.out.println(maxWealth);
        return maxWealth;

    }

    public static void main(String[] args) {
        int[][] accounts = {
                {1, 2, 3},
                {4, 5, 6, 9},
                {7},
        };
        maximumWealth(accounts);
    }
}
