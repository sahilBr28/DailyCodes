class Solution {
    public int maxArea(int[] arr) {
        int i = 0;
        int j = arr.length-1;
        int height = 0;
        int area = 0;

        while(i<j){
            int width = j-i;
            
            if(arr[i] < arr[j]){
                height = arr[i];
                i++;
            }else{
                height = arr[j];
                j--;
            }

            area = Math.max(area, (height * width));
        }
        return area;
    }
}