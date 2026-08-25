class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int i = 0;
        int j = n-1;
        int leftMax = 0;
        int rightMax = 0;
        int water = 0;

        while(i<j){
            if(height[i] < height[j]){
                if(leftMax<=height[i]){
                    leftMax = height[i];
                }else{
                    water += leftMax-height[i];
                }
                i++;
            }else{
                if(rightMax <= height[j]){
                    rightMax = height[j];
                }else{
                    water += rightMax-height[j];
                }
                j--;
            }
        }
        return water;
    }
}