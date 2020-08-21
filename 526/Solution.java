class Solution {
    public int countArrangement(int N) {
        if(N<1) return 0;
        used = new boolean[N];
        n = N;
        dfs(new ArrayList<Integer>());
        return res;
    }
    int res=0, n;
    boolean[] used;
    void dfs(ArrayList<Integer> path){
        if(path.size()==n) {
            res++;
            System.out.println(path);
            return;
        }
        for(int i=0;i<n;i++){
            if(used[i])continue;
            int a = path.size()+1;
            int b = i+1;
            if(a%b==0||b%a==0){
                //System.out.println(a+"  "+b);
                path.add(b);
                used[i] = true;
                dfs(path);
                used[i] = false;
                path.remove(path.size()-1);
            }
        }
    }
}