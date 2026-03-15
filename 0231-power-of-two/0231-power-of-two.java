class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==1){
            return true;
        }
        if(n%2==0){
            while(n>0){
                n = n / 2;
                if(n == 1){
                    return true;
                }
                if(n%2 != 0){
                    return false;
                }
            }
        }
        return false;
    }
}