class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] num = new int[26];
        for(char c:tasks){
            num[c-'A']++;
        }
        Arrays.sort(num);
        int f= num[25]-1;//number of gaps
        int idle =  f *n;
        for(int i=num.length-2;i>=0 && idle>0;i--)
            idle -= Math.min(f, num[i]);
        if(idle<0) idle=0;
        return idle + tasks.length;
    }
}