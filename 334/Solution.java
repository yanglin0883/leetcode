class Solution {
    public boolean increasingTriplet(int[] nums) {
        if(nums==null||nums.length<3) return false;
        int[] tri = new int[4];
        Arrays.fill(tri, Integer.MAX_VALUE);
        for(int i=0;i<nums.length;i++){
            int j=0;
            for(;j<3;j++)
                if(tri[j]>=nums[i]){break;}
            tri[j] = nums[i];
            // System.out.println(i+"  "+j);
            if(j==2) return true;
        }
        return false;
    }
}