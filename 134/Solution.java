class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int sum=0;
        for(int i=0;i<gas.length;i++)
            sum+=gas[i]-cost[i];
        if(sum<0) return -1;
        int g = gas[0]-cost[0], s=0;
        for(int i=1;i<gas.length;i++){
            if(g>=0)
                g+=gas[i]-cost[i];
            else {
                g= gas[i]-cost[i];
                s = i;
            }
        }
        return s;
    }
}