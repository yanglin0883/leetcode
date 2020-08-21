class Solution {
    public int minDifference(int[] nums) {
        if(nums.length<5)return 0;
        PriorityQueue<Integer> min = new PriorityQueue<>((a,b)->nums[a]-nums[b]);
        PriorityQueue<Integer> max = new PriorityQueue<>((a,b)->nums[b]-nums[a]);
        for(int i=0;i<nums.length;i++){
            max.offer(i);
            min.offer(i);
        }
        int maxN = max.poll(), minN = min.poll();
        for(int i=0;i<3;i++){
            if( nums[maxN]-nums[max.peek()] > nums[min.peek()]-nums[minN]){
                maxN = max.poll();
            }else 
                minN = min.poll();
        }
        return nums[maxN]-nums[minN];
    }
}
//greedy