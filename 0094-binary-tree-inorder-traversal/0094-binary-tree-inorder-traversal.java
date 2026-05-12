class Solution {
    // public void inOrder(TreeNode root, List<Integer> ans){
    //     if(root==null) return;
    //     inOrder(root.left, ans);
    //     ans.add(root.val);
    //     inOrder(root.right, ans);
    // }
    // public List<Integer> inorderTraversal(TreeNode root) {
    //     List<Integer> ans = new ArrayList<>();
    //     inOrder(root, ans);
    //     return ans;
    // }

    //Using Stack:
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();
        TreeNode curr = root;
        while(st.size()>0 || curr != null){
            if(curr != null){
                if(curr.left != null){
                    st.push(curr);
                    curr = curr.left;
                }else{
                    ans.add(curr.val);
                    curr = curr.right;
                }

            }else{
                TreeNode top = st.pop();
                ans.add(top.val);
                curr = top.right;
            }
        }
        return ans;
    }
}