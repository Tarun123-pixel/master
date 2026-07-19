class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        long low = 1 ;
        long high = 0;
        for(int i =0 ; i < piles.length ; i++){
            high = Math.max(high, piles[i]);
        }
        
        while(low <= high){
            int mid = (int)(low + high)/2;
            long total_hours =0 ;
            for(int j =0 ;  j< piles.length ; j++){
                if(piles[j] % mid == 0 ){
                    total_hours += piles[j] / mid ;
                }
                else{
                    total_hours += (piles[j] / mid )+1;
                }
            }            
            if(total_hours <= h){
                    high = mid -1;
            }
            else{
                low = mid +1;
            }  
        } 
        return (int)low ;
    }   
}