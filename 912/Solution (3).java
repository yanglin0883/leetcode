class Solution {
    public int[] sortArray(int[] nums) {
        sort(nums, 0, nums.length-1);
        return nums;
    }
    void sort(int[] nums, int left, int right){
        if(left>=right) return ;
        if(left+1==right) {
            if(nums[left]>nums[right]) {
                int temp = nums[left];nums[left]=nums[right];nums[right]=temp;
            }
            return;
        }
        int mid = left+right>>1;
        // System.out.println(left+"  "+mid+"  "+right);
        int[]l = Arrays.copyOfRange(nums, left, mid);
        int[]r = Arrays.copyOfRange(nums, mid, right+1);
        sort(l, 0, l.length-1);
        sort(r, 0, r.length-1);
        // System.out.println(Arrays.toString(l));
        // System.out.println(Arrays.toString(r));
        int i=left,j=0,k=0;
        while(i<=right && j<l.length && k<r.length){
            if(l[j]<r[k])nums[i++] = l[j++];
            else nums[i++] = r[k++];
        }
        while(j<l.length) nums[i++] = l[j++];
        while(k<r.length) nums[i++] = r[k++];
    }
}