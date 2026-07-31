class Solution {
    public void generateSubset(int[] arr, int idx, List<Integer> subset, List<List<Integer>> ans){
        if(idx == arr.length){
            ans.add(new ArrayList<>(subset));
            return;
        }

        subset.add(arr[idx]);
        generateSubset(arr, idx+1, subset, ans);

        subset.remove(subset.size() - 1);
        generateSubset(arr, idx+1, subset, ans);

    }
    public List<List<Integer>> subsets(int[] nums) {
        int n =nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        generateSubset(nums, 0, new ArrayList<>(), ans);
        return ans;
    }
}