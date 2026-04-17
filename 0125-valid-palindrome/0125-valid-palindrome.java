class Solution {
    public boolean isPalindrome(String s) {
        String t = "";
        s =s.toLowerCase();

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if((ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9')){
                t += ch;
            }
        }
        int i = 0;
        int j = t.length()-1;
        while(i < j){
            if(t.charAt(i) != t.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}