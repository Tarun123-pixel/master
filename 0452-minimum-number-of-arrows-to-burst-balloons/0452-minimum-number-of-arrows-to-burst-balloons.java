class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points,(a,b)-> Integer.compare(a[0],b[0]));
        int i =0 ;
        int end = points[i][1];
        int arrows_used = 1;
        for( i=1 ; i < points.length ; i++){
            if(points[i][0] <= end){
                end = Math.min(end, points[i][1]);
            }
            else{
                end = points[i][1];
                arrows_used++;
            }
        }
        return arrows_used;
    }
}