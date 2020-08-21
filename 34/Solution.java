class Solution {
    public int[] searchRange(int[] nums, int target) {
        int res[] = {-1,-1};
        int left=0, right=nums.length, mid;
        while(left<right){
            mid = left+(right-left>>1);
            if(nums[mid] == target){
                if(mid==0||nums[mid-1]!=target){
                    res[0] = mid;
                    break;
                }else right = mid;
            }
            else if(nums[mid]<target) left = mid+1;
            else right = mid;
        }
        left=0; right=nums.length;
        while(left<right){
            mid = left+(right-left>>1);
            if(nums[mid] == target){
                if(mid==nums.length-1||nums[mid+1]!=target){
                    res[1] = mid;
                    break;
                }else left = mid+1;
            }
            else if(nums[mid]<target) left = mid+1;
            else right = mid;
        }
        return res;
    }
}