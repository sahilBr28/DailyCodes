 class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minLen = Integer.MAX_VALUE;
        int n = nums.length;
        int i=0, j=0, sum=0;
        while(j<n){
            sum += nums[j];
            while(sum >= target){
                minLen = Math.min(minLen, j-i+1);
                sum -= nums[i];
                i++;
            }
            j++;
        }
        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
}