class Solution {
    public int[][] diagonalSort(int[][] mat) {
        if(mat==null||mat.length<2||mat[0].length<2) return mat;
        int m = mat.length, n=mat[0].length;
        List<List<Integer>> temp = new ArrayList<>();
        for(int j=n-1;j>-1;j--){
            List<Integer> t = new ArrayList<>();
            for(int k=0;j+k<n &&k<m;k++){
                t.add(mat[k][j+k]);
            }
            Collections.sort(t);
            temp.add(t);
        }
        for(int i=1;i<m;i++){
            List<Integer> t = new ArrayList<>();
            for(int k=0;k<n&&i+k<m;k++){
                t.add(mat[i+k][k]);
            }            
            Collections.sort(t);
            temp.add(t);
        }
        int[][] res = new int[m][n];
        int index=0;
        for(int j=n-1;j>-1;j--){
            int t=0;
            for(int k=0;j+k<n &&k<m;k++){
                res[k][k+j] = temp.get(index).get(t++);
            }
            index++;
        }        
        for(int i=1;i<m;i++){
            int t=0;
            for(int k=0;k<n&&i+k<m;k++){
                res[i+k][k] = temp.get(index).get(t++);
            }    
            index++;
        }
        return res;
    }
}