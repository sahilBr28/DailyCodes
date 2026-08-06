class Solution {
    public int[] findOriginalArray(int[] changed) {
        int n = changed.length;
        if(n%2 != 0){
            return new int[]{};
        }

        Arrays.sort(changed);
        Map<Integer, Integer> mp = new HashMap<>();

        for(int num : changed){
            mp.put(num, mp.getOrDefault(num, 0)+1);
        }

        int[] ans = new int[n/2];
        int idx = 0;
        for(int num : changed){
            if(mp.get(num) == 0) continue;

            int twice = 2*num;
            if(num == 0){
                if(mp.get(0) < 2){
                    return new int[]{};
                }
            }
            if(!mp.containsKey(twice) || mp.get(twice) == 0){
                return new int[]{};
            }

            ans[idx++] = num;
            mp.put(num, mp.get(num) - 1);
            mp.put(twice, mp.get(twice) - 1);

        }
        return ans;
    }
}