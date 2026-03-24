class Solution {
    public String reverseWords(String s) {
        int n = s.length();
        StringBuilder ans = new StringBuilder();
        StringBuilder temp = new StringBuilder();
    
        for(int i=0;i<=n-1;i++){
            if(i>0 && s.charAt(i)==' ' && s.charAt(i-1)==' '){
                continue;
            }
            if(s.charAt(i)==' '){
                ans.insert(0, temp.toString());
                temp.setLength(0);  
                ans.insert(0, " ");
            }else{
                temp.append(s.charAt(i));   
            }
        }
        ans.insert(0, temp.toString());
        return ans.toString().trim();
    }
}