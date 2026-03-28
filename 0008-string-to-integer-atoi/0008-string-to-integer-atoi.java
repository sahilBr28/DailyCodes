class Solution {
    public int myAtoi(String s) {
        if(s==null) return 0;
        s = s.trim();
        int  n= s.length();
        if(n==0) return 0;
        long ans = 0;
        int sign = +1;

        if(s.charAt(0)=='-') sign = -1;
        
        int Max = Integer.MAX_VALUE, Min = Integer.MIN_VALUE;

        int i = (s.charAt(0)=='+' || s.charAt(0)=='-') ? 1 : 0;
        while(i<n){
            if(s.charAt(i)==' ' || !Character.isDigit(s.charAt(i))) break;
            ans = ans * 10 + (s.charAt(i)-'0');

            if(sign==-1 && -1 * ans<Min) return Min;
            if(sign==1 && ans>Max) return Max;

            i++;
        }
        return(int)(sign*ans);
    }
}