class Solution {
    public boolean isPanlindrome(String str){
        int left = 0;
        int right = str.length()-1;
        while(left < right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public String longestPalindrome(String s) {
        //STEP 1 - GENERATE ALL SUBSTRS
        int maxLen = 0;
        String ans = "";
        for(int i=0; i<s.length(); i++){
            for(int j=i; j<s.length();j++){
                String substr = s.substring(i,j+1);
                if(isPanlindrome(substr)){
                    if(substr.length()>maxLen){
                        maxLen = substr.length();
                        ans = substr;
                    }
                }
            }
        }
        return ans;
    }
}