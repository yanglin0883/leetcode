class Solution {
    public void sortColors(int[] nums) {
        int p=0, l=0, r=nums.length-1;
        while(p<=r){
            if(nums[p]==0){
                swap(nums, p,l);
                p++;l++;
            }
            else if(nums[p]==1){
                p++;
            }
            else{
                swap(nums,p,r);
                r--;
            }
            //System.out.println(l+" : "+nums[l]+"  "+p+" : "+nums[p]+"  "+r+" : "+nums[r]);
        }
    }
    private void swap(int[] n, int a, int b){
        int temp = n[a];
        n[a]=n[b];
        n[b]=temp;
    }
}