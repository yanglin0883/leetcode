class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        if(n<1||n==2||n==3) return res;
        this.n = n;
        dfs(new ArrayList<Integer>(), res);
        return res;
    }
    int n;
    void dfs(ArrayList<Integer> path, List<List<String>> res){
        if(path.size()== n){
            res.add(toMap(path));
            return;
        }
        for(int i=0;i<n;i++){
            if(path.contains(i)) continue;
            path.add(i);
            if(permitted(path))dfs(path, res);
            path.remove(path.size()-1);
        }
    }
    
    List<String> toMap(ArrayList<Integer> path){
        //System.out.println("result: "+path);
        List<String> res= new ArrayList<>();
        char[] line = new char[n];
        for(int i=0;i<n;i++){
            Arrays.fill(line, '.');
            line[path.get(i)] = 'Q';
            res.add(new String(line));
        }
        return res;
    }
    
    boolean permitted(ArrayList<Integer> path){
        //System.out.println(path+" started:");
        int m = path.size();
        for(int i=0;i<m;i++){
            int ele = path.get(i);
            //System.out.println(path.get(i)+" :");
            for(int j=1;j+i<m;j++){
                int temp = path.get(j+i);
                if(temp == j+ele ||temp == ele-j) return false;
            }
        }
        return true;
    }
}