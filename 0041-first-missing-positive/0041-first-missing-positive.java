class Solution {
    public int firstMissingPositive(int[] arr) {
        int n = arr.length;
        int i = 0;
        while(i<n){
            int currIdx = arr[i]-1;
            if(arr[i]>0 && arr[i]<=n && arr[i] != arr[currIdx]){
                int temp = arr[i];
                arr[i] = arr[currIdx];
                arr[currIdx] = temp;
            }else{
                i++;
            }
        }
        for( i=0;i<n;i++){
            if(arr[i] != i+1){
                return i+1;
            }
        }
        return n+1;
    }
}