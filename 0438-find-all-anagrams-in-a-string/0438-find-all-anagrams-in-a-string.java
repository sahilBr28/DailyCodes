class Solution {

    boolean allZero(int[] arr){
        for(int i : arr){
            if(i != 0){
                return false;
            }
        }
        return true;
    }
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        int[] arr = new int[26];
        int n = s.length(), k = p.length();

        for(int i=0; i<k; i++){
            char ch = p.charAt(i);
            arr[ch-'a']++;
        }

        int i=0, j=0;
        while(j<n){
            arr[s.charAt(j)-'a']--;

            if(j-i+1 == k){
                if(allZero(arr)){
                    ans.add(i);
                }
                arr[s.charAt(i)-'a']++;
                i++;
            }
            j++;
        }
        return ans;
    }
}