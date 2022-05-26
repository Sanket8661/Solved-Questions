package com.sanket.Questions.Others;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class CeilingAndFloorOfNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {3, 5, 7, 9, 23, 45, 67, 69, 78, 79, 83, 86, 92, 94, 99};
        System.out.println("This is the array you have : " + Arrays.toString(arr));
        System.out.println("Select whether you want ceiling or floor of a number");
        String choice = input.next();
        System.out.println("Enter a number that you want to search");
        int num = input.nextInt();
        System.out.println(binarySearch(arr, num, choice));
    }

    static int binarySearch(int[] arr, int target, String choice) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return arr[mid];
            }
        }
        if (Objects.equals(choice, "ceiling")) {
            return arr[start];
        } else return arr[end];

    }
}
