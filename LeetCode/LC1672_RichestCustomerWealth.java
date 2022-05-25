package com.sanket.Questions;

//https://leetcode.com/problems/richest-customer-wealth/
//1672. Richest Customer Wealth


public class LC1672_RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] accounts = {
                {1,2,3},
                {1,2,3},
                {3,2,1}
        };
        System.out.println(maximumWealth(accounts));

    }

    static int maximumWealth(int[][] accounts) {
        int max=0,totalWealth;
        for (int[] account: accounts){
            totalWealth=0;
            for (int wealth: account){
                totalWealth+=wealth;
            }
            if (max<totalWealth) max=totalWealth;
        }
        return max;
    }
}
