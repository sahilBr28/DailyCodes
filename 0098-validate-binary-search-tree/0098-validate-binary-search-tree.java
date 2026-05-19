class Pair{
    long max;
    long min;
    Pair(Long max, Long min){
        this.max = max;
        this.min = min;
    }
}
class Solution {
    static boolean flag;
    public boolean isValidBST(TreeNode root) {
        flag = true;
        maxMin(root);
        return flag;
        
    }
    Pair maxMin(TreeNode root){
        if(root==null) return new Pair(Long.MIN_VALUE, Long.MAX_VALUE);
        Pair leftSubTree = maxMin(root.left);
        Pair rightSubTree = maxMin(root.right);
        Long val = (long) root.val;
        Long max = Math.max(val, Math.max(leftSubTree.max, rightSubTree.max));
        Long min = Math.min(val, Math.min(leftSubTree.min, rightSubTree.min));
        if(leftSubTree.max >= val || rightSubTree.min <= val){
            flag = false;
        }
        return new Pair(max, min);
    }

}