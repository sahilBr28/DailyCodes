class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        int n = asteroids.length;
        Stack<Integer> st = new Stack<>();

        for(int a : asteroids){
            while(!st.isEmpty() && a < 0 && st.peek() > 0){
                int size = a + st.peek();

                if(size < 0){
                    st.pop();
                }else if(size > 0){
                    a = 0;
                }else{
                    st.pop();
                    a = 0;
                }
            }
            if(a != 0){
                st.push(a);
            }
        }
        int s = st.size();
        int[] ans = new int[s];

        int i = s-1;
        while(!st.isEmpty()){
            ans[i] = st.peek();
            st.pop();
            i--;
        }
        return ans;
    }
}