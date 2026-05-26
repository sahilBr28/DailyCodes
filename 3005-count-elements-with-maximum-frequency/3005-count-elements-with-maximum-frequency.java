class Solution {
    public int maxFrequencyElements(int[] nums) {
        int maxFreq = Integer.MIN_VALUE, sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int ele : nums) {
            if (!map.containsKey(ele)) {
                map.put(ele, 1);
            } else {
                map.put(ele, map.get(ele) + 1);
            }
        }
        for (int val : map.values()) {
            if(val > maxFreq){
                maxFreq = val;
                sum = val;
            }
            else if(val == maxFreq){
                sum += val;
            }
        }
        return sum;
    }
}