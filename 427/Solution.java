/*
// Definition for a QuadTree node.
class Node {
    public boolean val;
    public boolean isLeaf;
    public Node topLeft;
    public Node topRight;
    public Node bottomLeft;
    public Node bottomRight;

    
    public Node() {
        this.val = false;
        this.isLeaf = false;
        this.topLeft = null;
        this.topRight = null;
        this.bottomLeft = null;
        this.bottomRight = null;
    }
    
    public Node(boolean val, boolean isLeaf) {
        this.val = val;
        this.isLeaf = isLeaf;
        this.topLeft = null;
        this.topRight = null;
        this.bottomLeft = null;
        this.bottomRight = null;
    }
    
    public Node(boolean val, boolean isLeaf, Node topLeft, Node topRight, Node bottomLeft, Node bottomRight) {
        this.val = val;
        this.isLeaf = isLeaf;
        this.topLeft = topLeft;
        this.topRight = topRight;
        this.bottomLeft = bottomLeft;
        this.bottomRight = bottomRight;
    }
};
*/
class Solution {
    public Node construct(int[][] grid) {
        this.grid = grid;
        return build(0,0,grid.length-1, grid[0].length-1);
    }
    int[][] grid;
    Node build(int startx, int starty, int endx, int endy){
        if(startx==endx && starty==endy){
            return new Node(grid[startx][starty]==1, true);
        }
        boolean allSame=true;
        for(int i=startx;i<=endx;i++){
            for(int j=starty;j<=endy;j++){
               if(grid[i][j]!=grid[startx][starty]) allSame = false;
            }
        }
        if(allSame) return new Node(grid[startx][starty]==1, true);
        int midx = (startx+endx)/2, midy = (starty+endy)/2;
        return new Node(grid[startx][starty]==1, false, 
                       build(startx, starty, midx, midy),
                       build(startx, midy+1, midx, endy),
                       build(midx+1, starty, endx, midy),
                       build(midx+1, midy+1, endx, endy));
    }
}