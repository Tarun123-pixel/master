class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        solve(new ArrayList<Integer>() ,nums , 0 , ans );
        return ans;
    }
    void solve(List<Integer> current , int[] nums , int index , List<List<Integer>> ans){
        if(index == nums.length){
            ans.add(new ArrayList<>(current));
            return ; 
        }
        current.add(nums[index]);
        solve(current , nums , index+1 , ans);
        current.remove(current.size()-1);
        

        solve(current , nums , index+1 , ans);
    }

}