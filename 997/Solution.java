class Solution {
    public int findJudge(int N, int[][] trust) {
        int[][] degree = new int[N+1][2]; // 1st is indegree ; 2nd is outdegree
        for(int i=0;i<trust.length;i++){
            degree[trust[i][0]][1]++;
            degree[trust[i][1]][0]++;
        }
        for(int i=1;i<=N;i++){
            //System.out.println(i+" : "+degree[i][0]+"  "+degree[i][1]);
            if(degree[i][0]==N-1 &&degree[i][1]==0) return i;
        }
        return -1;
    }
}