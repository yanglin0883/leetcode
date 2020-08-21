class Solution {
    Queue<Pair> bfs = new LinkedList<>();
    public int[][] allCellsDistOrder(int R, int C, int r0, int c0) {
        boolean map[][] = new boolean[R][C];
        // ArrayList<Pair> ans = new ArrayList<Pair>();
        int res[][] = new int[R*C][2];
        int index=0;
        Pair root = new Pair(r0, c0);
        // bfs(ans, root, map);
        bfs.offer(root);
        map[r0][c0] = true;
        while(!bfs.isEmpty()){
            Pair temp = bfs.poll();
           // map[temp.x][temp.y] = true;
            res[index][0] = temp.x;
            res[index][1] = temp.y;
            index++;if(index>=res.length)break;
            //System.out.println(index+"  "+res.length);
            addValidToQueue(map, temp);
        }
        // for(int i=0;i<res.length;i++){
        //     res[i][0] = ans.get(i).x;
        //     res[i][1] = ans.get(i).y;
        // }
        return res;
    }
    
    private void addValidToQueue(boolean[][] map, Pair current){
        int[] x = {0,0,-1,1};
        int[] y = {-1,1,0,0};
        for(int i=0;i<4;i++){
                int r = current.x+x[i];
                int c = current.y+y[i];
                if(r<0||r>=map.length||c<0||c>=map[0].length||map[r][c])continue;
            map[r][c] = true;
                bfs.offer(new Pair(r,c));
            }
    }
//     private void bfs(ArrayList<Pair> res, Pair p, boolean[][] map){
//         if(outside(p, map)||map[p.x][p.y]) return;
//         map[p.x][p.y] = true;
//         res.add(p);
//         bfs.offer
//     }
    
    class Pair{
        int x, y;
        Pair(int r, int c){
            x=r;y=c;
        }
    }
}