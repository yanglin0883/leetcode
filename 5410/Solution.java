class Solution {
    public List<Boolean> checkIfPrerequisite(int n, int[][] prerequisites, int[][] queries) {
        boolean[][] d = new boolean[105][105];
        for(int i=0;i<n;i++)
            d[i][i] = true;
        for(int[] i: prerequisites){
            d[i[0]][i[1]] = true;
        }
        for(int k=0;k<n;k++)
            for(int i=0;i<n;i++)
                for(int j=0;j<n;j++)
                    d[i][j] = d[i][j] || (d[i][k]&&d[k][j]);
        List<Boolean> res =  new ArrayList();
        for(int[] e: queries){
            res.add(d[e[0]][e[1]]);
        }
        return res;
    }
}