class Solution {
    public boolean canJump(int[] nums) {
        int maxVal = 0;

        for(int i=0;i<nums.length;i++){
            if(i > maxVal){
                return false;
            }
            maxVal = Math.max(maxVal, i+nums[i]);
        }
        return true;
    }
}