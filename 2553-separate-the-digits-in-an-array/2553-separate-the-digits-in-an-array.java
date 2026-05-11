class Solution {
    public int[] separateDigits(int[] nums) {
        int n = nums.length;
        List<Integer> ans = new ArrayList<>();
        for(int num : nums){
            if(num<10){
                ans.add(num);
            }else{
                List<Integer> temp = new ArrayList<>();
                while(num>0){
                    temp.add(num%10);
                    num = num/10;
                }

                for(int i=temp.size()-1;i>=0;i--){
                    ans.add(temp.get(i));
                }
            }
        }
        int[] arr = new int[ans.size()];

        for(int i=0;i<ans.size();i++){
            arr[i] = ans.get(i);
        }
        return arr;
    }
}