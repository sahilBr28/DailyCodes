class Solution {
    //Tabulation Method
    public boolean canPartition(int[] nums){
        int sum = 0;
        for(int ele:nums) sum+=ele;
        if(sum%2 != 0) return false;
        int target = sum/2;
        
        int[][] dp = new int[nums.length][target+1];
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<target+1;j++){
                boolean ans = false;
                boolean skip = (i>0) ? (dp[i-1][j]==1) : (j==0);
                if(j-nums[i]<0) ans = skip;
                else{
                    boolean take = (i>0) ? (dp[i-1][j-nums[i]]==1) : (j==nums[i]);
                    ans = take || skip;
                }
                dp[i][j] = (ans) ? 1:0;
            }
        }
        return (dp[nums.length-1][target]==1);
    }
}