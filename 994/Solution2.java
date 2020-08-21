class Solution {
    public int orangesRotting(int[][] grid) {
        if(grid==null||grid.length==0||grid[0].length==0) return 0;
        int fresh=0;
        Queue<Pair> bfs = new LinkedList<>();
        for(int i=0;i<grid.length;i++)
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j] == 1) fresh++;
                else if(grid[i][j] == 2) bfs.offer(new Pair(i,j));
            }
        if(fresh==0) return 0;
        int mins=0;
        int direction[][] = {{0,1},{0,-1},{1,0},{-1,0}};
        while(!bfs.isEmpty()){
            mins++;
            int size = bfs.size();
            for(int i=0;i<size;i++){
                Pair temp = bfs.poll();
                for(int j=0;j<4;j++){
                    Pair adj = new Pair(temp.x+direction[j][0], temp.y+direction[j][1]);
                    if(!inBound(adj, grid)) continue;
                    if(grid[adj.x][adj.y] == 1){
                        grid[adj.x][adj.y] =2;
                        bfs.offer(adj);
                        fresh--;
                    }
                }
            }
        }
        if(fresh>0) return -1;
        else return mins-1;
    }
    private boolean inBound(Pair p, int[][] grid){
        if(p.x<0||p.y<0||p.x>=grid.length||p.y>=grid[0].length) return false;
        else return true;
    }
    private class Pair{
        int x,y;
        Pair(int a, int b){
            x=a; y=b;
        }
    }
}