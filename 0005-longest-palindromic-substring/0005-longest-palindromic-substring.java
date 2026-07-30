class Solution {
    boolean solution(String s, int i, int j){
        if(i>=j){
            return true;
        }
        if(s.charAt(i) == s.charAt(j)){
            return solution(s, i+1, j-1);
        }
        return false;
    }
    public String longestPalindrome(String s) {
        int n = s.length();
        int maxLen = 0;
        int startPoint = 0;

        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if((solution(s, i, j))== true){
                    if(j-i+1 > maxLen){
                        maxLen = j-i+1;
                        startPoint = i;
                    }
                }
            }
        }
        return s.substring(startPoint, startPoint + maxLen);
    }
}