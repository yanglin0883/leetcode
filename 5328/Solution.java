class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int[][] rows = new int[mat.length][2];
        for(int i=0;i<mat.length;i++){
            rows[i][1] = i;
            for(int j=0;j<mat[i].length;j++){
                rows[i][0] += mat[i][j];
            }
        }
        Arrays.sort(rows, (p1, p2)->p1[0] - p2[0]);
        int[] res = new int[k];
        for(int i=0;i<k;i++)
            res[i] = rows[i][1];
        return res;
    }
}