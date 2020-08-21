class Solution {
    public int[][] matrixBlockSum(int[][] mat, int K) {
        int m=mat.length, n=mat[0].length;
        int[][] res = new int[m][n];
        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++){
                int sum=0;
                for(int a=i-K;a<=i+K;a++){
                    if(a<0||a>=m) continue;
                    for(int b=j-K;b<=j+K;b++){
                        if(b<0||b>=n) continue;
                        //System.out.println(i+"  "+j+"  "+a+"  "+b+""+m+" "+n);
                        sum+=mat[a][b];
                    }
                }
                res[i][j] = sum;
            }
        return res;
    }
}