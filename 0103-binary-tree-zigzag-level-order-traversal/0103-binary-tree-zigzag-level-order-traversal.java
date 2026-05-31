class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null) return ans;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        boolean leftToRight = true;
        while(!q.isEmpty()){
            int size = q.size();
            int[] temp = new int[size];

            for(int i=0;i<size;i++){
                TreeNode front = q.poll();
                
                
                int index = leftToRight ? i : size-i-1;
                temp[index] = front.val;

                if(front.left != null) q.add(front.left);
                if(front.right != null) q.add(front.right);
            }
            leftToRight = !leftToRight;

            List<Integer> currLevel = new ArrayList<>();
            for(int val : temp){
                currLevel.add(val);
            }
            ans.add(currLevel);
        }
        return ans;
    }
}