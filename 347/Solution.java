class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for(int i=0;i<nums.length;i++)
            if(hm.containsKey(nums[i]))
                hm.put(nums[i], hm.get(nums[i])+1);
            else 
                hm.put(nums[i], 1);
        PriorityQueue<Integer> heap = new PriorityQueue<Integer>((n1, n2)->hm.get(n1)-hm.get(n2));
        for(Integer n: hm.keySet()){
            heap.add(n);
            if(heap.size()>k)
                heap.poll();
        }
        
        List<Integer> res = new LinkedList();
        while(!heap.isEmpty()){
            res.add(heap.poll());
        }
        Collections.reverse(res);
        return res;
    }
}