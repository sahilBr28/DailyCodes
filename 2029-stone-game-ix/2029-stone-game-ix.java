class Solution {
    public boolean stoneGameIX(int[] stones) {
        int[] cnt = new int[3];

        for (int stone : stones) {
            cnt[stone % 3]++;
        }

        // If there are no remainder-1 or remainder-2 stones
        if (cnt[1] == 0 && cnt[2] == 0) {
            return false;
        }

        // Odd number of divisible-by-3 stones
        if (cnt[0] % 2 == 1) {
            return Math.abs(cnt[1] - cnt[2]) >= 3;
        }

        // Even number of divisible-by-3 stones
        return cnt[1] > 0 && cnt[2] > 0;
    }
}