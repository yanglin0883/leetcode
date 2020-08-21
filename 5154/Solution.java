class Solution {
    public int maxValueAfterReverse(int[] nums) {
        if(nums==null||nums.length<2) return 0;
        int value = valueOfArray(nums);
        int maxOfIncrease = 0;
        int[] dif = new int[nums.length+1];
        for(int i=1;i<nums.length;i++){
            dif[i] = Math.abs(nums[i]-nums[i-1]);
        }
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int origin = dif[i]+dif[j+1];
                int current = (j==nums.length-1?0:Math.abs(nums[i]-nums[j+1]))+(i==0?0:Math.abs(nums[i-1]-nums[j]));
                maxOfIncrease = Math.max(maxOfIncrease, current-origin);
            }
        }
        return maxOfIncrease+value;
    }
    int valueOfArray(int[]a){
        int sum=0;
        for(int i=0;i<a.length-1;i++){
            sum+= Math.abs(a[i] - a[i+1]);
        }
        return sum;
    }
}
//time limit exceeded