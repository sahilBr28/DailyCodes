class Solution {
    public int[] nextGreaterElements(int[] arr) {
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        
        for(int i=n-1;i>=0;i--){
            st.push(arr[i]);
        }

        int[] ans = new int[n];
        for(int i=n-1;i>=0;i--){
            while(st.size()>0 && st.peek()<=arr[i]) st.pop();
            if(st.size()==0) ans[i] = -1;
            else ans[i] = st.peek();
            st.push(arr[i]);
        }
        return ans;
    }
}