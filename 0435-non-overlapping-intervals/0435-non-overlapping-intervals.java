class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0],b[0]));
        int i =0 ;
        int end = intervals[i][1];
        int count = 0;
        for( i =1 ; i < intervals.length ; i++){
            if(intervals[i][0] < end){
                count ++;

                end = Math.min(intervals[i][1] , end);
            }
            else{
                end = intervals[i][1];

            }
        }
        return count ;

    }
}