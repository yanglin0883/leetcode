class Solution {
    public int singleNonDuplicate(int[] nums) {
        int res=0;
        for(int i: nums) res^=i;
        return res;
    }
}