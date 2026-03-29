class Solution {
    public boolean isIsomorphic(String s, String t) {
        int n = s.length();
        int m = t.length();

        if(n != m) return false;

        int[] count1 = new int[128];
        int[] count2 = new int[128];

        for(int i=0;i<n;i++){
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);

            if(count1[ch1] != 0 && count1[ch1] != ch2) return false;
            if(count2[ch2] != 0 && count2[ch2] != ch1) return false;

            count1[ch1] = ch2;
            count2[ch2] = ch1;
        }
        return true;
    }
}