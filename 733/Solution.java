class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if(image[sr][sc] == newColor) return image;
        dfs(image, sr, sc, image[sr][sc], newColor);
        return image;
    }
    private void dfs(int[][] map, int r, int c, int oldC, int newC){
        if(ouside(map, r, c)) return;
        if(map[r][c] != oldC) return;
        map[r][c] = newC;
        int[] x = {0,0,1,-1};
        int[] y ={1,-1,0,0};
        for(int i=0;i<4;i++)
            dfs(map, r+x[i], c+y[i], oldC, newC);
    }
    
    private boolean ouside(int[][]map, int r, int c ){
        if(r<0||c<0||r>=map.length||c>=map[0].length) return  true;
        else return false;
    }
}
