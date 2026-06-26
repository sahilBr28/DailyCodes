class Solution {
    public int[] sortedSquares(int[] nums){
        int i = 0, j = nums.length-1;
        int[] arr = new int[nums.length];
        int k = arr.length-1;
        
        while(i<=j){
            int left = nums[i] * nums[i];
            int right = nums[j] * nums[j];
            
            if(left<right){
                arr[k] = right;
                j--;
            }
            else{ //left>right
                arr[k] = left;
                i++;
            }
            k--;
        }
        return arr;
    }
}