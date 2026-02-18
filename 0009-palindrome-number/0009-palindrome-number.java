class Solution {
    public boolean isPalindrome(int x) {
        String n = String.valueOf(x);
        int i = 0;
        int j = n.length()-1;

        while(i<j){
            if(n.charAt(i)!=n.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
    return true;
    }
}
