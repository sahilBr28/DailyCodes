class Solution {
    public int mirrorDistance(int n) {
        int x = n;
        int rev = 0;
        while(n != 0){
            int d = n % 10;
            if(rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) return 0;
            rev = rev * 10 + d;
            n = n/10;
        }
        return Math.abs(x-rev);
    }
}