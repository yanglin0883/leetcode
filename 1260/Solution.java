class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        for(int i=0;i<grid.length;i++){
            ArrayList<Integer> temp = new ArrayList<Integer>();
            for(int j=0;j<grid[0].length;j++){
                temp.add(grid[i][j]);
            }
            res.add(temp);
        }
        for(int i=0;i<k;i++)
            doit(res);
        return res;
    }
    private void doit(List<List<Integer>> g){
        for(int i=1;i<g.size();i++)
            g.get(i).add(0,g.get(i-1).get(g.get(i-1).size()-1));
        g.get(0).add(0,g.get(g.size()-1).get(g.get(g.size()-1).size()-1));
        for(int i=0;i<g.size();i++)
            g.get(i).remove(g.get(i).size()-1);
    }
}