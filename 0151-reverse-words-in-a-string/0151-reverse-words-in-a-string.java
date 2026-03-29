class Solution {
    public String reverseWords(String s) {
        int n = s.length();
        String ans = "";
        String temp = "";

        int i = n-1;
        while(i>=0){

            if(s.charAt(i)==' '){
                if(temp.length()>0)
                ans += temp + " ";
                temp = "";
            }else{
                temp = s.charAt(i) + temp;
            }
            i--;
        }
        if(temp.length()>0){
            ans += temp;
        }
        return ans.trim();
    }
}