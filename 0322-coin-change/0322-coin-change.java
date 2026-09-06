class Solution {
    public long coinCount(int idx, int[] coins, int amount, int[][] dp){
        if(idx==coins.length){
            if(amount==0) return 0;
            else return Integer.MAX_VALUE;
        }
        if(dp[idx][amount] != -1) return dp[idx][amount];
        long skip = coinCount(idx+1,coins,amount,dp);
        if(amount-coins[idx]<0) return dp[idx][amount]= (int)skip;
        long take = 1+coinCount(idx,coins,amount-coins[idx],dp);
        return dp[idx][amount]=(int)Math.min(take, skip);
    }
    public int coinChange(int[] coins, int amount) {
        int[][] dp = new int[coins.length][amount+1];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j] = -1;
            }
        }
        int ans = (int)coinCount(0,coins,amount,dp);
        if(ans==Integer.MAX_VALUE) return -1;
        return ans;
    }
}