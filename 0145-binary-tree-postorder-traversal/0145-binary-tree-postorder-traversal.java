
class Solution {
    public void Postorder(TreeNode root, List<Integer> ans){
        if(root==null) return;
        Postorder(root.left, ans);
        Postorder(root.right, ans);
        ans.add(root.val);
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        Postorder(root, ans);
        return ans;
    }
}