class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int idx =0 ;
         
        int[] arr =new int[rows*cols];
        
        for(int i=0 ; i <rows; i++){
            for(int j =0 ; j < cols ; j++){
                arr[idx] = matrix[i][j];
                idx++;
            }
        }
        Arrays.sort(arr);
        return arr[k-1];
    }
}