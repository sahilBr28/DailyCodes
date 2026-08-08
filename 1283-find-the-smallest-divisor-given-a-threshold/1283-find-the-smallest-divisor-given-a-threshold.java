class Solution {
    public int sumOfD(int[] arr, int div){
        int sum = 0;

        for(int i=0;i<arr.length;i++){
            sum += (arr[i] + div-1)/div;
        }

        return sum;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int maxVal = Integer.MIN_VALUE;

        for(int val : nums){
            maxVal = Math.max(maxVal, val);
        }

        int low = 1;
        int high = maxVal;
        int ans = -1;

        while(low<=high){
            int mid = low + (high-low)/2;

            if(sumOfD(nums, mid) <= threshold){
                ans = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return ans;
    }
}