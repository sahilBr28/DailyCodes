class Solution {
    public int minPathSum(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i==0 && j==0){
                    continue;
                }
                else if(i==0){
                    arr[i][j] += arr[i][j-1];
                }
                else if(j==0){
                    arr[i][j] += arr[i-1][j];
                }
                else{
                    arr[i][j] += Math.min(arr[i][j-1], arr[i-1][j]);
                }
            }
        }
        return arr[n-1][m-1];
    }
}