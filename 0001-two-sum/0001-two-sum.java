class Solution {
    public int[] twoSum(int[] nums, int target) {
       HashMap<Integer,Integer> mp = new HashMap<>();
       for (int x=0;  x < nums.length ; x++){
         int needed = target - nums[x];
         if(mp.containsKey(needed)){
            return new int[]{mp.get(needed),x};
         }
         mp.put(nums[x],x);
       }
       return new int[]{};
    }
}