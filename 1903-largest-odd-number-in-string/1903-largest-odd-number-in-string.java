class Solution {
    public String largestOddNumber(String num) {
        int n = num.length();
        int last = -1;
        for(int i=num.length()-1;i>=0;i--){
            int sub = num.charAt(i)-'0';
            if(sub%2 != 0){
                last = i;
                break;
            }
            
        }
        if(last==-1) return "";
        return num.substring(0,last+1);
    }
}