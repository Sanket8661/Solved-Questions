package com.sanket.Questions;

//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
//1295. Find Numbers with Even Number of Digits.
//Given an array nums of integers, return how many of them contain an even number of digits.


public class LC1295_EvenNosOfDigits {
    public static void main(String[] args){
        int[] nums= {12,345,2,34,21111,3888,6,7896};

        System.out.println(findNumbers(nums));
    }

    static int findNumbers(int[] nums){
        int numbersCount=0, digitCount;
        for(int element: nums){
            digitCount=0;
            while (element>0){
                digitCount+=1;
                element/=10;
            }
            if (digitCount%2==0) numbersCount+=1;
        }

        return numbersCount;

    }
}
