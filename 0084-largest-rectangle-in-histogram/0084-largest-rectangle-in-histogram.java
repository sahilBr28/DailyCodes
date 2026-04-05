class Solution {
    public int largestRectangleArea(int[] arr) {
        int n = arr.length;
        Stack<Integer> st = new Stack<>();

        int[] nge = new int[n];
        nge[n-1] = n;
        st.push(n-1);
        for(int i=n-2;i>=0;i--){
            while(st.size()>0 && arr[st.peek()] >= arr[i]) st.pop();
            if(st.size()==0) nge[i] = n;
            else nge[i] = st.peek();
            st.push(i);
        }

        while(st.size()>0) st.pop();

        int[] pge = new int[n];
        pge[0] = -1;
        st.push(0);
        for(int i=0;i<n;i++){
            while(st.size()>0 && arr[st.peek()] >= arr[i]) st.pop();
            if(st.size()==0) pge[i] = -1;
            else pge[i] = st.peek();
            st.push(i);
        }

        int maxArea = 0;
        for(int i=0;i<n;i++){
            int area = arr[i]*(nge[i]-pge[i]-1);
            maxArea = Math.max(maxArea,area);
        }
        return maxArea;
    }
}