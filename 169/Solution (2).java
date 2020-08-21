class Solution {
    public int majorityElement(int[] nums) {
        LinkedList<Integer> num = new LinkedList<Integer>();
        for(int i:nums){
            if(num.isEmpty())num.add(i);
            else if(num.get(0)==i) num.add(i);
            else num.remove(0);
        }
        return num.get(0).intValue();
    }
}