class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i< nums.length; i++){
            int n = nums[i];
             map.put(n, map.getOrDefault(n, 0)+1);
        }

        int ans = -1;
        int l = nums.length/2;
        for(int k:map.keySet()){
           int value =  map.get(k);
            if(value > l){
                ans = k;
                break;
            }
        }
        return ans;
     
    }
}
