class Solution {
    int[] getNSR(int[] height){
        Stack<Integer> st = new Stack<>();
        int n = height.length;

        int[] arr = new int[n];
        for(int i=n-1;i>=0;i--){
            if(st.size()==0){
                arr[i] = n;
            }else{
                while(!st.isEmpty() && height[st.peek()]>=height[i]){
                    st.pop();
                }
                if(st.size()==0){
                    arr[i] = n;
                }else{
                    arr[i] = st.peek();
                }
            }
            st.push(i);
        }
        return arr;
    }

    int[] getNSL(int[] height){
        Stack<Integer> st = new Stack<>();
        int n = height.length;

        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            if(st.size()==0){
                arr[i] = -1;
            }else{
                while(!st.isEmpty() && height[st.peek()]>=height[i]){
                    st.pop();
                }if(st.size()==0){
                    arr[i] = -1;
                }else{
                    arr[i] = st.peek();
                }
            }
            st.push(i);
        }
        return arr;

    }
    int findArea(int[] height){
        int[] NSR = getNSR(height);
        int[] NSL = getNSL(height);
        int n = height.length;

        int[] width = new int[n];
        for(int i=0;i<n;i++){
            width[i] = NSR[i]-NSL[i]-1;
        }

        int maxArea = 0;
        for(int i=0;i<n;i++){
            int a = width[i] * height[i];

            maxArea = Math.max(maxArea, a);
        }
        return maxArea;

    }
    public int maximalRectangle(char[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        int[] height = new int[m];
        for(int i=0;i<m;i++){
            height[i] = (matrix[0][i] == '1') ? 1:0;
        }

        int maxArea = findArea(height);

        for(int row=1;row<n;row++){
            for(int col=0;col<m;col++){
                if(matrix[row][col]=='0'){
                    height[col] = 0;
                }else{
                    height[col] += 1;
                }
            }
            maxArea = Math.max(maxArea, findArea(height));
        }
        return maxArea;
    }
}