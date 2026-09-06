class Solution {
    public boolean subset(int idx, int[] arr, int target, int[][] dp){
        if(idx==arr.length){
            if(target==0) return true;
            else return false;
        }
        if(dp[idx][target] != -1) return (dp[idx][target] == 1);
        boolean ans = false;
        boolean skip = subset(idx+1,arr,target,dp);
        if(target-arr[idx]<0) ans = skip;
        else{
            boolean take = subset(idx+1,arr,target-arr[idx],dp);
            ans = take || skip;
        }
        dp[idx][target] = (ans) ? 1:0;
        return ans;

    }
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int ele : nums){
            sum += ele;
        }
        if(sum%2 != 0) return false;

        int target = sum/2;
        int n = nums.length;
        int[][] dp = new int[n][sum+1];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j] = -1;
            }
        }
        return subset(0,nums,target,dp);
    }
}