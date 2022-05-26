package com.sanket.Questions.LeetCode;

import java.util.Arrays;
import java.util.Scanner;

public class LC34_FirstandLastPositionofElementInSortedArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] nums = {5, 7, 7, 8, 8, 10};
        System.out.print("Enter the number you want to search : ");
        int target = input.nextInt();

        System.out.println(Arrays.toString(searchRange(nums, target)));


    }

    static int[] searchRange(int[] nums, int target) {

        int[] ans = {-1, -1};
        // check for first occurrence if target first
        ans[0] = binarySearch(nums, target, true);
        if (ans[0] != -1) {
            ans[1] = binarySearch(nums, target, false);
        }
        return ans;

    }

    static int binarySearch(int[] nums, int target, boolean searchFirstIndex) {
        int start = 0, end = nums.length - 1, ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                ans = mid;
                if (searchFirstIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
