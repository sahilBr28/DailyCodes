class Solution {
    private int countSubsets(int[] nums, int sum) {
        int[] dp = new int[sum + 1];
        dp[0] = 1;
        
        for (int num : nums) {
            for (int j = sum; j >= num; j--) {
                dp[j] += dp[j - num];
            }
        }
        
        return dp[sum];
    }
    public int findTargetSumWays(int[] nums, int target) {
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }
        
        if (totalSum < Math.abs(target) || (totalSum + target) % 2 != 0) {
            return 0;
        }
        
        int subsetSum = (totalSum + target) / 2;
        return countSubsets(nums, subsetSum);
    }
}