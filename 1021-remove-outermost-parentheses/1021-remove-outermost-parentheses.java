class Solution {
    public String removeOuterParentheses(String s) {
        String st = "";
        int count = 0;
        int start = 0;

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);

            if(ch=='('){
                count++;
            }else{
                count--;
            }

            if(count==0){
                st += s.substring(start+1, i);
                start = i+1;
            }
        }
        return st;
    }
}