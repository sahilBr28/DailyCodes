class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        List<List<Integer>> ans = new ArrayList<>();
        HashMap<Integer, Integer> lost_map = new HashMap<>();

        for(int i=0; i<matches.length; i++){
            int loss = matches[i][1];
            if(lost_map.containsKey(loss)){
                lost_map.put(loss, lost_map.get(loss)+1);
            }else{
                lost_map.put(loss, 1);
            }
        }

        List<Integer> zero_loss = new ArrayList<>();
        List<Integer> one_loss = new ArrayList<>();

        for(int i=0; i<matches.length; i++){
            int win = matches[i][0];
            int loss = matches[i][1];

            if(!lost_map.containsKey(win)){
                zero_loss.add(win);
                lost_map.put(win, 2);
            }
            if(lost_map.get(loss) == 1){
                one_loss.add(loss);
            }
        }
        Collections.sort(zero_loss);
        Collections.sort(one_loss);

        ans.add(zero_loss);
        ans.add(one_loss);

        return ans;
    }
}