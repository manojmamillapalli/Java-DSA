package com.arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {10,2, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 4;
        int[] ans = better(arr, target);

        if (ans[0] != -1)
            System.out.println("Indices: " + ans[0] + ", " + ans[1]);
        else
            System.out.println("No pair found");
    }

    // Brute-force approach
    public static int[] bruteforce(int[] arr, int target) {
        int[] ans = {-1, -1};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    ans[0] = i;
                    ans[1] = j;
                    return ans; // return early once found
                }
            }
        }
        return ans;
    }

    // Better approach using HashMap
    public static int[] better(int[] arr, int target) {
        int[] ans = {-1, -1};
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int req = target - arr[i];

            if (map.containsKey(req)) {
                ans[0] = map.get(req);
                ans[1] = i;
                return ans;
            }

            map.put(arr[i], i);
        }
        return ans;
    }
}
