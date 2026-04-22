class Solution {
    public List<String> twoEditWords(String[] queries, String[] dictionary) {
        List<String> result = new ArrayList<>();

        for(String qur : queries){
            for(String s : dictionary){
                int diff = 0;
                for(int i=0;i<qur.length();i++){
                    if(s.charAt(i) != qur.charAt(i)){
                        diff++;
                    }
                    if(diff > 2) break;
                }
                if(diff <= 2){
                    result.add(qur);
                    break;
                }
            }
        }
        return result;
    }
}