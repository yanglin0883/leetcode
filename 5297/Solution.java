class Solution {
    public boolean canReach(int[] arr, int start) {
        boolean[] visited = new boolean[arr.length];
        dfs(arr, start, visited);
        for(int i=0;i<visited.length;i++){
            if(arr[i]==0&&visited[i]==true) return  true;
        }
        return false;
    }
    void dfs(int[] arr, int start, boolean[]visited){
        if(start>=arr.length||start<0||visited[start]) return;
        if(arr[start]==0){
            visited[start] = true;
            return;
        }
        visited[start]=true;
        dfs(arr, start+arr[start], visited);
        dfs(arr, start-arr[start], visited);
    }
}