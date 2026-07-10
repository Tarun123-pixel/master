class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int ele  : stones){
            pq.add(ele);
        }
        
        while(pq.size() > 1){
            int max = pq.poll();
            int second_max = pq.poll();
            if(max > second_max){
                pq.add(max - second_max);
            }
            // 
        }
        if(pq.size() == 0){
            return 0;
        }
        return pq.poll();
    }
}