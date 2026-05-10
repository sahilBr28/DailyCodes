class Solution {
    public String removeKdigits(String num, int k) {
        int n = num.length();
        Stack<Character> st = new Stack<>();

        for(int i=0;i<n;i++){
            char ch = num.charAt(i);
            while(!st.isEmpty() && st.peek()>ch && k>0){
                st.pop();
                k--;
            }
            if(st.size()>0 || ch != '0'){
                st.push(ch);
            }
        }
        while(!st.isEmpty() && k>0){
            st.pop();
            k--;
        }
        
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        sb.reverse();

        return (sb.length()==0) ? "0" : sb.toString();
    }
}