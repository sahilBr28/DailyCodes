class Solution {
    public int pathSum(int[][] arr, int i, int j, int[][] dp){
        if(i<0 || j<0) return Integer.MAX_VALUE;
        if(i==0 && j==0) return arr[0][0];
        if(dp[i][j] != -1) return dp[i][j];
        int rightSum = pathSum(arr, i, j-1, dp);
        int downSum = pathSum(arr, i-1, j, dp);
        return dp[i][j] = arr[i][j] + Math.min(rightSum, downSum);
    }
    public int minPathSum(int[][] arr){
        int n = arr.length, m = arr[0].length;
        int[][] dp = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                dp[i][j] = -1;
            }
        }
        dp[0][0] = arr[0][0];
        return pathSum(arr, n-1,m-1,dp);
    }
}