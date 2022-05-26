package com.sanket.Questions.LeetCode;

//33. Search in Rotated Sorted Array
//https://leetcode.com/problems/search-in-rotated-sorted-array/

public class LC33_SearchInRotatedSortedArray {
    public static void main(String[] args) {
//        int[] nums = {2,5,8,11,14,16,19,22};
//        int[] nums = {4, 5, 6, 7, 0, 1, 2};

        int[] nums = {3, 5, 1};

        int target = 3;
        System.out.println(search(nums, target));
    }

    static int search(int[] nums, int target) {

        int pivot = findPivot(nums);

        if (pivot == -1) {
            return binarySearch(nums, target, 0, nums.length - 1);
        }

        if (target == nums[pivot]) return pivot;

        if (target >= nums[0]) {
            return binarySearch(nums, target, 0, pivot - 1);
        }
        return binarySearch(nums, target, pivot + 1, nums.length - 1);
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

    static int binarySearch(int[] arr, int target, int start, int end) {
//        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else return mid;
        }
        return -1;
    }
}
