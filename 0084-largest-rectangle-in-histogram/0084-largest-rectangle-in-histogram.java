class Solution {
    public int largestRectangleArea(int[] arr) {
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        int maxArea = 0;

        for(int i=0;i<=n;i++){
            int currHeight = (i==n) ? 0 : arr[i];

            while(st.size()>0 && currHeight < arr[st.peek()] ){
                int height = arr[st.pop()];

                int right = i;
                int left = (st.size()==0) ? -1 : st.peek();

                int width = right - left - 1;
                int area = height * width;

                maxArea = Math.max(maxArea, area);
            }
            st.push(i);
        }
        return maxArea;
    }
}