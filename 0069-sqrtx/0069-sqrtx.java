class Solution {
    public int mySqrt(int x) {
        int ans = 1;

        while((long)ans * ans <= x){
            ans++;
        }
        return ans-1;
    }
}