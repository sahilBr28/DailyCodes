class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        
        int sum = 0;
        for(int i : nums){
            sum += i;
        }

        int currSum = 0;

        for(int i=0;i<n;i++){
            int lastSum = currSum;
            int totalSum = sum - currSum -nums[i];

            if(lastSum == totalSum){
                return i;
            }

            currSum += nums[i];
        }
        return -1;



        
    }
}