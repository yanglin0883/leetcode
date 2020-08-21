class Solution {
    public int lastStoneWeight(int[] stones) {
        if(stones.length==1) return stones[0];
        Queue<Integer> pq = new PriorityQueue<Integer>((a,b)->b-a);
        for(int i:stones)pq.offer(i);
        while(!pq.isEmpty()){
            if(pq.size()==1) return pq.peek();
            int a = pq.poll();
            int b = pq.poll();
            if(a!=b) pq.offer(Math.abs(a-b));
        }
        return 0;
    }
}