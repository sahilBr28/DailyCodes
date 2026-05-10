class Solution {
    public int compress(char[] chars) {
        int n = chars.length;

        int idx = 0;
        int i = 0;
        while(i<n){
            char curr_ch = chars[i];
            int count = 0;

            while(i<n && chars[i]==curr_ch){
                count++;
                i++;
            }

            chars[idx] = curr_ch;
            idx++;

            if(count > 1){
                String str = Integer.toString(count);
                for(char ch : str.toCharArray()){
                    chars[idx] = ch;
                    idx++;
                }
            }
        }

        return idx;
    }
}