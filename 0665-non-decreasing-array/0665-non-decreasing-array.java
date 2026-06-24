class Solution {
    public boolean checkPossibility(int[] nums) {
        int position = -1;

        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                if(position != -1){
                    return false;
                }
                position = i;
            }
        }
        return position == -1 || position==0 || position==nums.length-2 || nums[position-1] <= nums[position+1] || nums[position] <= nums[position+2];
    }
}