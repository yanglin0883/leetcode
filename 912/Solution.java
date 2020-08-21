class Solution {
    public List<Integer> sortArray(int[] nums) {
        Queue<Integer> queue = new PriorityQueue();
        for(int i:nums) queue.offer(i);
        ArrayList<Integer> res = new ArrayList<>();
        while(!queue.isEmpty()){
            res.add(queue.poll());
        }
        return res;
    }
}