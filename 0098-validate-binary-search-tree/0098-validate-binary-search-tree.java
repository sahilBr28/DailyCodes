class Triplet{
    long max;
    long min;
    boolean isBST;
    Triplet(Long max, Long min, boolean isBST){
        this.max = max;
        this.min = min;
        this.isBST = isBST;
    }
}
class Solution {
    public boolean isValidBST(TreeNode root) {
        return maxMin(root).isBST;
    }
    Triplet maxMin(TreeNode root){
        if(root==null) return new Triplet(Long.MIN_VALUE, Long.MAX_VALUE, true);
        Triplet leftSubTree = maxMin(root.left);
        Triplet rightSubTree = maxMin(root.right);
        Long val = (long) root.val;
        Long max = Math.max(val, Math.max(leftSubTree.max, rightSubTree.max));
        Long min = Math.min(val, Math.min(leftSubTree.min, rightSubTree.min));
        boolean isBST = (leftSubTree.isBST && rightSubTree.isBST) && (leftSubTree.max < val && rightSubTree.min > val);
        return new Triplet(max, min, isBST);
    }

}