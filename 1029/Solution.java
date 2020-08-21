class Solution {
    public int twoCitySchedCost(int[][] costs) {
        Arrays.sort(costs, (p1,p2) -> p1[0]-p1[1]-p2[0]+p2[1]);
        int res = 0, n=costs.length/2;
        for(int i=0;i<n;i++)
            res += costs[i][0] + costs[i+n][1];
        return res;
    }
}