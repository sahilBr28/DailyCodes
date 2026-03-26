class Solution {
    public boolean rotateString(String s, String goal) {
        int n = s.length();
        int m = goal.length();

        if(n != m) return false;
        String ans = s + s;
        if(ans.contains(goal)) return true;
        else return false;
    }
}