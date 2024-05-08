package algorithms.dynamicprogramming;

import java.util.Arrays;

public class LongestIncreasingSubsequence {

    public static int lengthOfLIS(int[] nums) {
    if (nums == null || nums.length == 0) return 0;

    int[] dp = new int[nums.length];
    Arrays.fill(dp, 1);

    for (int i = 1; i < nums.length; i++) {
        for (int j = 0; j < i; j++) {
            if (nums[i] > nums[j]){
                dp[i] = Math.max(dp[i], dp[j] + 1);
            }
        }
    }
    return Arrays.stream(dp).max().orElse(0);
}
    public static void main(String[] args) {
        int[] nums = {5, 1, 2, 4, 3, 7, 8, 10};
        System.out.println("Length of Longest Increasing Subsequence: " + lengthOfLIS(nums));

    }
}

