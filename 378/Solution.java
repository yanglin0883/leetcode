class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                pq.offer(matrix[i][j]);
            }
        }
        for(int i=1;i<k;i++)
            pq.poll();
        return pq.poll().intValue();
    }
}