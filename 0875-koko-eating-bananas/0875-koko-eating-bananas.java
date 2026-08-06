class Solution {
    boolean canEatAll(int[] piles, int mid, int h){
        long actualHours = 0;

        for(int x:piles){
            actualHours += x/mid;

            if(x%mid != 0){
                actualHours++;
            }
        }
        if(actualHours <= h){
            return true;
        }
        return false;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;

        int i=1;
        int j=0;
        for(int x : piles){
            j = Math.max(j, x);
        }

        while(i < j){
            int mid = i+(j-i)/2;

            if(canEatAll(piles, mid, h)){
                j = mid;
            }else{
                i = mid+1;
            }
        }
        return i;
    }
}