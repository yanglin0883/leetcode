class Solution {
    public int[][] kClosest(int[][] points, int K) {
        PriorityQueue<int[]> heap = new PriorityQueue<>(new Comp());
        for(int i=0;i<points.length;i++){
            heap.offer(points[i]);
        }
        int[][] res = new int[K][];
        for(int i=0;i<K;i++)
            res[i] = heap.poll();
        return res;
    }
    private class Comp implements Comparator<int[]>{
        public int compare(int[]a, int[]b){
            return a[0]*a[0]+a[1]*a[1] - b[0]*b[0]-b[1]*b[1];
        }
    }
}