class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int mult = 1;
        int zero = 0;
        for(int i=0;i<n;i++){
            if(nums[i]==0) zero++;
            else mult = mult * nums[i];
        }
        for(int j=0;j<n;j++){
            if(zero > 1) ans[j]=0;
            else if(zero==1 && nums[j] != 0) ans[j] = 0;
            else if(zero==1 && nums[j] == 0) ans[j] = mult;
            else 
                ans[j] = mult/nums[j];
        }
        return ans;

    }
}