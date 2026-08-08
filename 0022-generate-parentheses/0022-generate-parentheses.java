class Solution {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> result = new ArrayList<>();
        solve("" , n , 0 , 0 , result);
        return result ; 
    }
    void solve( String curr , int n ,int open , int close,          
                ArrayList<String> result){
        if(curr.length() == 2*n){
            result.add(curr);
            return ;
        }
        if(open < n){
            solve(curr + '(' , n ,open+1 , close , result);
        }
        if(close < open){
            solve(curr + ')' , n ,open , close+1, result);
        }
        
    }
}