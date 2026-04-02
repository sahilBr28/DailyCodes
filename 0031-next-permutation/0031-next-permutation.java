class Solution {
    public void nextPermutation(int[] arr){ 
        int n = arr.length;
        int idx = -1;

        for(int i=n-1;i>0;i--){
            if(arr[i] > arr[i-1]){
                idx = i-1;
                break;
            }
        }

        if(idx != -1){
            int newIdx = idx;

            for(int j=n-1;j>=idx+1;j--){
                if(arr[j] > arr[idx]){
                    newIdx = j;
                    break;
                }    
            }
            int temp = arr[idx];
            arr[idx] = arr[newIdx];
            arr[newIdx] = temp;
        }
        int i = idx+1;
        int j = n-1;

        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }

    }
}