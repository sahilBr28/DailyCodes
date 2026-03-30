class Solution {
    public boolean isPowerOfThree(int n) {
        if(n<1){
            return false;
        }
        else{
            double c=(Math.log10(n))/(Math.log10(3));
            int b=(int) c;
            return (b==c);
        }
    }
}