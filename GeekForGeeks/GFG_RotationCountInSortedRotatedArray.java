package com.sanket.Questions.GeekForGeeks;

//https://www.geeksforgeeks.org/find-rotation-count-rotated-sorted-array/


public class GFG_RotationCountInSortedRotatedArray {
    public static void main(String[] args) {
//        int[] nums = {4, 5, 6, 7,9,13,17,20,24, 1,};
        int[] nums = {4, 1, 2};
        System.out.println(findPivot(nums) + 1);
    }

    static int findPivot(int[] arr) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            } else if (start < mid && arr[mid - 1] > arr[mid]) {
                return mid - 1;
            } else if (arr[start] >= arr[mid]) {
                end = mid - 1;
            } else {
                start = mid;
            }
        }
        return -1;
    }
}
