package com.sanket.Questions.Others;

// LeetCode Q.1095 Find in mountain array.

public class FindElementInMountainArray {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 6, 8, 10, 12, 11, 9, 7, 5, 2, 0};
        int target = 11;
        System.out.println(searchInMountain(arr, target));
    }

    static int searchInMountain(int[] arr, int target) {
        int peak = findPeak(arr);
        int firstHalf = orderAgnosticBS(arr, target, 0, peak);
        if (firstHalf != -1) {
            return firstHalf;
        }
        return orderAgnosticBS(arr, target, peak + 1, arr.length - 1);
    }

    static int findPeak(int[] arr) {
        int start = 0, end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }

    static int orderAgnosticBS(int[] arr, int target, int start, int end) {
        boolean isAsc = arr[start] < arr[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return mid;
            }
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }

}
