class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        int min_len = strs[0].length();
        for(int i=0;i<n;i++)
            min_len = Math.min(min_len, strs[i].length());
        int cnt = 0;
        for(int i=0;i<min_len;i++){
            boolean flag = true;
            for(int j=0;j<n;j++){
                if(strs[j].charAt(i) != strs[0].charAt(i)){
                    flag = false;
                    break;
                }
            }
            if(flag)cnt++;
            else break;
        }
        return strs[0].substring(0, cnt);
    }
}