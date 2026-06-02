class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int[] tushar = new int[2];
        for(int i=0; i<=n-2; i++){
            for(int j=i+1; j<=n-1; j++){
                if(nums[i]+nums[j]==target){
                    tushar[0] = i;
                    tushar[1] = j;
                }
            }
        }
        return tushar;
    }
}