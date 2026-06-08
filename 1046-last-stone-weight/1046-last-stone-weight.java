class Solution {
    public int lastStoneWeight(int[] stones){
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int ele : stones){
            maxHeap.add(ele);
        }
        while (maxHeap.size()>=2){
            int top = maxHeap.remove();
            int secTop = maxHeap.remove();
            int ans = top - secTop;
            if(ans == 0){
                continue;
            }
            maxHeap.add(ans);
        }
        if(maxHeap.size()==0){
            return 0;
        }
        return maxHeap.peek();
    }
}