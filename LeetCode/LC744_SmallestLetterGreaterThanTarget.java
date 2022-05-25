package com.sanket.Questions.LeetCode;

public class LC744_SmallestLetterGreaterThanTarget {
    public static void main(String[] args){
        char[] letters={'a','f','k','n','s','z'};
        char target='s';
        System.out.println(nextGreatestLetter(letters,target));
    }

    static char nextGreatestLetter(char[] arr, char target) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else  {
                end = mid - 1;
            }
        }

        for (char character:arr){
            if (character==target) start+=1;
        }

        return arr[start % arr.length];
    }
}
