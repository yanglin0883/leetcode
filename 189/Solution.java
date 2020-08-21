class Solution {
    public void rotate(int[] nums, int k) {
        k = k%nums.length;
        reverse(nums, 0, nums.length);
        reverse(nums, 0, k);
        reverse(nums, k, nums.length);
    }
    
    private void reverse(int[] n, int start, int end){
        end--;
        while(start<end){
            int temp = n[start];
            n[start++] = n[end];
            n[end--] = temp;
        }
    }
}