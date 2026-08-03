class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[n-k+1];

        if(n==0){
            return ans;
        }

        Deque<Integer> dq = new ArrayDeque<>();
        int idx = 0;

        while(idx < k){
            while(!dq.isEmpty() && nums[dq.peekLast()] <= nums[idx]){
                dq.pollLast();
            }
            dq.offerLast(idx);
            idx++;
        }
        ans[0] = nums[dq.peekFirst()];

        for(int i=1;i<n-k+1;i++){
            if(!dq.isEmpty() && dq.peekFirst() <= (i-1)){
                dq.pollFirst();
            }
            while(!dq.isEmpty() && nums[dq.peekLast()] <= nums[i+k-1]){
                dq.pollLast();
            }
            dq.offerLast(i+k-1);
            ans[i] = nums[dq.peekFirst()];
        }
        return ans;
    }
}