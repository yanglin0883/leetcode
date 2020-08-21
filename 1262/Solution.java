class Solution {
    public int maxSumDivThree(int[] nums) {
        Queue<Integer> n[] = new Queue[3];
        for(int i=0;i<3;i++)
            n[i] = new PriorityQueue<>();
        int sum=0;
        for(int i:nums){
            n[i%3].offer(i);
            sum+=i;
        }
        if(sum%3==0) return sum;
        else if(sum%3==1) {
            int a = 0, b=0;
            if(n[1].size()>0) a = sum-n[1].poll();
            if(n[2].size()>1) b = sum-n[2].poll()-n[2].poll();
            return Math.max(a,b);
        }
        else {
            int a = 0;
            if(n[1].size()>1)a=sum-n[1].poll()-n[1].poll();
            int b = 0;
            if(n[2].size()>0) b = sum-n[2].poll();
            return Math.max(a,b);
        }
    }
}