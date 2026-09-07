class Solution {
    //Memoization Method
    static int sum;
    public int ways(int idx, int[] arr, int res, int target, int[][] dp){
        if(idx==arr.length){
            if(res==target) return 1;
            else return 0;
        }
        if(dp[idx][res+sum] != -1) return dp[idx][res+sum];
        int add = ways(idx+1,arr,res+arr[idx],target,dp);
        int sub = ways(idx+1,arr,res-arr[idx],target,dp);
        return dp[idx][res+sum] = add+sub;
    }
    public int findTargetSumWays(int[] nums, int target) {
        sum = 0;
        for(int ele : nums) sum += ele;
        int[][] dp = new int[nums.length][2*sum+1];
        for(int i=0;i< dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j] = -1;
            }
        }
        return ways(0,nums,0,target,dp);
    }
}