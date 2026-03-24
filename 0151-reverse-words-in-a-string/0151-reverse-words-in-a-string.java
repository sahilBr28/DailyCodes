class Solution {
    public String reverseWords(String s) {
        int n = s.length();
        s = s.trim();
        String parts[] = s.split(" ");
        // System.out.println(Arrays.toString(parts));
        String ans = "";
        for(int i=parts.length-1;i>=0;i--){
            if(parts[i] == "") continue; 
            ans = ans + parts[i];
            if(i!=0) ans += " ";
        }
        return ans;
    }

}