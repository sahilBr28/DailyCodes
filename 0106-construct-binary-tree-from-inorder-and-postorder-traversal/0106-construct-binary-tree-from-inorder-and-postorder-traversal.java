class Solution {
    public TreeNode build(int poLo, int poHi, int inLo, int inHi, int[] inorder, int[] postorder){
        if(poLo>poHi || inLo>inHi) return null;
        int val = postorder[poHi];
        TreeNode root = new TreeNode(val);
        int r = 0;
        for(int i=inLo;i<=inHi;i++){
            if(inorder[i]==val){
                r = i;
                break;
            }
        }
        int cnt = r - inLo;
        root.left = build(poLo, poLo+cnt-1, inLo, r-1, inorder, postorder);
        root.right = build(poLo+cnt, poHi-1, r+1, inHi, inorder, postorder);
        return root;
    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int n = inorder.length;
        return build(0, n-1, 0, n-1, inorder, postorder);
                
    }
}