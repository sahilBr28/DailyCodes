class Solution {
    public void sum(int[] arr, int target, int idx, List<Integer> curr, List<List<Integer>> ans){
        if(target == 0){
            ans.add(new ArrayList<>(curr));
            return;
        }
        if(idx == arr.length || target < 0){
            return;
        }

        curr.add(arr[idx]);
        sum(arr, target - arr[idx], idx, curr, ans);

        curr.remove(curr.size() - 1);
        sum(arr, target, idx+1, curr, ans);

    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        sum(candidates, target, 0, new ArrayList<>(), ans);
        return ans;

    }
}