package com.chinz.category.dp;

import java.util.Arrays;

/*
Coin change Problem
1. Here we make loop over given set of coins
2. In every iteration we subtract n-arr[i] and make a recursive call
3. This continues until it returns 0 i.e we have set of coins equal to given n
4. If this doesn't
 */
public class coinChangeDP1 {
    public static void main(String[] args) {
        int n = 15;
        int[] arr = new int[]{7, 5, 2};
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        dp[0] = 0;

        int m = minCoinChange(n, arr, dp);
        System.out.println(m);
        for (int i : dp) {
            System.out.print(i + " ");
        }
    }

    private static int minCoinChange(int n, int[] arr, int[] dp) {
        if (n == 0) return 0;
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {

            if (n - arr[i] >= 0) {
                int subChange;
                if (dp[n - arr[i]] != -1) {
                    subChange = 1 + dp[n - arr[i]];
                } else {
                    subChange = 1 + minCoinChange(n - arr[i], arr, dp);
                }
                if (subChange - 1 != Integer.MAX_VALUE && ans > subChange) {
                    ans = subChange;
                }
            }

        }
        dp[n] = ans;
        return ans;
    }
}
