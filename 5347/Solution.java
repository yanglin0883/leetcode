class Solution {
    public int minCost(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        Queue<Pair> bfs = new LinkedList();
        Set<Pair> visited = new HashSet();
        Pair start = new Pair(0,0);
        dfs(grid, start, bfs, visited);
        int level = 0;
        while(!bfs.isEmpty()){
            int size = bfs.size();
            for(int i=0;i<size;i++){
                Pair temp = bfs.poll();
                if(temp.x==m-1 && temp.y==n-1) return level;
                int[] dX = {0,0,1,-1};
                int[] dY = {1,-1,0,0};
                for(int j=0;j<4;j++){
                    int tempX = dX[j]+temp.x , tempY = dY[j]+temp.y;
                    if(tempX<0||tempY<0||tempX>=m||tempY>=n) continue;
                    Pair p = new Pair(tempX, tempY);
                    if(visited.contains(p)) continue;
                    dfs(grid, p, bfs, visited);
                }
            }
            level++;
        }
        return level;
    }
    
    void dfs(int[][]grid, Pair start, Queue<Pair>bfs, Set<Pair> visited){
        if(start.x<0||start.y<0||start.x>=grid.length||start.y>=grid[0].length) return;
        if(visited.contains(start)) return;
        bfs.offer(start);
        visited.add(start);
        int[] dX ={0,0,0,1,-1};
        int[] dY ={0,1,-1,0,0};
        int dir = grid[start.x][start.y];
        Pair next = new Pair(start.x+dX[dir], start.y+dY[dir]);
        dfs(grid, next, bfs, visited);
    }
    
    class Pair{
        Pair(int x, int y){
            this.x =x; this.y = y;
        }
        int x, y;
        public int hashCode(){
            return 101*x+y;
        }
        public boolean equals(Object o){
            if(o.getClass()!=this.getClass()) return false;
            Pair p = (Pair)o;
            return p.x==this.x && p.y==this.y;
        }
    }
}