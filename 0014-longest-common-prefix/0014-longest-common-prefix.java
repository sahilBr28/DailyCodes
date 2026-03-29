class Solution {
    public String longestCommonPrefix(String[] s) {
        int n = s.length;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            min = Math.min(min, s[i].length());
        }
        int count = 0;
        for(int i = 0;i<min; i++){
            boolean flag = true;
            for(int j=0;j<n;j++){
                if(s[j].charAt(i) != s[0].charAt(i)){
                    flag = false;
                    break;
                }
            }
            if(flag==true) count++;
            else break;
        }
        return s[0].substring(0,count);
    }
}