class Solution {
    public int[] findRange(int[] bloomDay){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int val : bloomDay){
            min = Math.min(min, val);
            max = Math.max(max, val);
        }

        return new int[]{min, max};
    }

    boolean canMakeBouq(int[] bloomDay, int mid, int k, int m){
        int bouqCount = 0;
        int consecutiveNum = 0;

        for(int i=0;i<bloomDay.length;i++){
            if(bloomDay[i] <= mid){
                consecutiveNum++;
            }else{
                consecutiveNum = 0;
            }

            if(consecutiveNum == k){
                bouqCount++;
                consecutiveNum = 0;
            }
        }

        if(bouqCount >= m){
            return true;
        }
        
        return false;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        if((long)m*k > bloomDay.length){
            return -1;
        }
        int n = bloomDay.length;

        int[] range = findRange(bloomDay);
        int start = range[0];
        int end = range[1];
        int ans = 0;

        while(start <= end){
            int mid = start + (end-start)/2;

            if(canMakeBouq(bloomDay, mid, k, m) == true){
                ans = mid;
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return ans;

    }
}