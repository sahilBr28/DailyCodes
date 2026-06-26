class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        
        int i = 0;
        while(i<n){
            arr[i] = nums[i] * nums[i];
            i++;
        }
        Arrays.sort(arr);
        return arr;
    }
}