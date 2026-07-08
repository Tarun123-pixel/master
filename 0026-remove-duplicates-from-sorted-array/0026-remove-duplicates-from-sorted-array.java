class Solution {
    public int removeDuplicates(int[] nums) {
        int i =0 ;
        int N = nums.length;
        for(int j = i+1; j <N ; j++){
            if(nums[j]!= nums[i]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
        
    }
}