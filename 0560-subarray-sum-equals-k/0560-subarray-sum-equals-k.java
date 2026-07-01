class Solution {
    public int subarraySum(int[] nums, int k) {
        int ans =0 ;
        int N = nums.length;
        for(int i =0 ; i < N ; i++){
            int sum =0 ;
            for(int j =i ; j < N ; j++){
                sum += nums[j];
                if(sum == k){
                    ans++;
                }
            }
        }
        return ans ;
    }
}