class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int K) {
        int[][] g = new int[n][n];
        for(int[] i: flights){
            g[i[0]][i[1]] = i[2];
        }
        PriorityQueue<int[]> heap = new PriorityQueue<>((a, b)->a[0]-b[0]);
        heap.offer(new int[]{0, src, K+1});
        
        while(!heap.isEmpty()){
            int[] cur = heap.poll();
            int price = cur[0], place = cur[1], remains = cur[2];
            if(place == dst) return price;
            if(remains>0){
                for(int i=0;i<n;i++)
                    if(g[place][i]>0)
                        heap.offer(new int[]{price+g[place][i], i, remains-1});
            }
        }
        return -1;
    }
}