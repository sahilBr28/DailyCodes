class Solution {
    public int[] rearrangeArray(int[] arr) {
        int n = arr.length;
        int positiveNum = 0;
        int negativeNum = 1;
        int[] ans = new int[n];

        for(int i=0;i<n;i++){
            if(arr[i] > 0){
                ans[positiveNum] = arr[i];
                positiveNum += 2;
            }else{
                ans[negativeNum] = arr[i];
                negativeNum += 2;
            }
        }
        return ans
        ;
    }
}