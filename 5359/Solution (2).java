class Solution {
    public int maxPerformance(int n, int[] speed, int[] efficiency, int k) {
        int[][] data = new int[n][2];
        for(int i=0;i<n;i++){
            data[i][0] = speed[i];
            data[i][1] = efficiency[i];
        }
        Arrays.sort(data, (p1,p2)->p2[1]-p1[1]);
        Queue<Integer> pq = new PriorityQueue<>();
        long sum=0,res = 0;
        for(int i=0;i<n;i++){
            sum+=data[i][0];
            pq.offer(data[i][0]);
            if(pq.size()>k) sum-=pq.poll();
            res = Math.max(res, sum*data[i][1]);
        }
        return (int)(res%1000000007);
    }
}