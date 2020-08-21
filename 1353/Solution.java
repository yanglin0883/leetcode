class Solution {
    public int maxEvents(int[][] events) {
        Queue<int[]> pq = new PriorityQueue<>((x, y)->{
            return x[1] == y[1] ? x[0] - y[0] : x[1] - y[1];
        });
        Arrays.sort(events, (x, y)->{
            return x[0]==y[0]?x[1]-y[1] : x[0]-y[0];
        });
        int res=0, index=0, day = events[0][0];
        while(day<100001){
            while(index<events.length && events[index][0]<=day)pq.offer(events[index++]);
            while(!pq.isEmpty() && pq.peek()[1]<day) pq.poll();
            if(!pq.isEmpty()){
                res++;
                day++;
                pq.poll();
            }
            else{
                if(index==events.length) return res;
                day = events[index][0];
            }
        }
        return res;
    }
}