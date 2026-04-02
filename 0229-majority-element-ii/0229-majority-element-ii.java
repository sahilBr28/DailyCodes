class Solution {
    public List<Integer> majorityElement(int[] arr) {
        int n = arr.length;
        List<Integer> ans = new ArrayList<>(n/3);
        
        for(int i=0;i<n;i++){
            int count = 0;
            for(int j=i;j<n;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count > n/3 && !ans.contains(arr[i])){
                ans.add(arr[i]);
            }
        }
        return ans;
        
    }
}