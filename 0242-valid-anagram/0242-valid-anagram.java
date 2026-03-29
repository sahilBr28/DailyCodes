class Solution {
    public boolean isAnagram(String s, String t) {
        int n = s.length();
        int m = t.length();
        int[] ans = new int[26];
    
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            int idx = ch - 'a';
            ans[idx]++;
        }

         for(int i=0;i<m;i++){
            char ch = t.charAt(i);
            int idx = ch - 'a';
            ans[idx]--;
        }

        for(int i=0;i<26;i++){
            if(ans[i] != 0) return false;
        }
        return true;
    }
}