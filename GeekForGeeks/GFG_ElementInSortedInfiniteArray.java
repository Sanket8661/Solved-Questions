package com.sanket.Questions.GeekForGeeks;

//Find position of an element in a sorted array of infinite numbers
//https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/

public class GFG_ElementInSortedInfiniteArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 13, 15, 18, 23, 24, 26, 28, 31, 34, 36, 38, 39, 41, 43, 45, 46, 49, 52, 53, 54, 55, 58, 61, 64, 65};
        int target = 26;
        System.out.println(arr[15]);
        System.out.println(setRange(arr, target));
    }

    static int setRange(int[] arr, int target) {
        int start = 0, end = 1;
        while (arr[end] < target) {
            start = end;
            end += end;
        }
        return (bSearch(arr, target, start, end));
    }

    static int bSearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
