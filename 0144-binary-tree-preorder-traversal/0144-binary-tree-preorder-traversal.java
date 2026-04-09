class Solution {
    public void Preorder(TreeNode root, List<Integer> ans){
        if(root==null) return;
        ans.add(root.val);
        Preorder(root.left, ans);
        Preorder(root.right, ans);
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        Preorder(root, ans);
        return ans;
    }
}