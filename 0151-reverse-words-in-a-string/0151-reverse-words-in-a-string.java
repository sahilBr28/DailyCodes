class Solution {
    public String reverseWords(String s) {
        int n = s.length();
        String ans = "";
        String temp = "";

        for(int i=0;i<=n-1;i++){
            if(i>0 && s.charAt(i)==' ' && s.charAt(i-1)==' '){
                continue;
            }
            if(s.charAt(i)==' '){
                ans = temp + ans;
                temp = "";
                ans = " " + ans;
            }else{
                temp += s.charAt(i);
            }
        }
        ans = temp + ans;
        return ans.trim();
    }
}