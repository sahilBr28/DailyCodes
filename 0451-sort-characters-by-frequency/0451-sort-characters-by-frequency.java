class Solution {
    public String frequencySort(String s) {
        int n = s.length();
        int[] count = new int[128];
        String ans = "";
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            count[ch]++;
        }

      

        for(int freq = s.length();freq>=1;freq--){
            for(int i=0;i<128;i++){
                if(count[i]==freq){
                    for(int k=0;k<freq;k++){
                        ans += (char)i;
                    }
                }
            }
        }
        return ans;

    }
}