package com.chinz.category.generic;

import java.util.*;

public class kthDiffElements {
    public static void main(String[] args) {
        Integer arr[] = {1, 3, 5, 6, 11, 8, 1, 15};
        int k = 3;

        method1_BruteForce(arr, k);
        method1_HashMap(arr, k);
        method1_Sorting(arr, k);
    }


    private static void method1_BruteForce(Integer[] arr, int k) {
        System.out.println("==Method 1==");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] - arr[j] == k) {
                    System.out.println("Pair: (" + arr[i] + "," + arr[j] + ")");
                }
            }
        }
    }

    private static void method1_HashMap(Integer[] arr, int k) {
        System.out.println("==Method 2==");
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (set.contains(arr[i] + k)) {
                System.out.println("Pair: (" + arr[i] + "," + (arr[i] + k) + ")");
            }
            if (set.contains(arr[i] - k)) {
                System.out.println("Pair: (" + arr[i] + "," + (arr[i] - k) + ")");
            }
            set.add(arr[i]);
        }
    }

    private static void method1_Sorting(Integer[] arr, int k) {
        System.out.println("==Method 3==");
        List<Integer> list = Arrays.asList(arr);
        Arrays.sort(arr);

        for (int pt1 = 0, pt2 = 1; pt2 < arr.length; ) {
            if ((arr[pt1] - arr[pt2]) == k || (arr[pt2] - arr[pt1]) == k) {
                System.out.println("Pair: (" + arr[pt1] + "," + arr[pt2] + ")");
                pt1++;
                pt2++;
            } else if ((arr[pt1] - arr[pt2]) > k || (arr[pt2] - arr[pt1]) > k) {
                pt1++;
            } else if ((arr[pt1] - arr[pt2]) < k || (arr[pt2] - arr[pt1]) < k) {
                pt2++;
            }
        }
    }

}
