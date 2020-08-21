class Solution {
    public int jump(int[] nums) {
        if(nums==null||nums.length<2) return 0;
        int cur=0;
        int farrest = nums[0];
        int steps=1;
        do{            
            if(farrest>=nums.length-1) return steps;
            int max = farrest;
            for(int i=cur+1;i<=farrest;i++){
                max = Math.max(max, i+nums[i]);
            }
            // System.out.println(farrest+"  "+cur+"  "+max);
            cur = farrest;
            farrest = max;
            steps++;
        }while(cur!=farrest);
        return -1;
    }
}