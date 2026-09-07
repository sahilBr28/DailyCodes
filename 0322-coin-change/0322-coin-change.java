class Solution {
    //Tabulation Method
    public int coinChange(int[] coins, int amount){
        long[][] dp = new long[coins.length][amount+1];
        for(int i=0;i<coins.length;i++){
            for(int j=0;j<amount+1;j++){
                long skip = (i>0) ? dp[i-1][j] : ((j==0) ? 0 : Integer.MAX_VALUE);
                if(j-coins[i]<0) dp[i][j] = skip;
                else{
                    long take = 1 + dp[i][j-coins[i]];
                    dp[i][j] = Math.min(take, skip);
                }
            }
        }
        int ans = (int) dp[coins.length-1][amount];
        if(ans==Integer.MAX_VALUE) return -1;
        return ans;
    }
}