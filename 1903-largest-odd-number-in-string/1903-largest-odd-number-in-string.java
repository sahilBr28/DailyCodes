class Solution {
    public String largestOddNumber(String num) {
        int n = num.length();
        int i = num.length()-1;
        while(i>=0){
            int sub = num.charAt(i)-'0';
            if(sub%2==0){
                return num.substring(0, i+1);
            }
            i--;
        }
        return "";
    }
}