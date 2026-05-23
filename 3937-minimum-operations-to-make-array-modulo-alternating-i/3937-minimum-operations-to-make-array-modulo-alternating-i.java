class Solution {
    public int minOperations(int[] nums, int k) {
        int n = nums.length;
        int[][] cost = new int[n][k];

        for(int i=0;i<n;i++){
            int rem = nums[i]%k;
            for(int j=0;j<k;j++){
                int diff = Math.abs(rem - j);
                cost[i][j] = Math.min(diff, k-diff);
            }
             
        }
        int ans = Integer.MAX_VALUE;

        for(int x=0;x<k;x++){
            for(int y=0;y<k;y++){
                if(x==y) continue;
                int curr = 0;
                for(int i=0;i<n;i++){
                    if(i % 2 == 0){
                        curr += cost[i][x];
                    }else{
                        curr += cost[i][y];
                    }
                }
                ans = Math.min(ans, curr);
            }
            
            
        }
        return ans;
    }
}