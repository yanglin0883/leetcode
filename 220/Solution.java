class Solution {
    int t=0;
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        this.t = t;
        Integer a = 1;
        a.intValue();
        Set<Integer> s = new TreeSet<Integer>(new MyComparator<Integer>());
        for(int i=0;i<nums.length;i++){
            if(i>k)s.remove(nums[i-k-1]);
            if(!s.add(new Integer(nums[i]))) return true;
        }
        return false;
    }
    private class MyComparator<Integer extends Number> implements Comparator<Integer>{
        public int compare(Integer a, Integer b){
            long c = a.longValue();
            long d = b.longValue();
            if(Math.abs(c-d)<=t) 
                return 0;
            else return c>d?1:-1;
        }
    }
}