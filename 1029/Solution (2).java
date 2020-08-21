class Solution {
    public int twoCitySchedCost(int[][] costs) {
        Arrays.sort(costs, (a, b)->(Math.abs(b[0]-b[1])-Math.abs(a[0]-a[1])));
        int countA=0, countB=0, n = costs.length/2, res=0;
        for(int i=0;i<costs.length;i++){
            if(countA<n && countB<n){
                if(costs[i][1]<costs[i][0]){
                    countB++;
                    res += costs[i][1];
                }else{
                    countA++;
                    res+= costs[i][0];
                }
            }else if(countA<n){
                res += costs[i][0];
            }else 
                res += costs[i][1];
        }
        return res;
    }
}