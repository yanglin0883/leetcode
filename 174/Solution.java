class Solution {
    public int calculateMinimumHP(int[][] dungeon) {
        dfs(0, 0, dungeon, 0, 0);
        return min+1;
    }
    int min = Integer.MAX_VALUE;
    void dfs(int x, int y, int[][] d, int cur, int red){
        if(x<0||y<0||x>=d.length||y>=d[0].length) return;
        cur+=d[x][y];
        red = Math.min(red, cur);
        // System.out.println(x+"  "+y+"  "+cur+"   "+red);
        if(x==d.length-1 && y==d[0].length-1){
            red = -red;
            min = Math.min(red, min);
            return;
        }
        dfs(x+1, y, d, cur, red);
        dfs(x, y+1, d, cur, red);
    }
}