class Solution {
    public int ways(int idx, int[] arr, int target){
        if(idx==arr.length){
            if(target==0) return 1;
            else return 0;
        }
        int add = ways(idx+1,arr,target-arr[idx]);
        int sub = ways(idx+1,arr,target+arr[idx]);
        return add+sub;
    }
    public int findTargetSumWays(int[] arr, int target) {
        return ways(0,arr,target);
    }
}