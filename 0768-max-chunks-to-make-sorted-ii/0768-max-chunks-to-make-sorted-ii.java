class Solution {
    public int maxChunksToSorted(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        stack.push(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            int max1 = arr[i];

            while(!stack.isEmpty() && stack.peek() > arr[i]){
              max1 = Math.max(max1 , stack.pop());
            }
           stack.push(max1);
        }
        return stack.size() ;
    }
}