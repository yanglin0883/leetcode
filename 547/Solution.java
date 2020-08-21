class Solution {
    public int findCircleNum(int[][] M) {
        int N = M.length;
        boolean stu[] = new boolean[N];
        int count=0;
        for(int i=0;i<N;i++){
            if(stu[i]) continue;
            stu[i] = true;
            count ++;
            dfs(stu, M, i);
           // print(stu);
        }
        return count;
    }
    private void print(boolean a[] ){
        for(int i=0;i<a.length;i++)
            System.out.print(a[i]);
        System.out.println();
    }
    private void dfs(boolean stu[], int[][] M, int i){
        for(int j=0;j<M.length;j++){
            //System.out.println(i+"   "+j);
            if(M[i][j]==1 && !stu[j]){
                stu[j] = true;
                dfs(stu, M, j);
            }
        }
    }
}