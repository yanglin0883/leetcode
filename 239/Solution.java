class Solution {
    public int[] maxSlidingWindow(int[] n, int k) {
        if(n==null||k>n.length) return null;
        Integer[] nums = new Integer[n.length];
        for(int i=0;i<n.length;i++) nums[i] = n[i];
        int[] res = new int[nums.length-k+1];
        int index=0;
        Queue<Integer> heap = new PriorityQueue<Integer>((a, b)->b-a);
        int i=0;
        for(;i<k;i++){
            heap.offer(nums[i]);
        }
        res[index++] = heap.peek();
        for(;i<nums.length;i++){
            heap.offer(nums[i]);
            heap.remove(nums[i-k]);
            res[index++] = heap.peek();
            // System.out.println(i+" : "+heap);
        }
        return res;
    }
}