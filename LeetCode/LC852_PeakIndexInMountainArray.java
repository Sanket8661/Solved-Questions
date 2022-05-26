package com.sanket.Questions.LeetCode;

public class LC852_PeakIndexInMountainArray {
    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 8, 9, 10, 9, 8, 1};
        System.out.println(binarySearch(arr));

    }

    static int binarySearch(int[] arr) {
        int start = 0, end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
}
